package org.vanguardhealth.healthyresponse.controllers;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.vanguardhealth.healthyresponse.models.Badge;
import org.vanguardhealth.healthyresponse.models.IntakeProfile;
import org.vanguardhealth.healthyresponse.repositories.IntakeProfileRepository;

import javax.annotation.Resource;
import java.util.Optional;
@CrossOrigin
@RestController
public class IntakeProfileController {

    @Resource
    private IntakeProfileRepository intakeRepo;


    @GetMapping("/intake_profile")
    public Iterable<IntakeProfile> getProfiles(){
        return intakeRepo.findAll();
    }
    @GetMapping("/intake_profile/{id}")
    public IntakeProfile getProfile(@PathVariable Long id){
        return intakeRepo.findById(id).get();
    }

    @PatchMapping("intake_profile/{id}/add-badge")
    public Optional<IntakeProfile> addBadge(@RequestBody Badge badgeToAdd, Long id) throws JSONException{
        Optional<IntakeProfile> profileToModify = intakeRepo.findById(id);
        badgeToAdd.addProfile(profileToModify.get());

    return profileToModify;
    }



    @PostMapping(value = "/create_intake_profile")
    public Iterable<IntakeProfile> createProfile(@RequestBody String body) throws JSONException{
        JSONObject userProfile = new JSONObject(body);
        String firstName = userProfile.getString("firstName");
        String lastName = userProfile.getString("lastName");
        String ethnicity = userProfile.getString("ethnicity");
        String city = userProfile.getString("city");
        String state = userProfile.getString("state");
        String status = userProfile.getString("status");
        String aboutMe = userProfile.getString("aboutMe");

        Optional<IntakeProfile> profileOptional = intakeRepo.findByLastName(lastName);
        if(profileOptional.isEmpty()){
            IntakeProfile newProfile = new IntakeProfile(firstName,lastName,
                    ethnicity,city,state,status,aboutMe);
            intakeRepo.save(newProfile);
        }
            return intakeRepo.findAll();
    }
}
