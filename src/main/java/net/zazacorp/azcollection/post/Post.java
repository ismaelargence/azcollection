package net.zazacorp.azcollection.post;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Blob;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Document
public class Post {
    @Id
    private String id;
    private String description;
    private String longitude;
    private String latitude;
   // private Blob picture;
    private LocalDateTime created;

    public Post(String description, String longitude, String latitude) {
        this.description = description;
        this.longitude = longitude;
        this.latitude = latitude;
        //this.picture = picture;
        this.created = LocalDateTime.now();
    }

    public Post(String longitude, String latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
       // this.picture = picture;
        this.created = LocalDateTime.now();
    }

}
