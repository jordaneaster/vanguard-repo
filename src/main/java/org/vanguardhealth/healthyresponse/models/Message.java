package org.vanguardhealth.healthyresponse.models;


import javax.persistence.*;
import java.util.Objects;

@Entity
public class Message {

    @Id
    @GeneratedValue
    private Long id;
    private String subject;
    private String title;
    @Lob
    private String content;

    @ManyToOne
    public User user;

    public User getUser() {
        return user;
    }

    public Long getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Message(){}
    public Message(String content){
        this.content = content;
    }
    public Message (String subject,String title,String content){
        this.subject = subject;
        this.title = title;
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(id, message.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
