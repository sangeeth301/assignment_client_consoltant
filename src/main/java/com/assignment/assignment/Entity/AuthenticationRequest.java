package com.assignment.assignment.Entity;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String email;
    private String password;
}
