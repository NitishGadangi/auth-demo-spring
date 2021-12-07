package com.example.demo.models;

public class Chat {
    public String title;
    public String image;
    public String time_stamp;
    public String recent_chat;
    public String web_url;

    public Chat(String title, String image, String time_stamp, String recent_chat, String web_url) {
        this.title = title;
        this.image = image;
        this.time_stamp = time_stamp;
        this.recent_chat = recent_chat;
        this.web_url = web_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }

    public String getRecent_chat() {
        return recent_chat;
    }

    public void setRecent_chat(String recent_chat) {
        this.recent_chat = recent_chat;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }
}
