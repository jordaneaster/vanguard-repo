package org.vanguardhealth.healthyresponse.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.vanguardhealth.healthyresponse.models.Alternatives;
import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin
public class AlternativesController {
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
    private AlternativesRepo alternativesRepo;

    @GetMapping("/alternatives")
    public Iterable<Alternatives> getMoods(){
        return  alternativesRepo.findAll();
    }
    @GetMapping("alternative/{id}")
    public Alternatives getMood(@PathVariable Long id){
        return alternativesRepo.findById(id).get();
    }
}
