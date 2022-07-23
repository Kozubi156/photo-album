package com.photoalbum.repository;

import com.photoalbum.model.Album;
import org.springframework.data.repository.CrudRepository;

public interface JpaAlbumRepository extends CrudRepository<Album, Long> {
}
