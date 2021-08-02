package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class CopingMechanism {


    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @Lob
    private String description;



    @ManyToMany
    private Collection <Consequence> consequences;

    @OneToMany(mappedBy = "copingMechanism",fetch = FetchType.LAZY)
    @JsonIgnore
    private Collection<User> users;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Collection<Consequence> getConsequence() {
        return consequences;
    }
    public CopingMechanism(){}
    public CopingMechanism(String title,String description,Consequence...consequences){
        this.title = title;
        this.description = description;
        this.consequences = Arrays.asList(consequences);
    }
    public CopingMechanism(String title,String description){
        this.title = title;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CopingMechanism that = (CopingMechanism) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

