package com.photoalbum.service;

import com.photoalbum.dto.PhotoCreationDTO;
import com.photoalbum.model.Photo;


public interface PhotoAlbumService {

    Photo addPhoto(PhotoCreationDTO photoCreationDTO);

    Photo getPhotoById(Long id);

    void deletePhoto(Long id);
}
