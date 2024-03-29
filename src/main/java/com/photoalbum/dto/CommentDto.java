package com.photoalbum.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CommentDto implements Serializable {
    private final Date postDate;
    private final String content;
}
