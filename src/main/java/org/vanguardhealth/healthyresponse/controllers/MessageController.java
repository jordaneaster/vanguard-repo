package org.vanguardhealth.healthyresponse.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.vanguardhealth.healthyresponse.models.Message;
import org.vanguardhealth.healthyresponse.repositories.MessageRepository;
import org.vanguardhealth.healthyresponse.repositories.UserRepo;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
@CrossOrigin
public class MessageController {

    @Resource
    private MessageRepository messageRepo;
    @Resource
    private UserRepo userRepo;

    @GetMapping("/view_messages")
    public Iterable<Message> viewMessages(){
        return messageRepo.findAll();
    }
    @GetMapping("/view_message/{id}")
    public Message viewMessage(@PathVariable Long id){
        return messageRepo.findById(id).get();
    }
    @PostMapping(value = "/post_message")
    public Iterable<Message> postMessage(@RequestBody String body)throws JSONException{
        JSONObject newPost = new JSONObject(body);
        String subject = newPost.getString("subject");
        String title = newPost.getString("title");
        String content = newPost.getString("content");

        Optional<Message> optionalMessage = messageRepo.findBySubject(subject);
        if(optionalMessage.isEmpty()){
            Message messageToPost = new Message(subject,title,content);
            messageRepo.save(messageToPost);
        }
        return messageRepo.findAll();
    }

}
