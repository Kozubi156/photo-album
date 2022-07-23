package com.photoalbum.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AlbumDto implements Serializable {
    private final String title;
    private final String description;
    private final String view;
}
