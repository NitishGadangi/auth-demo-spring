package com.example.demo.models;

import java.util.List;

public class ChatHistory {
    public boolean status;
    public String message;
    public List<Chat> data;

    public ChatHistory(boolean status, String message, List<Chat> data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Chat> getData() {
        return data;
    }

    public void setData(List<Chat> data) {
        this.data = data;
    }
}
