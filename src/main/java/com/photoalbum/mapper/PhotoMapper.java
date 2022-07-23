package com.photoalbum.mapper;

import com.photoalbum.model.Photo;
import com.photoalbum.dto.PhotoDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhotoMapper {
    Photo map(PhotoDto photoCreationDTO);
}
