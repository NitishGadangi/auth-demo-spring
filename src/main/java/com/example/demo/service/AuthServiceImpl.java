package com.example.demo.service;

import com.example.demo.models.SignIn;
import com.example.demo.models.SignUp;
import com.example.demo.models.Status;
import com.example.demo.repo.CredentialsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{

    @Autowired
    private CredentialsRepo credentialsRepo;

    //Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character:
    private String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

    //anystring@anystring.anystring
    private String EMAIL_REGEX = "/^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$/";

    @Override
    public Status signIn(SignIn signIn) {
        if(credentialsRepo.retrive(signIn)){
            return new Status(true);
        }
        return new Status(false);
    }

    @Override
    public Status signUp(SignUp signUp) {
        String[] emailPattern = signUp.getEmail().split("@");
        if(signUp.getPassword().contains(emailPattern[0])) return new Status(false);
        if(!signUp.getPassword().matches(PASSWORD_REGEX)) return new Status(false);
        if(!signUp.getEmail().matches(EMAIL_REGEX)) return new Status(false);
        credentialsRepo.save(signUp);
        return new Status(true);
    }

    @Override
    public void clean() {
        credentialsRepo.clear();
    }
}
