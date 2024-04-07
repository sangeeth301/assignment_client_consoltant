package com.assignment.assignment.Controller;


import com.assignment.assignment.Entity.AuthenticationRequest;
import com.assignment.assignment.Entity.Consultant;
import com.assignment.assignment.Entity.Slot;
import com.assignment.assignment.Service.AuthenticationService;
import com.assignment.assignment.Service.ConsultantService;
import com.assignment.assignment.Service.SlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    private String loggedInUserEmail;

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/authenticate")
    public String authenticate(@RequestBody AuthenticationRequest request) {
        this.loggedInUserEmail=request.getEmail();
        return authenticationService.authenticate(request.getEmail(), request.getPassword());
    }

    public String loggedEmail(){
        return loggedInUserEmail;
    }

}
