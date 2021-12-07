package com.example.demo.controllers;

import com.example.demo.models.*;
import com.example.demo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("/chat/history")
    public ChatHistory getChatHistory(){
        ArrayList<Chat> chatArrayList = new ArrayList<>();
        chatArrayList.add(new Chat("Chat1", "https://banner2.cleanpng.com/20180427/ubq/kisspng-royalty-free-computer-icons-stock-photography-5ae31695b3df41.9958176715248318937368.jpg","1638886816","Hello World", ""));
        chatArrayList.add(new Chat("Chat2", "https://banner2.cleanpng.com/20180427/ubq/kisspng-royalty-free-computer-icons-stock-photography-5ae31695b3df41.9958176715248318937368.jpg","1638886816","Hello World", ""));
        chatArrayList.add(new Chat("Chat3", "https://banner2.cleanpng.com/20180427/ubq/kisspng-royalty-free-computer-icons-stock-photography-5ae31695b3df41.9958176715248318937368.jpg","1638886816","Hello World", ""));
        chatArrayList.add(new Chat("Chat4", "https://banner2.cleanpng.com/20180427/ubq/kisspng-royalty-free-computer-icons-stock-photography-5ae31695b3df41.9958176715248318937368.jpg","1638886816","Hello World", ""));
        ChatHistory history = new ChatHistory(true, "success", chatArrayList);
        return history;
    }
}
