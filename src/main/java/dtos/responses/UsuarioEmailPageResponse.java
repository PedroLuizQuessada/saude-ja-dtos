package dtos.responses;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dtos.abstrato.Page;

import java.util.List;

public class UsuarioEmailPageResponse extends Page<String> {

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public UsuarioEmailPageResponse(
            @JsonProperty("page") int page,
            @JsonProperty("size") int size,
            @JsonProperty("content") List<String> content
    ) {
        super(page, size, content);
    }
}
