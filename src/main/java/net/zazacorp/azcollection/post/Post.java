package net.zazacorp.azcollection.post;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Blob;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Document
public class Post {
    @Id
    private String id;
    @Indexed(unique = true)
    private String name;
    private String description;
    private String longitude;
    private String latitude;
   // private Blob picture;
    private LocalDateTime created;

    public Post(String name, String description, String longitude, String latitude) {
        this.name = name;
        this.description = description;
        this.longitude = longitude;
        this.latitude = latitude;
        //this.picture = picture;
        this.created = LocalDateTime.now();
    }
}
