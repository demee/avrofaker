package org.demee.avrofaker.fakers;

import java.util.ArrayList;

import org.demee.avrofaker.model.User;

import java.util.List;

import net.datafaker.Faker;

public class UserFaker {
    private final Faker faker;

    public UserFaker() {
        this.faker = new Faker();
    }
    
    public List<User> fakeUsers(int count) {
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < count; i++) {
            users.add(fakeUser());
        }
        return users;
    }

    public User fakeUser() {
        User user = new User();
        user.setName(faker.name().name());
        user.setAge(faker.number().numberBetween(1, 100));
        user.setGender(faker.gender().types());
        return user;
    }
}
