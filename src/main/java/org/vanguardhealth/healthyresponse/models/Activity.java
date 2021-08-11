package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Activity {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    @Lob
    private String description;
//    @OneToMany
//    private Collection<Worksheet> worksheets;
//    private Worksheet worksheet;

    @ManyToOne
    @JsonIgnore
    private User user;

    public Activity() {}

    public Activity(String title, String description, User user) {
        this.title = title;
        this.description = description;
        this.user = user;
//        this.worksheets = new ArrayList<>(Arrays.asList(worksheets));
//        this.worksheet = worksheet;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }

    //    public Collection<Worksheet> getWorksheets() {
//        return worksheets;
//    }

//    public pubic getWorksheet() {
//        return worksheet;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Activity)) return false;
        Activity that = (Activity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
