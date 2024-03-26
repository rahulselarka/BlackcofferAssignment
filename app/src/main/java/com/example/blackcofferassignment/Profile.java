package com.example.blackcofferassignment;

public class Profile {
    private String name;
    private String description;
    private int profileImage;

    public Profile(String name, String description, int profileImage) {
        this.name = name;
        this.description = description;
        this.profileImage = profileImage;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getProfileImage() {
        return profileImage;
    }
}
