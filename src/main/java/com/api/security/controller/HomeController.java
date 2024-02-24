package com.api.security.controller;


import com.api.security.models.AuthenticationRequest;
import com.api.security.models.AuthenticationResponse;
import com.api.security.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HomeController {

    private final AuthenticationManager authenticationManagerBean;
    private final JwtUtil jwtUtil;


    @GetMapping("/user")
    public String user() {
        return "Hello, User !!";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> generateJwtTokenForUser(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManagerBean.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUserName(), authenticationRequest.getPassword()));
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password " , e);
        }

        String token = jwtUtil.generateToken(authenticationRequest.getUserName());

        return  ResponseEntity.ok(new AuthenticationResponse(token));
    }
}
