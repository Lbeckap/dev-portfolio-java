package com.example.dev_porfolio.models;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class User extends AbstractEntity {

    private String password;
    private String verifyPassword;
    private String email;
    private Boolean admin;

 // Admin can...
    // delete users
    // edit user permissions
    // NOT add users, users must create account using login page,


    public User() {}

    public User(String password, String verifyPassword, String email) {
        this.password = password;
        this.verifyPassword = verifyPassword;
        this.email = email;
        this.admin = isAdmin();
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private Boolean isAdmin() {
        return getId() == 1;
    }
}
