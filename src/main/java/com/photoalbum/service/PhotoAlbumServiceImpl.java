package com.photoalbum.service;

import com.photoalbum.model.*;
import com.photoalbum.repository.PhotoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class PhotoAlbumServiceImpl implements PhotoAlbumService {

    private final PhotoRepository photoRepository;

    public Photo addPhoto(Photo photo) {
        UploadHistory uploadHistory = new UploadHistory();
        Tag tag = new Tag();
        Set<Tag> tags = new HashSet<>();
        Set<Photo> photos = new HashSet<>();
        Set<Comment> comments = new HashSet<>();
        Comment comment = new Comment();
        Album album = new Album();
        Location location = new Location();

        uploadHistory.setDate(new Date());
        uploadHistory.setPhoto(photo);
        photo.setUploadHistory(uploadHistory);

        tags.add(tag);
        photo.setTag(tags);

        album.setPhotos(photos);
        photo.setAlbum(album);

        comment.setPhoto(photo);
        photo.setComment(comments);

        photo.setLocation(location);
        location.setPhotos(photos);

        return photoRepository.save(photo);
    }
}
