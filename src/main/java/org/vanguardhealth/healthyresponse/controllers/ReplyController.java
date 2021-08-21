package org.vanguardhealth.healthyresponse.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.vanguardhealth.healthyresponse.models.Message;
import org.vanguardhealth.healthyresponse.models.Reply;
import org.vanguardhealth.healthyresponse.repositories.MessageRepository;
import org.vanguardhealth.healthyresponse.repositories.ReplyRepository;
import org.vanguardhealth.healthyresponse.repositories.UserRepo;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
@CrossOrigin
public class ReplyController {

    @Resource
    private MessageRepository messageRepo;
    @Resource
    private UserRepo userRepo;
    @Resource
    private ReplyRepository replyRepo;

    @GetMapping("/view_reply")
    public Iterable<Reply> viewReplies(){
        return replyRepo.findAll();
    }
    @GetMapping("/view_reply/{id}")
    public Reply viewReply(@PathVariable Long id){
        return replyRepo.findById(id).get();
    }


    @PostMapping("/post_reply")
    public Iterable<Reply> postReply(@RequestBody String body)throws JSONException {
        JSONObject newPost = new JSONObject(body);
        String subject = newPost.getString("subject");
        String title = newPost.getString("title");
        String content = newPost.getString("content");

        Optional<Reply> optionalReply = replyRepo.findByTitle(title);
        if(optionalReply.isEmpty()){
            Reply replyToPost = new Reply(subject,title,content);
            replyRepo.save(replyToPost);
        }
        return replyRepo.findAll();
    }
}
