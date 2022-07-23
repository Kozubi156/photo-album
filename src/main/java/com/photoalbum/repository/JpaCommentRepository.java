package com.photoalbum.repository;

import com.photoalbum.model.Comment;
import org.springframework.data.repository.CrudRepository;

public interface JpaCommentRepository extends CrudRepository<Comment, Long> {
}
