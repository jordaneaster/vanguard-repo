package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Result {

    @Id
    @GeneratedValue
    private Long id;

    private String impact;
    private String title;
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Alternatives> alternatives;
    @ManyToMany(mappedBy = "results",fetch = FetchType.LAZY)
    private Collection<Consequence> consequences;

    public String getImpact() {
        return impact;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public Collection<Alternatives> getAlternatives() {
        return alternatives;
    }

    public Result(String title, String impact, Alternatives...alternatives) {
        this.title = title;
        this.impact = impact;
        this.alternatives = Arrays.asList(alternatives);
    }
    public Result(String title,String impact){
        this.impact = impact;
        this.title = title;
    }

    public Result() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result results = (Result) o;
        return Objects.equals(id, results.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



}