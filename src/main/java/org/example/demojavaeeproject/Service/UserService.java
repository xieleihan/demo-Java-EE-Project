package org.example.demojavaeeproject.Service;

import org.example.demojavaeeproject.Model.User;
import org.example.demojavaeeproject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void registerUser(User user) {
        userRepository.save(user);
    }
}
