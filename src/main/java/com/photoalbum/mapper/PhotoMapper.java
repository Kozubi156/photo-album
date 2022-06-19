package com.photoalbum.mapper;

import com.photoalbum.dto.PhotoDTO;
import com.photoalbum.model.Photo;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface PhotoMapper {

    Photo map(PhotoDTO photoDTO);
}
