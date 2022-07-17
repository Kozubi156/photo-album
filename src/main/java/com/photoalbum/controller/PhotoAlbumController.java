package com.photoalbum.controller;

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
    public ResponseEntity<Photo> addPhoto(@RequestBody @Valid Photo photo){
        this.photoAlbumServiceImpl.addPhoto(photo);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/photos/{id}")
    public ResponseEntity<Photo> updatePhoto(@PathVariable Long id, @RequestBody Photo photo){
        photoAlbumServiceImpl.updatePhoto(id, photo);
        return ResponseEntity.status(HttpStatus.OK).body(photoAlbumServiceImpl.getPhoto(id));
    }

    @GetMapping("/photos/{id}")
    public ResponseEntity<Photo> getPhotoPhotoById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(photoAlbumServiceImpl.getPhoto(id));
    }

    @DeleteMapping ("/photos/{id}")
    public ResponseEntity<Void> deletePhoto(@PathVariable Long id){
        photoAlbumServiceImpl.deletePhoto(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
