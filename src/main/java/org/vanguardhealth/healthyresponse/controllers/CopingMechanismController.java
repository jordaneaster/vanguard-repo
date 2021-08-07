package org.vanguardhealth.healthyresponse.controllers;

import org.springframework.web.bind.annotation.*;
import org.vanguardhealth.healthyresponse.models.Consequence;
import org.vanguardhealth.healthyresponse.models.CopingMechanism;
import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;
import java.util.Optional;

@CrossOrigin
@RestController
public class CopingMechanismController {
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

    @GetMapping("/coping")
    public Iterable<CopingMechanism> getAllCoping() {
        return copingRepo.findAll();
    }

    @GetMapping("/coping/{id}")
    public CopingMechanism getMood(@PathVariable Long id) {
        return copingRepo.findById(id).get();
    }

    @PostMapping("/coping/{id}/consequences/{consequenceId}")
    public String getCopingResult(@PathVariable Long id, @PathVariable Long consequenceId) {
        Optional<Consequence> consequenceToAddOpt = Optional.of(consequenceRepo.findById(consequenceId).get());
        Consequence consequenceToAdd = consequenceToAddOpt.get();

        Optional<CopingMechanism> copingToAddConsequenceToOpt = Optional.of(copingRepo.findById(id).get());
        CopingMechanism copingToAddConsequenceTo = copingToAddConsequenceToOpt.get();
        copingToAddConsequenceTo.addConsequences(consequenceToAdd);

        return "redirect:/coping/" +id;
    }
}