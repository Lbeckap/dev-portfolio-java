package com.example.dev_porfolio.models;

import java.util.Objects;

public class User {
    private int id;
    private static int nextId = 1;

    private String username;
    private String password;
    private String verifyPassword;
    private String email;
    private Boolean admin;

 // Admin can...
    // delete users
    // edit user permissions
    // NOT add users, users must create account using login page,


    public User() {}

    public User(String username, String password, String verifyPassword, String email) {
        this();
        this.username = username;
        this.password = password;
        this.verifyPassword = verifyPassword;
        this.email = email;
        this.id = nextId;
        nextId++;
        this.admin = isAdmin();
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getId() == user.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", verifyPassword='" + verifyPassword + '\'' +
                ", email='" + email + '\'' +
                ", admin=" + admin +
                '}';
    }
}
