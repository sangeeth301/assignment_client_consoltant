package com.assignment.assignment.Service;

import com.assignment.assignment.Entity.Consultant;
import com.assignment.assignment.Entity.User;
import com.assignment.assignment.Repository.ConsultantRepository;
import com.assignment.assignment.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ConsultantRepository consultantRepository;

    public String authenticate(String email, String password) {
        User user = userRepository.findByEmailAndPassword(email, password);
        if (user != null) {
            if (user.getRole().equals("client")) {
                return "This is a client";
            }
        }

        Consultant consultant = consultantRepository.findByEmailAndPassword(email, password);
        if (consultant != null) {
            return "This is a consultant";
        }

        return "Invalid credentials";
    }
}

