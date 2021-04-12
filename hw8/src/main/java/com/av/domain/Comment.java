package com.av.domain;

public class Comment {

    private String userName;
    private String text;

    public Comment() {
    }

    public Comment(String userName, String text) {
        super();
           this.userName = userName;
        this.text = text;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Comment{"
                + ", userName='" + userName + '\''
                + ", text='" + text + '\''
                + '}';
    }
}
