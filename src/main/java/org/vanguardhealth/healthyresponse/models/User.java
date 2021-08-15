package org.vanguardhealth.healthyresponse.models;

<<<<<<< HEAD
=======

>>>>>>> 42cc4d6d9be9782da10a19b8e2f9b0c7c0288ea2
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

<<<<<<< HEAD
    public void addMessage(Message messageToAdd){
        myMessages.add(messageToAdd);
    }
=======


>>>>>>> 42cc4d6d9be9782da10a19b8e2f9b0c7c0288ea2

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
<<<<<<< HEAD
        this.myMessages = new HashSet<>();
=======


>>>>>>> 42cc4d6d9be9782da10a19b8e2f9b0c7c0288ea2
    }
//    public User(String userName, String password) {
//        this.userName=userName;
//        this.password=password;
//    }

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


//    public void addProfile(Set<IntakeProfile> profile) {
//        intakeProfile.add(profile);
//    }
//
//    public Collection<Set<IntakeProfile>> getIntakeProfile() {
//        return intakeProfile;
//    }
}
