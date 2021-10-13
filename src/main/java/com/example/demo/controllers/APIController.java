package com.example.demo.controllers;

import com.example.demo.models.SignIn;
import com.example.demo.models.SignUp;
import com.example.demo.models.Status;
import com.example.demo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class APIController {

    @Autowired
    private AuthService authService;

    @PostMapping("/sign-up")
    @ResponseBody
    public Status signup(@RequestBody SignUp signUp){
        return authService.signUp(signUp);
    }

    @PostMapping("/sign-in")
    @ResponseBody
    public Status signin(@RequestBody SignIn signIn){
        return authService.signIn(signIn);
    }

    @PostMapping("/clean")
    public void clean(){
        authService.clean();
    }

    @RequestMapping("/")
    public String homePage(){
        return "POST requests only";
    }
}
