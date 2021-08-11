package org.vanguardhealth.healthyresponse.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Objects;

@Entity
public class Response {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private Mood mood;
    @OneToOne
    private Trigger trigger;
    @OneToOne
    private CopingMechanism copingMechanism;
    @OneToOne
    private Consequence consequence;
    @OneToOne
    private Result result;
    @OneToOne
    private Alternatives alternatives;

    public Long getId() {
        return id;
    }

    public Mood getMood() {
        return mood;
    }

    public Trigger getTrigger() {
        return trigger;
    }

    public CopingMechanism getCopingMechanism() {
        return copingMechanism;
    }

    public Consequence getConsequence() {
        return consequence;
    }

    public Result getResult() {
        return result;
    }

    public Alternatives getAlternatives() {
        return alternatives;
    }


    public Response(){}
    public Response(Mood mood){
        this.mood = mood;
    }
    public Response(Mood mood, Trigger trigger, CopingMechanism copingMechanism){
        this.mood = mood;
        this.trigger = trigger;
        this.copingMechanism = copingMechanism;
    }
    public Response(Trigger trigger, CopingMechanism copingMechanism,
                    Consequence consequence, Result result, Alternatives alternatives){
        this.alternatives = alternatives;
        this.trigger = trigger;
        this.copingMechanism = copingMechanism;
        this.consequence = consequence;
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response = (Response) o;
        return Objects.equals(id, response.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
