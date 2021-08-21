package org.vanguardhealth.healthyresponse.models;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class IntakeProfile {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String age;
    private String ethnicity;
    private String city;
    private String state;
    private String zipcode;
    private boolean active;
    private String status;
    @Lob
    private String aboutMe;

    @OneToMany(mappedBy = "badge")
    private List<Badge> badge;

    public List<Badge> getBadge() {
        return badge;
    }

    public void setBadge(List<Badge> badge) {
        this.badge = badge;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public boolean isActive() {
        return active;
    }

    public String getStatus() {
        return status;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public IntakeProfile(){}
    public IntakeProfile(String firstName, String lastName, String ethnicity, String city,
                         String state,String status, String aboutMe) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ethnicity = ethnicity;
        this.city = city;
        this.state = state;
        this.status = status;
        this.aboutMe = aboutMe;
    }
    public IntakeProfile(String firstName, String lastName,String ethnicity, String city,
                         String state, String zipcode, boolean active, String status, String aboutMe) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ethnicity = ethnicity;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.active = active;
        this.status = status;
        this.aboutMe = aboutMe;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntakeProfile that = (IntakeProfile) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
