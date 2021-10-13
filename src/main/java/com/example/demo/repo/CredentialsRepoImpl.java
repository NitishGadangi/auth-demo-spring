package com.example.demo.repo;

import com.example.demo.models.SignIn;
import com.example.demo.models.SignUp;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@Repository
public class CredentialsRepoImpl implements CredentialsRepo{

    private HashMap<String, String> credentialStore;

    @PostConstruct
    private void init(){
        credentialStore = new HashMap<>();
    }

    @Override
    public void save(SignUp signUp) {
        String key = signUp.getEmail();
        String value = DigestUtils.sha256Hex(signUp.getPassword());
        credentialStore.put(key, value);
    }

    @Override
    public boolean retrive(SignIn signIn) {
        String key = signIn.getEmail();
        if(credentialStore.containsKey(key)){
            String value = DigestUtils.sha256Hex(signIn.getPassword());
            if (credentialStore.get(key).equals(value)) return true;
        }
        return false;
    }

    @Override
    public void clear() {
        credentialStore.clear();
    }
}
