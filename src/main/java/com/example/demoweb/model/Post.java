package com.example.demoweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {


    private String text;

    @Id
    @GeneratedValue
    private Long id;

    private int likes;

    private Date creationDate;

    public Post() {
    }

    public Post(String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
    }

    public Post(Long id,String text,Date creationDate) {
        this.text = text;
        this.id = id;
        this.creationDate = creationDate;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }
    public Date getCreationDate() {
        return creationDate;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Long getId() {
        return id;
    }
}
