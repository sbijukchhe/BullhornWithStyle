package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Message {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 10)
    String content;

    @NotNull
    String posteddate;

    @NotNull
    String sentby;

    public Message() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPosteddate() {
        return posteddate;
    }

    public void setPosteddate(String posteddate) {
        this.posteddate = posteddate;
    }

    public String getSentby() {
        return sentby;
    }

    public void setSentby(String sentby) {
        this.sentby = sentby;
    }

    @Override
    public String toString() {
        return "com.example.demo.Message{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", posteddate='" + posteddate + '\'' +
                ", sentby='" + sentby + '\'' +
                '}';
    }
}
