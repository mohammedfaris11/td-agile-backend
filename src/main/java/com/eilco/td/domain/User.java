package com.eilco.td.domain;
import java.util.UUID;

public class User {

    private final String userId;

    private final String name;

    private final String email;

    private final Gender gender;


    private User(String userId, String name, String email, Gender gender) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public static User createUser(String name, String email, Gender gender){
        return new User(generateUserId(),name, email, gender);
    }

    public static User sanitizeUser(String userId, String name, String email, Gender gender){
        return new User(userId,name, email, gender);
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    private static String generateUserId(){
        return "USER-" + UUID.randomUUID();
    }
}
