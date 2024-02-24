package com.api.security.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationRequest {

    private String userName;
    private String password;
}
