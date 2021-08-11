package org.vanguardhealth.healthyresponse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.vanguardhealth.healthyresponse.models.Response;
import org.vanguardhealth.healthyresponse.models.ResponseMaps;
import org.vanguardhealth.healthyresponse.models.User;
import org.vanguardhealth.healthyresponse.repositories.ResponseMapRepo;
import org.vanguardhealth.healthyresponse.repositories.ResponseRepo;
import org.vanguardhealth.healthyresponse.repositories.UserRepo;

import javax.annotation.Resource;
import java.security.Principal;
import java.util.Optional;

@Controller
public class ResponseMapController {

    @Resource
    private ResponseMapRepo mapRepo;
    @Resource
    private ResponseRepo responseRepo;
    @Resource
    private UserRepo userRepo;

    @GetMapping("/response_maps")
    public Iterable<ResponseMaps> findAllMaps(Principal principal) {
        String loggedUser = principal.getName().toString();
        Optional<User> foundUser = userRepo.findByUserName(loggedUser);

        foundUser.ifPresent(user -> userRepo.save(user));
        return  mapRepo.findAll();
    }
    @GetMapping("/response_maps/{id}")
    public ResponseMaps getResponseMap(@PathVariable Long id){
        return mapRepo.findById(id).get();
    }
    @RequestMapping("/user/send_response")
    public Iterable<ResponseMaps> addResponsesToResponseMap(@PathVariable Long id, Principal principal){
        String loggedUser = principal.getName().toString();
        Optional<User> foundUser = userRepo.findByUserName(loggedUser);
        if(foundUser.isPresent()){
            Optional<Response> responseOptional = responseRepo.findById(id);
            Response response = responseOptional.get();
            Optional<ResponseMaps> foundResponse = mapRepo.findByResponse(response);
            if(foundResponse.isEmpty()){
                ResponseMaps responseMap;
                responseMap = new ResponseMaps(response, foundUser.get());
                mapRepo.save(responseMap);
            }
        }
        return mapRepo.findAll();
    }
}
