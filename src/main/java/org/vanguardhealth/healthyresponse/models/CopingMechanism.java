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
    private String copingDisclaimer;
    private String copingMechanismImage;
    private String copingMechanismArticle1;
    private String copingMechanismArticle2;
    private String copingMechanismArticle3;
    private String copingMechanismPhoneResource1;
    private String copingMechanismPhoneResource2;
    private String copingMechanismPhoneResource3;



    @ManyToMany
    private Collection <Consequence> consequences;



    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCopingDisclaimer() {
        return copingDisclaimer;
    }

    public String getCopingMechanismImage() {
        return copingMechanismImage;
    }

    public String getCopingMechanismArticle1() {
        return copingMechanismArticle1;
    }

    public String getCopingMechanismArticle2() {
        return copingMechanismArticle2;
    }

    public String getCopingMechanismArticle3() {
        return copingMechanismArticle3;
    }

    public String getCopingMechanismPhoneResource1() {
        return copingMechanismPhoneResource1;
    }

    public String getCopingMechanismPhoneResource2() {
        return copingMechanismPhoneResource2;
    }

    public String getCopingMechanismPhoneResource3() {
        return copingMechanismPhoneResource3;
    }

    public Collection<Consequence> getConsequence() {
        return consequences;
    }
    public CopingMechanism(){}
    public CopingMechanism(String title,String copingDisclaimer, String copingMechanismImage, String copingMechanismArticle1, String copingMechanismArticle2, String copingMechanismArticle3, String copingMechanismPhoneResource1,
                           String copingMechanismPhoneResource2, String copingMechanismPhoneResource3, Consequence...consequences){
        this.title = title;
        this.copingDisclaimer = copingDisclaimer;
        this.copingMechanismImage = copingMechanismImage;
        this.copingMechanismArticle1 = copingMechanismArticle1;
        this.copingMechanismArticle2 = copingMechanismArticle2;
        this.copingMechanismArticle3 = copingMechanismArticle3;
        this.copingMechanismPhoneResource1 = copingMechanismPhoneResource1;
        this.copingMechanismPhoneResource2 = copingMechanismPhoneResource2;
        this.copingMechanismPhoneResource3 = copingMechanismPhoneResource3;
        this.consequences = Arrays.asList(consequences);
    }
    public CopingMechanism(String title,String description){
        this.title = title;
        this.copingDisclaimer = copingDisclaimer;
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

