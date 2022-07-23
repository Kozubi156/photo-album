package com.photoalbum.repository;

import com.photoalbum.model.Album;
import com.photoalbum.model.UploadHistory;
import org.springframework.data.repository.CrudRepository;

public interface JpaUploadHistoryRepository extends CrudRepository<UploadHistory, Long> {
}
