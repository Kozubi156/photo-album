package to_be_completed.mapper;

import com.photoalbum.model.Photo;
import to_be_completed.dto.PhotoDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface PhotoMapper {

    Photo map(PhotoDTO photoCreationDTO);
    PhotoDTO map(Photo photo);
}
