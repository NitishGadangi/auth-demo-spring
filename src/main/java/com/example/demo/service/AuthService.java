package com.example.demo.service;

import com.example.demo.models.SignIn;
import com.example.demo.models.SignUp;
import com.example.demo.models.Status;

public interface AuthService {
    Status signIn(SignIn signIn);
    Status signUp(SignUp signUp);
    void clean();
}
