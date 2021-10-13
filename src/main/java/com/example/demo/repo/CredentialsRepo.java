package com.example.demo.repo;

import com.example.demo.models.SignIn;
import com.example.demo.models.SignUp;

public interface CredentialsRepo {
    void save(SignUp signUp);
    boolean retrive(SignIn signIn);
    void clear();
}
