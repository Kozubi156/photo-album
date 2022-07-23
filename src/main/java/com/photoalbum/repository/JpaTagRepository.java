package com.photoalbum.repository;

import com.photoalbum.model.Album;
import com.photoalbum.model.Tag;
import org.springframework.data.repository.CrudRepository;

public interface JpaTagRepository extends CrudRepository<Tag, Long> {

}
