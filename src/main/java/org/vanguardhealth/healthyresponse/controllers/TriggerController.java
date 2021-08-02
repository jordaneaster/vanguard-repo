package org.vanguardhealth.healthyresponse.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.vanguardhealth.healthyresponse.models.Trigger;
import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
public class TriggerController {
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

    @GetMapping("/triggers")
    public Iterable<Trigger> getTriggers(){
        return triggerRepo.findAll();
    }
    @GetMapping("/trigger/{id}")
    public Trigger getTrigger(@PathVariable Long id){
        return triggerRepo.findById(id).get();
    }
}
