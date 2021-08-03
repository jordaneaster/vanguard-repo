package org.vanguardhealth.healthyresponse.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.vanguardhealth.healthyresponse.models.CopingMechanism;
import org.vanguardhealth.healthyresponse.models.Mood;
import org.vanguardhealth.healthyresponse.models.Trigger;
import org.vanguardhealth.healthyresponse.models.User;
import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;
import javax.swing.text.html.Option;
import java.util.Optional;

@CrossOrigin
@RestController
public class UserController {

    @Resource
    private UserRepo userRepo;
    @Resource
    private CopingMechanismRepo copingRepo;
    @Resource
    private ResultRepo resultRepo;
    @Resource
    private ConsequenceRepo consequenceRepo;
    @Resource
    private TriggerRepo triggerRepo;
    @Resource
    private MoodRepo moodRepo;


    @GetMapping("/users")
    public Iterable<User> getUsers(){
        return userRepo.findAll();
    }
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id){
        return userRepo.findById(id).get();
    }
    @PostMapping("/users/{id}/mood/{moodId}")
    public String getUserCoping(@PathVariable Long id,@PathVariable Long moodId){
        Optional<Mood> moodToAddOpt = moodRepo.findById(moodId);
        Mood moodToAdd = moodToAddOpt.get();

        Optional<User> userToAddMoodToOpt = userRepo.findById(id);
        User userToAddMoodTo = userToAddMoodToOpt.get();
        userToAddMoodTo.addMood(moodToAdd);

        return "redirect:/user/" +id;
    }
    @PostMapping(value = "/create_user_profile")
    public Iterable<User> createUserProfile(@RequestBody String body)throws JSONException{
        JSONObject newUser = new JSONObject(body);
        String userName = newUser.getString("userName");
        String password = newUser.getString("password");
        int age = newUser.getInt("age");
        String mood = newUser.getString("mood");
        Mood moodSelected = moodRepo.findByMood(mood);
        String trigger = newUser.getString("trigger");
        Trigger triggerSelected = triggerRepo.findByName(trigger);
        String copingMechanism = newUser.getString("copingMechanism");
        CopingMechanism copingMechanismSelected = copingRepo.findByTitle(copingMechanism);
//        CopingMechanism copingMechanism = (CopingMechanism) newUser.get("copingMechanism");
        Optional<User> optionalUser = userRepo.findByUserName(userName);

        if(optionalUser.isEmpty()){
            User userToAdd = new User(userName,password,age);
            userRepo.save(userToAdd);
        }
        return userRepo.findAll();

    }

}
