package org.vanguardhealth.healthyresponse.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class ResponseMaps {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Response response;

    @ManyToOne
    private  User user;

    public Long getId() {
        return id;
    }

    public Response getResponse() {
        return response;
    }

    public User getUser(){
        return user;
    }
    public ResponseMaps(){};
    public ResponseMaps(Response response,User user){
        this.response = response;
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseMaps that = (ResponseMaps) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
