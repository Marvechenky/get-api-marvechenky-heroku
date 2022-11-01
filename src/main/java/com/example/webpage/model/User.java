package com.example.webpage.model;

public class User {

    private String slackUsername;
    private boolean backend;
    private int age;
    private String bio;

    public User(String slackUsername, boolean backend, int age,  String bio) {
        this.slackUsername = slackUsername;
        this.backend = backend;
        this.age = age;
        this.bio = bio;
    }

    public String getSlackUsername() {
        return slackUsername;
    }


    public boolean isBackend() {
        return backend;

    }

    public int getAge() {
        return age;
    }


    public String getBio() {
        return bio;
    }
}
