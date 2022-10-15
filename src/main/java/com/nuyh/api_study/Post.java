package com.nuyh.api_study;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    private Long id;
    private String topic;
    private String category;
    private String content;
    private int likes;
    private LocalDateTime date;

    public Post(Long id, String topic, String category, int likes, LocalDateTime date) {
        this.id = id;
        this.topic = topic;
        this.category = category;
        this.likes = likes;
        this.date = date;
    }

    public Post() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", category='" + category + '\'' +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                ", date=" + date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +
                '}';
    }
}
