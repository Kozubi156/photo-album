package com.photoalbum.service;

import com.photoalbum.model.Photo;

import java.util.List;


public interface PhotoAlbumService {

    Photo addPhoto(Photo photo);
    void updatePhoto(Long id, Photo photo);

    Photo getPhoto(Long id);

    List<Photo> getAllPhotos();

    void deletePhoto(Long id);
}
