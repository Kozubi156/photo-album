package com.photoalbum.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class PhotoDTO implements Serializable {
    private final String title;
    private final String description;
    private final String privacy;
    private final String uploaderName;
    private final String uploaderPhoneNumber;
    private final String uploaderEmail;
    private final String uploaderAddress;
    private final String view;
    private final String locationName;
    private final String locationShortName;
    private final Set<String> tags;
    private final AlbumDTO album;
}
