package com.photoalbum.repository;

import com.photoalbum.model.Photo;
import org.springframework.data.repository.CrudRepository;


public interface JpaPhotoRepository extends CrudRepository<Photo, Long> {

}
