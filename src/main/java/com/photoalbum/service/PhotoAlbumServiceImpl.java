package com.photoalbum.service;

import com.photoalbum.dto.PhotoCreationDTO;
import com.photoalbum.mapper.PhotoMapper;
import com.photoalbum.model.Location;
import com.photoalbum.model.Photo;
import com.photoalbum.model.Tag;
import com.photoalbum.model.UploadHistory;
import com.photoalbum.repository.PhotoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Service
@AllArgsConstructor
public class PhotoAlbumServiceImpl implements PhotoAlbumService {

    private final PhotoRepository photoRepository;
    private final PhotoMapper photoMapper;

    public Photo addPhoto(PhotoCreationDTO photoCreationDTO) {
        Photo photo = photoMapper.map(photoCreationDTO);
        UploadHistory uploadHistory = new UploadHistory();
        Tag tag = new Tag();
        Set<Tag> tags = new HashSet<>();
        Set<Photo> photos = new HashSet<>();
        Location location = new Location();

        uploadHistory.setDate(new Date());
        uploadHistory.setPhoto(photo);
        photo.setUploadHistory(uploadHistory);

        tags.add(tag);
        photo.setTag(tags);

        photo.setLocation(location);
        location.setPhotos(photos);

        return photoRepository.save(photo);
    }

    @Override
    public Photo getPhotoById(Long id) {

    }

    @Override
    public void deletePhoto(Long id) {
        photoRepository.deleteById(id);
    }
}
