package com.example.greeting_app.service;

import com.example.greeting_app.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public UserService() {
        // Add some sample users
        users.add(new User("John Doe", "john@example.com", 25));
        users.add(new User("Jane Smith", "jane@example.com", 30));
        users.add(new User("Bob Johnson", "bob@example.com", 35));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User addUser(User user) {
        users.add(user);
        return user;
    }

    public User getUserByName(String name) {
        return users.stream()
                .filter(user -> user.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
