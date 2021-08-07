package org.vanguardhealth.healthyresponse.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.vanguardhealth.healthyresponse.models.Activity;
import org.vanguardhealth.healthyresponse.repositories.ActivityRepo;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class ActivityController {

    @Resource
    private ActivityRepo activityRepo;

    @GetMapping("/activity")
    public Collection<Activity> getActivity() {
        return (Collection<Activity>) activityRepo.findAll();
    }

    @PostMapping("/activity/add")
    public Collection<Activity> addActivity(@RequestBody String body) throws JSONException {
        JSONObject newActivity = new JSONObject(body);
        String step1Question1 = newActivity.getString("step1Question1");
        String step1Question2 = newActivity.getString("step1Question2");
        String step1Question3 = newActivity.getString("step1Question3");
        String step1Question4 = newActivity.getString("step1Question4");
        String step1Question5 = newActivity.getString("step1Question5");
        String step1Question6 = newActivity.getString("step1Question6");
        String step1Strength1 = newActivity.getString("step1Strength1");
        String step1Strength2 = newActivity.getString("step1Strength2");
        String step1Strength3 = newActivity.getString("step1Strength3");
        String step1Strength4 = newActivity.getString("step1Strength4");
        String step1Strength5 = newActivity.getString("step1Strength5");
        String step1Question7 = newActivity.getString("step1Question7");
        Optional<Activity> activityToAddOpt = activityRepo.findByActivity(step1Question1);

        if (activityToAddOpt.isEmpty()) {
            Activity activityToAdd = new Activity(step1Question1, step1Question2, step1Question3, step1Question4, step1Question5, step1Question6, step1Strength1, step1Strength2, step1Strength3, step1Strength4, step1Strength5, step1Question7);
            activityRepo.save(activityToAdd);
        }
        return (Collection<Activity>) activityRepo.findAll();
    }
}
