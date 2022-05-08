package com.example.tst.model;

import javax.persistence.*;

@Entity
@Table(name = "wed", uniqueConstraints = {

        @UniqueConstraint(columnNames = "id"),
        @UniqueConstraint(columnNames = "title"),
        @UniqueConstraint(columnNames = "content"),
        @UniqueConstraint(columnNames = "link")

})
public class Wed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "content", nullable = false)
    private String content;
    @Column(name = "link")
    private String link;
    @Column(name = "clink")
    private String clink;
    @Column(name = "used")
    private String used;



    public Wed() {
    }

    public Wed(String title, String content, String link, String clink, String used) {
        this.title = title;
        this.content = content;
        this.link = link;
        this.clink = clink;
        this.used = used;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public String getClink() {
        return clink;
    }

    public void setClink(String clink) {
        this.clink = clink;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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

}
