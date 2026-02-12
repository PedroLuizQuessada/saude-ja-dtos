package dtos.responses;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dtos.abstrato.Page;

import java.util.List;

public class PacienteIdPageResponse extends Page<Long> {
    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public PacienteIdPageResponse(
            @JsonProperty("page") int page,
            @JsonProperty("size") int size,
            @JsonProperty("content") List<Long> content
    ) {
        super(page, size, content);
    }
}
