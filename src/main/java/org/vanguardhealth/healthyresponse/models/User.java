package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;


    private String userName;
    private String password;
    private String role;
    @ManyToOne
    private Mood mood;

    @ManyToOne
    public Trigger trigger;

    @ManyToOne
    private CopingMechanism copingMechanism;

    @OneToMany(mappedBy="user")
    private Collection<Activity> activities;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public Mood getMood() {
        return  mood;
    }

    public Trigger getTrigger() {
        return trigger;
    }
    public CopingMechanism getCopingMechanism() {
        return copingMechanism;
    }

    public Collection<Activity> getActivities() {
        return activities;
    }

    public User(){}
    public User(String userName,String password){
        this.userName = userName;
        this.password = password;
    }
    public User(String userName, String password, String role) {
        this.userName=userName;
        this.password=password;
        this.role = role;
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



}
