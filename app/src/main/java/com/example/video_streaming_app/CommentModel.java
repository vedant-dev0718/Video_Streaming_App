package com.example.video_streaming_app;

public class CommentModel {
    public CommentModel() {
    }

    public CommentModel(String date, String time, String uid, String userimage, String usermsg, String username) {
        this.date = date;
        this.time = time;
        this.uid = uid;
        this.userimage = userimage;
        this.usermsg = usermsg;
        this.username = username;
    }

    String date;
    String time;
    String uid;
    String userimage;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserimage() {
        return userimage;
    }

    public void setUserimage(String userimage) {
        this.userimage = userimage;
    }

    public String getUsermsg() {
        return usermsg;
    }

    public void setUsermsg(String usermsg) {
        this.usermsg = usermsg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    String usermsg;
    String username;
}