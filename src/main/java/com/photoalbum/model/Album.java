package com.photoalbum.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String view;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    private Set<Photo> photos;

}
