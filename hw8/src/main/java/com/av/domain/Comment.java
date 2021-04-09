package com.av.domain;


public class Comment {
    private long id;
    private String userName;
    private String text;

    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
                + "id=" + id
                + ", userName='" + userName + '\''
                + ", text='" + text + '\''
                + '}';
    }
}
