package org.vanguardhealth.healthyresponse.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class ResponseMap {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Mood mood;
    @OneToOne
    private CopingMechanism copingMechanism;

    public Mood getMood() {
        return mood;
    }

    public CopingMechanism getCopingMechanism() {
        return copingMechanism;
    }


    public Long getId() {
        return id;
    }


    public ResponseMap(){}
    public ResponseMap(Mood mood, CopingMechanism copingMechanism){
        this.mood = mood;
        this.copingMechanism = copingMechanism;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseMap that = (ResponseMap) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
