package cgg.springboot.rest.validation.springbootrestvalidation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cgg.springboot.rest.validation.springbootrestvalidation.dao.UserRepository;
import cgg.springboot.rest.validation.springbootrestvalidation.entities.User1;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User1> getAllUsers() {
        return userRepository.findAll();
    }

    public User1 getUserById(int id) {
        return userRepository.findById(id).get();
    }

    public User1 addUser(User1 user) {
        userRepository.save(user);
        return user;
    }

}
