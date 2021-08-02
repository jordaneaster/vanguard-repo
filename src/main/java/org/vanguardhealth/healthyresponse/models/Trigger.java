package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
@Entity
public class Trigger {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Lob
    private String description;
    @ManyToMany(mappedBy = "trigger")
    private Collection<Mood> mood;

    @ManyToMany
    private Collection<CopingMechanism> copingMechanism;

    @OneToMany(mappedBy = "trigger")
    @JsonIgnore
    private Collection<User> users;

    public Collection<User> getUsers() {
        return users;
    }

    public Collection<CopingMechanism> getCopingMechanism() {
        return copingMechanism;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getId() {
        return id;
    }

    public Trigger(){}

    public Trigger(String name, String description, CopingMechanism...copingMechanism){
        this.name = name;
        this.description = description;
        this.copingMechanism = Arrays.asList(copingMechanism);
    }
    public Trigger(String name,String description){
        this.name = name;
        this.description = description;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trigger trigger = (Trigger) o;
        return Objects.equals(id, trigger.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}