package com.chulm.shorturl.domain.model;


import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity(name="SHORT_URL")
public class ShortUrl extends AbstractEntity implements Serializable {

    /* ID link CachedUrl*/
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable=false)
    private long id;

    @Column(nullable=false)
    private String link;

    @Column(nullable=false)
    private int status;

    public ShortUrl(String link, int status) {
        this.link = link;
        this.status = status;
    }

    @Override
    public LocalDateTime createDate() {
        return LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "ShortUrl{" +
                "link='" + link + '\'' +
                ", status=" + status +
                '}';
    }
}
