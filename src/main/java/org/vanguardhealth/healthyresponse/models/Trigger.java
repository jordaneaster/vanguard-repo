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
    private String triggerDisclaimer;
    private String triggerImage;
    private String triggerArticle1;
    private String triggerArticle2;
    private String triggerArticle3;
    private String triggerPhoneResource1;
    private String triggerPhoneResource2;
    private String triggerPhoneResource3;
    @ManyToMany(mappedBy = "trigger")
    private Collection<Mood> mood;

    @ManyToMany
    private Collection<CopingMechanism> copingMechanism;

    public Collection<CopingMechanism> getCopingMechanism() {
        return copingMechanism;
    }

    public String getName() {
        return name;
    }

    public String getTriggerDisclaimer() {
        return triggerDisclaimer;
    }

    public String getTriggerImage() {
        return triggerImage;
    }

    public String getTriggerArticle1() {
        return triggerArticle1;
    }

    public String getTriggerArticle2() {
        return triggerArticle2;
    }

    public String getTriggerArticle3() {
        return triggerArticle3;
    }

    public String getTriggerPhoneResource1() {
        return triggerPhoneResource1;
    }

    public String getTriggerPhoneResource2() {
        return triggerPhoneResource2;
    }

    public String getTriggerPhoneResource3() {
        return triggerPhoneResource3;
    }

    public Long getId() {
        return id;
    }

    public Trigger(){}

    public Trigger(String name, String triggerDisclaimer, String triggerImage, String triggerArticle1, String triggerArticle2, String triggerArticle3, String triggerPhoneResource1, String triggerPhoneResource2, String triggerPhoneResource3, CopingMechanism...copingMechanism){
        this.name = name;
        this.triggerDisclaimer = triggerDisclaimer;
        this.triggerImage = triggerImage;
        this.triggerArticle1 = triggerArticle1;
        this.triggerArticle2 = triggerArticle2;
        this.triggerArticle3 = triggerArticle3;
        this.triggerPhoneResource1 = triggerPhoneResource1;
        this.triggerPhoneResource2 = triggerPhoneResource2;
        this.triggerPhoneResource3 = triggerPhoneResource3;
        this.copingMechanism = Arrays.asList(copingMechanism);
    }
    public Trigger(String name,String triggerDisclaimer){
        this.name = name;
        this.triggerDisclaimer = triggerDisclaimer;
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