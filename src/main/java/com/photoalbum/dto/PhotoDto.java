package com.photoalbum.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class PhotoDto implements Serializable {
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
}
