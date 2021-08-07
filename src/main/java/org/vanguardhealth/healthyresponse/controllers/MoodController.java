package org.vanguardhealth.healthyresponse.controllers;

import org.springframework.web.bind.annotation.*;
import org.vanguardhealth.healthyresponse.models.CopingMechanism;
import org.vanguardhealth.healthyresponse.models.Mood;
import org.vanguardhealth.healthyresponse.models.Trigger;
import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;
import java.util.Optional;

@CrossOrigin
@RestController
public class MoodController {
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

    @GetMapping("/moods")
    public Iterable<Mood> getMoods(){
        return  moodRepo.findAll();
    }
    @GetMapping("/mood/{id}")
    public Mood getMood(@PathVariable Long id){
        return moodRepo.findById(id).get();
    }

//    @PostMapping("/mood/{id}/trigger/{triggerid}")
//    public String getMoodTrigger(@PathVariable Long id,@PathVariable Long triggerid){
//        Optional<Trigger> triggerToAddOpt = triggerRepo.findById(triggerid);
//        Trigger triggerToAdd = triggerToAddOpt.get();
//
//        Optional<Mood> moodToAddTriggerToOpt = moodRepo.findById(id);
//        Mood moodToAddTriggerTo = moodToAddTriggerToOpt.get();
//        moodToAddTriggerTo.addTrigger(triggerToAdd);
//        return "redirect:/mood/" +id;
//    }

}
