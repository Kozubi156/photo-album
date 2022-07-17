package to_be_completed.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AlbumDTO implements Serializable {
    private final String title;
    private final String description;
    private final String view;
}
