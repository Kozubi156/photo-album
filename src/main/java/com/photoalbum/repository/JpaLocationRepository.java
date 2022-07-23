package com.photoalbum.repository;

import com.photoalbum.model.Album;
import com.photoalbum.model.Location;
import org.springframework.data.repository.CrudRepository;

public interface JpaLocationRepository extends CrudRepository<Location, Long> {
}
