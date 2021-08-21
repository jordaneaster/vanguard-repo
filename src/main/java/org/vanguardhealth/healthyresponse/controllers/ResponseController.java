package org.vanguardhealth.healthyresponse.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.vanguardhealth.healthyresponse.models.CopingMechanism;
import org.vanguardhealth.healthyresponse.models.Mood;
import org.vanguardhealth.healthyresponse.models.Response;
import org.vanguardhealth.healthyresponse.models.Trigger;
import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
public class ResponseController {
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
    @Resource
    private ResponseRepo responseRepo;

    @GetMapping("/responses")
    public Iterable<Response> getResponses(){
        return responseRepo.findAll();
    }
    @GetMapping("/response/{id}")
    public Response getResponse(@PathVariable Long id){
        return responseRepo.findById(id).get();
    }

    @PostMapping("/send_response")
    public Iterable<Response> postResponse(@RequestBody String body)throws JSONException{
        JSONObject newResponse = new JSONObject(body);
        String mood = newResponse.getString("mood");
        Mood moodSelected = moodRepo.findByMood(mood);
        String trigger = newResponse.getString("trigger");
        Trigger triggerSelected = triggerRepo.findByName(trigger);
        String copingMechanism = newResponse.getString("copingMechanism");
        CopingMechanism copingSelected = copingRepo.findByTitle(copingMechanism);

        Response responseToAdd = new Response(moodSelected,triggerSelected,copingSelected);
        responseRepo.save(responseToAdd);

        return responseRepo.findAll();
    }



}
