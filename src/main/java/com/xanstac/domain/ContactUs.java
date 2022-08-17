package com.xanstac.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class ContactUs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String message;

    public ContactUs() {
    }

    public ContactUs(String email, String message) {
        this.email = email;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactUs contactUs = (ContactUs) o;
        return Objects.equals(id, contactUs.id) && Objects.equals(email, contactUs.email) && Objects.equals(message, contactUs.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, message);
    }

    @Override
    public String toString() {
        return "ContactUs{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
