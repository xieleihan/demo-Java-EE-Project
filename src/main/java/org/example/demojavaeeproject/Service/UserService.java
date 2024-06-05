package org.example.demojavaeeproject.Service;

import org.example.demojavaeeproject.Model.User;
import org.example.demojavaeeproject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    private List<User> users = new ArrayList<>();

    public boolean updateUserRole(String username, String role) {
        return false;
    }

    public boolean addUser(User user) {
        return false;
    }

    public boolean deleteUser(String username) {
        return false;
    }

    public void registerUser(User user) {
        userRepository.save(user);
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }



    public List<User> getAllUsers() {
        return users;
    }

    public User validateAdmin(String username, String password) {
        User user = getUserByUsername(username);
        if (user != null && user.getPassword().equals(password) && user.hasRole("ADMIN")) {
            return user;
        }
        return null;
    }
}
