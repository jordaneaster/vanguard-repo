package org.vanguardhealth.healthyresponse.controllers;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.vanguardhealth.healthyresponse.models.Badge;
import org.vanguardhealth.healthyresponse.models.IntakeProfile;
import org.vanguardhealth.healthyresponse.models.User;
import org.vanguardhealth.healthyresponse.models.Worksheet;
import org.vanguardhealth.healthyresponse.repositories.IntakeProfileRepository;
import org.vanguardhealth.healthyresponse.repositories.WorksheetRepo;

import javax.annotation.Resource;
import java.util.Optional;
@CrossOrigin
@RestController
public class IntakeProfileController {

    @Resource
    private IntakeProfileRepository intakeRepo;

    @Resource
    private WorksheetRepo worksheetRepo;


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

    @PutMapping("/profile/{id}/addWorksheetAnswers")
    public Optional <IntakeProfile> addWorksheetAnswers(@PathVariable Long id, @RequestBody Worksheet worksheet) {
//        User user = userRepo.findById(id).get();
        IntakeProfile intakeProfile = intakeRepo.findById(id).get();
        JSONObject newWorksheet = new JSONObject(worksheet);
//        String title = newWorksheet.getString("title");
        if(!newWorksheet.getString("answer1").isEmpty()) {
            worksheet.addWorksheetAnswers(newWorksheet.getString("answer1"));
        }
        if(!newWorksheet.getString("answer2").isEmpty()) {
            worksheet.addWorksheetAnswers(newWorksheet.getString("answer2"));
        }
        if(!newWorksheet.getString("answer3").isEmpty()) {
            worksheet.addWorksheetAnswers(newWorksheet.getString("answer3"));
        }
        if(!newWorksheet.getString("answer4").isEmpty()) {
            worksheet.addWorksheetAnswers(newWorksheet.getString("answer4"));
        }
        if(!newWorksheet.getString("answer5").isEmpty()) {
            worksheet.addWorksheetAnswers(newWorksheet.getString("answer5"));
        }
        if(!newWorksheet.getString("answer6").isEmpty()) {
            worksheet.addWorksheetAnswers(newWorksheet.getString("answer6"));
        }
        if(!newWorksheet.getString("answer7").isEmpty()) {
            worksheet.addWorksheetAnswers(newWorksheet.getString("answer7"));
        }
        if(!newWorksheet.getString("answer8").isEmpty()) {
            worksheet.addWorksheetAnswers(newWorksheet.getString("answer8"));
        }
        if(!newWorksheet.getString("answer9").isEmpty()) {
            worksheet.addWorksheetAnswers(newWorksheet.getString("answer9"));
        }
        if(!newWorksheet.getString("answer10").isEmpty()) {
            worksheet.addWorksheetAnswers(newWorksheet.getString("answer10"));
        }

        intakeProfile.addWorksheet(worksheet);
        return intakeRepo.findById(id);
    }
}
