package org.vanguardhealth.healthyresponse.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String password;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public User(){}
    public User(String userName,String password){
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



}
