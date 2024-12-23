package com.example.lessonSpring.model;

public class User {
    private String username;
    private String password;

    private String likelyLanguage;

    public User (String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLikelyLanguage() {
        return likelyLanguage;
    }

    public void setLikelyLanguage(String likelyLanguage) {
        this.likelyLanguage = likelyLanguage;
    }
}
