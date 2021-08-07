package org.vanguardhealth.healthyresponse.models;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Activity {
    @Id
    @GeneratedValue
    private Long id;
    private String step1Question1;
    private String step1Question2;
    private String step1Question3;
    private String step1Question4;
    private String step1Question5;
    private String step1Question6;
    private String step1Strength1;
    private String step1Strength2;
    private String step1Strength3;
    private String step1Strength4;
    private String step1Strength5;
    private String step1Question7;
    @ManyToMany
    @JsonIgnore
    private Collection<Mood> mood;

    public Activity(String step1Question1, String step1Question2, String step1Question3, String step1Question4, String step1Question5, String step1Question6, String step1Strength1, String step1Strength2, String step1Strength3, String step1Strength4, String step1Strength5, String step1Question7, Collection<Mood> mood) {
        this.step1Question1 = step1Question1;
        this.step1Question2 = step1Question2;
        this.step1Question3 = step1Question3;
        this.step1Question4 = step1Question4;
        this.step1Question5 = step1Question5;
        this.step1Question6 = step1Question6;
        this.step1Strength1 = step1Strength1;
        this.step1Strength2 = step1Strength2;
        this.step1Strength3 = step1Strength3;
        this.step1Strength4 = step1Strength4;
        this.step1Strength5 = step1Strength5;
        this.step1Question7 = step1Question7;
        this.mood = new ArrayList(Arrays.asList(mood));
    }

    public Long getId() {return id;}

    public String getStep1Question1() {
        return step1Question1;
    }

    public String getStep1Question2() {
        return step1Question2;
    }

    public String getStep1Question3() {
        return step1Question3;
    }

    public String getStep1Question4() {
        return step1Question4;
    }

    public String getStep1Question5() {
        return step1Question5;
    }

    public String getStep1Question6() {
        return step1Question6;
    }

    public String getStep1Strength1() {
        return step1Strength1;
    }

    public String getStep1Strength2() {
        return step1Strength2;
    }

    public String getStep1Strength3() {
        return step1Strength3;
    }

    public String getStep1Strength4() {
        return step1Strength4;
    }

    public String getStep1Strength5() {
        return step1Strength5;
    }

    public String getStep1Question7() {
        return step1Question7;
    }

    public Collection<Mood> getMood() {
        return mood;
    }

    public Activity(String step1Question1, String step1Question2, String step1Question3, String step1Question4, String step1Question5, String step1Question6, String step1Strength1, String step1Strength2, String step1Strength3, String step1Strength4, String step1Strength5, String step1Question7) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Activity)) return false;
        Activity activity = (Activity) o;
        return Objects.equals(getId(), activity.getId()) && Objects.equals(getStep1Question1(), activity.getStep1Question1()) && Objects.equals(getStep1Question2(), activity.getStep1Question2()) && Objects.equals(getStep1Question3(), activity.getStep1Question3()) && Objects.equals(getStep1Question4(), activity.getStep1Question4()) && Objects.equals(getStep1Question5(), activity.getStep1Question5()) && Objects.equals(getStep1Question6(), activity.getStep1Question6()) && Objects.equals(getStep1Strength1(), activity.getStep1Strength1()) && Objects.equals(getStep1Strength2(), activity.getStep1Strength2()) && Objects.equals(getStep1Strength3(), activity.getStep1Strength3()) && Objects.equals(getStep1Strength4(), activity.getStep1Strength4()) && Objects.equals(getStep1Strength5(), activity.getStep1Strength5()) && Objects.equals(getStep1Question7(), activity.getStep1Question7()) && Objects.equals(getMood(), activity.getMood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStep1Question1(), getStep1Question2(), getStep1Question3(), getStep1Question4(), getStep1Question5(), getStep1Question6(), getStep1Strength1(), getStep1Strength2(), getStep1Strength3(), getStep1Strength4(), getStep1Strength5(), getStep1Question7(), getMood());
    }
}
