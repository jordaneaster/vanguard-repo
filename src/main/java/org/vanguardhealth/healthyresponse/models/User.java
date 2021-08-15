package org.vanguardhealth.healthyresponse.models;


import javax.persistence.*;
import java.util.*;

@Entity
public class User {


    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    public IntakeProfile intakeProfile;

    private String userName;
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<Message> myMessages;

    @OneToMany(mappedBy="user")
    private Collection<Activity> activities;

    public void addMessage(Message messageToAdd){
        myMessages.add(messageToAdd);
    }



    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Collection<Activity> getActivities() {
        return activities;
    }

    public User(){}
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
        this.myMessages = new HashSet<>();


    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public IntakeProfile getIntakeProfile() {
        return intakeProfile;
    }

    public Set<Message> getMyMessages() {
        return myMessages;
    }

    public void addProfile(IntakeProfile profile) {

    }
}
