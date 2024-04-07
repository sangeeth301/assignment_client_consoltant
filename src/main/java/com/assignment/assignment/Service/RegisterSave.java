package com.assignment.assignment.Service;

import com.assignment.assignment.Entity.Consultant;
import com.assignment.assignment.Entity.User;
import com.assignment.assignment.Repository.ConsultantRepository;
import com.assignment.assignment.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterSave {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ConsultantRepository consultantRepository;

    public void ClientSave(User user){
        userRepository.save(user);
    }
    public void consultantSave(Consultant consultant){
        consultantRepository.save(consultant);
    }
}
