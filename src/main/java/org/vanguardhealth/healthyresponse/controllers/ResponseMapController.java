package org.vanguardhealth.healthyresponse.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.vanguardhealth.healthyresponse.models.CopingMechanism;
import org.vanguardhealth.healthyresponse.models.Mood;
import org.vanguardhealth.healthyresponse.models.ResponseMap;
import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin
public class ResponseMapController {

    @Resource
    private ResponseMapRepo mapRepo;
    @Resource
    private ResponseRepo responseRepo;
    @Resource
    private UserRepo userRepo;
    @Resource
    private CopingMechanismRepo copingRepo;
    @Resource
    private MoodRepo moodRepo;

    @GetMapping("/map")
    public Iterable<ResponseMap> findAllMaps() {

        return  mapRepo.findAll();
    }
    @GetMapping("/map/{id}")
    public ResponseMap getResponseMap(@PathVariable Long id){
        return mapRepo.findById(id).get();
    }


    @PostMapping("/map/response")
    public Iterable<ResponseMap> sendHealthyResponse(@RequestBody String body) throws JSONException {
        JSONObject newResponse = new JSONObject(body);
        String newMood = newResponse.getString("mood");
        Mood moodSelected = moodRepo.findByMood(newMood);

        String newCoping = newResponse.getString("copingMechanism");
        CopingMechanism copingSelected = copingRepo.findByTitle(newCoping);

        ResponseMap responseToAdd = new ResponseMap(moodSelected,copingSelected);
        mapRepo.save(responseToAdd);

        return mapRepo.findAll();
    }
//    @PostMapping("/newReply")
//    public Iterable<ResponseMaps> postReply(@RequestBody String body)throws JSONException {
//        JSONObject newReply = new JSONObject(body);
//        String newMood = newReply.getString("mood");
//        Mood moodSelected = moodRepo.findByMood(newMood);
//        String newCopingMechanism = newReply.getString("copingMechanism");
//        CopingMechanism copingSelected = copingRepo.findByTitle(newCopingMechanism);
//
//        ResponseMaps responseToAdd = new ResponseMaps(moodSelected,copingSelected);
//
//        mapRepo.save(responseToAdd);
//
//        return mapRepo.findAll();
//    }
}
