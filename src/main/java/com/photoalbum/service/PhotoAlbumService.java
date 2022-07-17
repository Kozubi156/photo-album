package com.photoalbum.service;

import com.photoalbum.model.Photo;


public interface PhotoAlbumService {

    Photo addPhoto(Photo photo);
    void updatePhoto(Long id, Photo photo);

    Photo getPhoto(Long id);

    void deletePhoto(Long id);
}
