package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Mood {




    @Id
    @GeneratedValue
    private Long id;
    private String mood;

    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Trigger> trigger;

    @OneToMany(mappedBy = "mood")
    @JsonIgnore
    private Collection<User> users;

    public Long getId() {
        return id;
    }

    public Collection<User> getUsers() {
        return users;
    }



    public Collection<Trigger> getTrigger() {
        return trigger;
    }

    public void addTrigger(Trigger addedTrigger){
        trigger.add(addedTrigger);
    }

    public String getMood() {
        return mood;
    }

    public Mood(String mood, Trigger... trigger){
        this.mood = mood;
        this.trigger = Arrays.asList(trigger);
    }
    public Mood(String mood){
        this.mood = mood;
    }
    public Mood(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mood mood = (Mood) o;
        return Objects.equals(id, mood.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}