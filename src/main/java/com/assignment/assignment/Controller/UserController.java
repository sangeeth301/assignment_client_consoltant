package com.assignment.assignment.Controller;
import com.assignment.assignment.Entity.Consultant;
import com.assignment.assignment.Entity.User;
import com.assignment.assignment.Service.RegisterSave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    RegisterSave registerSave;


    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        registerSave.ClientSave(user);
        return "User registered successfully!";
    }

    @PostMapping("/register-consultant")
    public String registerConsultant(@RequestBody Consultant consultant) {
        registerSave.consultantSave(consultant);
        return "Consultant registered successfully!";
    }

}
