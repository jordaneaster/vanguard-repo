package org.vanguardhealth.healthyresponse.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.vanguardhealth.healthyresponse.models.Result;
import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
public class ResultController {
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

    @GetMapping("/results")
    public Iterable<Result> getResults(){
        return resultRepo.findAll();
    }
    @GetMapping("/result/{id}")
    public Result getResult(@PathVariable Long id){
        return resultRepo.findById(id).get();
    }
}
