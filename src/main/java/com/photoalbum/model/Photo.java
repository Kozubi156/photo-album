package com.photoalbum.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String privacy;
    private String uploaderName;
    private String uploaderPhoneNumber;
    private String uploaderEmail;
    private String uploaderAddress;
    private String view;

    @OneToOne(mappedBy = "photo", cascade = CascadeType.ALL)
    private UploadHistory uploadHistory;

    @ManyToOne(cascade = CascadeType.ALL)
    private Location location;

    @ManyToOne(cascade = CascadeType.ALL)
    private Album album;

    @OneToMany(mappedBy = "photo", cascade = CascadeType.ALL)
    private Set<Comment> comment;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Tag> tag;
}

