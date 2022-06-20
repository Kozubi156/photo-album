package com.photoalbum.controller;

import com.photoalbum.dto.PhotoCreationDTO;
import com.photoalbum.model.Photo;
import com.photoalbum.service.PhotoAlbumServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/photoalbum")
@RequiredArgsConstructor
@Validated
public class PhotoAlbumController {

    private final PhotoAlbumServiceImpl photoAlbumServiceImpl;

    @PostMapping("/photos")
    public ResponseEntity<Photo> addPhoto(@RequestBody @Valid PhotoCreationDTO photoCreationDTO){
        this.photoAlbumServiceImpl.addPhoto(photoCreationDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/photos/{id}")
    public ResponseEntity<Photo> getPhotoPhotoById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.CREATED).body(photoAlbumServiceImpl.getPhotoById(id));
    }
}
