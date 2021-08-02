package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Alternatives {
    @Id
    @GeneratedValue
    private Long id;
    @Lob
    private String description;
    private String title;

    @ManyToMany(mappedBy = "alternatives",fetch = FetchType.LAZY)
    private Collection<Result> results;
    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public Alternatives(String title, String description){
        this.title = title;
        this.description = description;
    }
    public Alternatives(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alternatives that = (Alternatives) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
