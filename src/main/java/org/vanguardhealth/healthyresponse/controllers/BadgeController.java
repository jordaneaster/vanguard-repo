package org.vanguardhealth.healthyresponse.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.vanguardhealth.healthyresponse.models.Badge;
import org.vanguardhealth.healthyresponse.repositories.BadgeRepository;
import org.vanguardhealth.healthyresponse.repositories.IntakeProfileRepository;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
@CrossOrigin
public class BadgeController {

    @Resource
    private IntakeProfileRepository intakeRepo;
    @Resource
    private BadgeRepository badgeRepo;

    @GetMapping("/badges")
    public Iterable<Badge> getBadges(){
        return badgeRepo.findAll();
    }
    @GetMapping("badge/{id}")
    public Badge getBadge(@PathVariable Long id)throws JSONException{
        return badgeRepo.findById(id).get();
    }
    @PostMapping("/create_badge")
    public Iterable<Badge> createBadge(@RequestBody String body) throws JSONException{
        JSONObject newBadge = new JSONObject(body);
        String badge = newBadge.getString("badge");
        Optional<Badge> badgeOptional = badgeRepo.findByBadge(badge);
        if(badgeOptional.isEmpty()){
            Badge badgeToAdd = new Badge(badge);
            badgeRepo.save(badgeToAdd);
        }
        return badgeRepo.findAll();
    }

}
