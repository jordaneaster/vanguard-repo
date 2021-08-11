package org.vanguardhealth.healthyresponse.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.vanguardhealth.healthyresponse.models.CopingMechanism;
import org.vanguardhealth.healthyresponse.models.Mood;
import org.vanguardhealth.healthyresponse.models.User;
import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;
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

    @GetMapping("users/{userId}/coping/{copingId}")
    public CopingMechanism getUserByCoping(@PathVariable Long userId, @PathVariable Long copingId){
        User foundUser = userRepo.findById(userId).get();
        Optional<CopingMechanism> copingMechanismOpt = copingRepo.findById(copingId);
        if(copingMechanismOpt.isPresent()){
            foundUser.getCopingMechanism();
        }

return foundUser.getCopingMechanism();
    }
    @PostMapping(value = "/create_user_profile")
    public Iterable<User> createUserProfile(@RequestBody String body)throws JSONException{
        JSONObject newUser = new JSONObject(body);
        String userName = newUser.getString("userName");
        String password = newUser.getString("password");

//        Mood mood = (Mood) newUser.get("mood");
//        Trigger trigger = (Trigger) newUser.get("trigger");
//        CopingMechanism copingMechanism = (CopingMechanism) newUser.get("copingMechanism");
        Optional<User> optionalUser = userRepo.findByUserName(userName);

        if(optionalUser.isEmpty()){
            User userToAdd = new User(userName,password);
            userRepo.save(userToAdd);
        }
        return userRepo.findAll();

    }

}
