package com.photoalbum.service;

import com.photoalbum.dto.PhotoDto;
import com.photoalbum.exception.PhotoException;
import com.photoalbum.mapper.PhotoMapper;
import com.photoalbum.model.Location;
import com.photoalbum.model.Photo;
import com.photoalbum.model.Tag;
import com.photoalbum.model.UploadHistory;
import com.photoalbum.repository.JpaAlbumRepository;
import com.photoalbum.repository.JpaPhotoRepository;
import com.photoalbum.repository.JpaTagRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
@AllArgsConstructor
public class PhotoAlbumServiceImpl implements PhotoAlbumService {

    private final JpaPhotoRepository jpaPhotoRepository;
    private final JpaTagRepository jpaTagRepository;
    private final PhotoMapper photoMapper;

    public void addPhoto(PhotoDto photoDTO) {
        Photo photo = photoMapper.map(photoDTO);
        UploadHistory uploadHistory = new UploadHistory();

        Tag tag = new Tag();
        Set<Tag> tags = new HashSet<>();
        Set<Photo> photos = new HashSet<>();
        Location location = new Location();

        uploadHistory.setDate(new Date());
        uploadHistory.setPhoto(photo);
        photo.setUploadHistory(uploadHistory);

        tag.setTitle(String.valueOf(photo.getTag()));
        tags.add(tag);
        photo.setTag(tags);
        photo.setLocation(location);
        location.setPhotos(photos);

        jpaPhotoRepository.save(photo);
    }

    @Override
    public void updatePhoto(Long id, Photo photo) {
        if (jpaPhotoRepository.existsById(id)) {
            Photo existingPhoto = jpaPhotoRepository.findById(id).get();
            existingPhoto.setTitle(photo.getTitle());
            existingPhoto.setDescription(photo.getDescription());
            existingPhoto.setDescription(photo.getDescription());
            existingPhoto.setUploaderEmail(photo.getUploaderEmail());
            existingPhoto.setUploaderPhoneNumber(photo.getUploaderPhoneNumber());
            existingPhoto.setUploaderAddress(photo.getUploaderAddress());
            existingPhoto.setAlbum(photo.getAlbum());
            existingPhoto.setLocation(photo.getLocation());
            existingPhoto.setTag(photo.getTag());
            existingPhoto.setComment(photo.getComment());
            jpaPhotoRepository.save(existingPhoto);
        } else {
            throw new PhotoException("Photo with id: " + id + " not found");
        }
    }

    @Override
    public Photo getPhoto(Long id) {
        return jpaPhotoRepository.findById(id).orElseThrow(() -> new PhotoException("Photo with ID: " + id + " not found"));
    }

    @Override
    public List<Photo> getAllPhotos() {
        return (List<Photo>) jpaPhotoRepository.findAll();
    }

    @Override
    public void deletePhoto(Long id) {
        if(jpaPhotoRepository.findById(id).isPresent()){
            jpaPhotoRepository.deleteById(id);
        } else  {
            throw new PhotoException("Photo with ID: " + id + " not found");
        }
    }
}
