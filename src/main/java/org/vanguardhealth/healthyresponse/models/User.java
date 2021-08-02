package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;


    private String userName;
    private String password;
    private int age;
    @ManyToOne
    private Mood mood;

    @ManyToOne
    public Trigger trigger;

    @ManyToOne
    private CopingMechanism copingMechanism;

    public User(String userName, String password, int age, Mood mood) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.mood = mood;
    }

    public User(String userName, String password, int age) {
        this.userName=userName;
        this.password=password;
        this.age=age;
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

    public int getAge() {
        return age;
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

    public User(){}
    public User(String userName){
        this.userName = userName;
    }
    public User(String userName, String password, int age, Mood mood,
                CopingMechanism copingMechanism, Trigger trigger){
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.mood = mood;
        this.trigger = trigger;
        this.copingMechanism =  copingMechanism;
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
