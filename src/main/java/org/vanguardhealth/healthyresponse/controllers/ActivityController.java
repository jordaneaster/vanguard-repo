package org.vanguardhealth.healthyresponse.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.vanguardhealth.healthyresponse.models.Activity;
import org.vanguardhealth.healthyresponse.repositories.ActivityRepo;
import org.vanguardhealth.healthyresponse.repositories.UserRepo;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin
public class ActivityController {

    @Resource
    private ActivityRepo activityRepo;

    @Resource
    private UserRepo userRepo;

    @GetMapping("/activities")
    public Collection<Activity> getActivities() {
        return (Collection<Activity>) activityRepo.findAll();
    }

    @GetMapping("/activities/{id}")
    public Activity getActivity(@PathVariable Long id) {
        return activityRepo.findById(id).get();
    }

//    @PostMapping("activities/{activityId}/fill-journal")
//    public Activity fillActivityJournal(@RequestBody String body, @PathVariable Long id) throws JSONException {
//        JSONObject newJournal = new JSONObject(body);
//        String
//    }


}
