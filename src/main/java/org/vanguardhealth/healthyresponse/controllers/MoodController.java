package org.vanguardhealth.healthyresponse.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.vanguardhealth.healthyresponse.models.Mood;
import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;

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
    @GetMapping("mood/{id}")
    public Mood getMood(@PathVariable Long id){
        return moodRepo.findById(id).get();
    }

}
