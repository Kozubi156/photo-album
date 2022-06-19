package com.photoalbum.service;

import com.photoalbum.dto.PhotoDTO;
import com.photoalbum.model.Photo;

public interface PhotoAlbumService {

    Photo addPhoto(PhotoDTO photoDTO);
}
