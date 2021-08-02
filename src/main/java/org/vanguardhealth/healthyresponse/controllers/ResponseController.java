package org.vanguardhealth.healthyresponse.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.vanguardhealth.healthyresponse.models.Response;
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
}
