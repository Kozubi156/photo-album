package com.photoalbum.controller;

import com.photoalbum.dto.PhotoDTO;
import com.photoalbum.model.Photo;
import com.photoalbum.service.PhotoAlbumServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/photoalbum")
@RequiredArgsConstructor
@Validated
public class PhotoAlbumController {

    private final PhotoAlbumServiceImpl photoAlbumServiceImpl;

    @PostMapping("/photos")
    public ResponseEntity<Photo> addPhoto(@RequestBody PhotoDTO photoDTO){
        this.photoAlbumServiceImpl.addPhoto(photoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
