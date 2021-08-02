package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Consequence {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @Lob
    private String description;

    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Result> results;

    @ManyToMany(mappedBy = "consequences",fetch = FetchType.LAZY)
    private Collection<CopingMechanism> copingMechanisms;
    public Collection<Result> getResults() {
        return results;
    }

    public Consequence(){}
    public Consequence(String title,String description, Result...results){
        this.title = title;
        this.description = description;
        this.results = Arrays.asList(results);
    }
    public Consequence(String title, String description){
        this.title = title;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consequence that = (Consequence) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
