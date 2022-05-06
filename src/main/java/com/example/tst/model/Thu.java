package com.example.tst.model;

import javax.persistence.*;

@Entity
@Table(name = "thu", uniqueConstraints = {

        @UniqueConstraint(columnNames = "id"),
        @UniqueConstraint(columnNames = "title"),
        @UniqueConstraint(columnNames = "content")})
public class Thu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "content", nullable = false)
    private String content;

    public Thu() {
    }

    public Thu(String title, String content) {
        this.setId(id);
        this.setTitle(title);
        this.setContent(content);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Tuesday{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
