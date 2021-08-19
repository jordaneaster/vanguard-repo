package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Badge {
    @Id
    @GeneratedValue
    private Long id;
    private String badge;
    @ManyToOne
    @JsonIgnore
    private IntakeProfile intakeProfile;

    public void addProfile(IntakeProfile profileToAdd){
        this.intakeProfile = profileToAdd;
    }

    public IntakeProfile getIntakeProfile() {
        return intakeProfile;
    }

    public Long getId() {
        return id;
    }

    public String getBadge() {
        return badge;
    }

    public Badge(String badge) {
        this.badge = badge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Badge badge = (Badge) o;
        return Objects.equals(id, badge.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
