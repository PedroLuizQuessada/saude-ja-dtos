package dtos.requests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dtos.abstrato.Page;

import java.util.List;

public class ProfissionalSaudeIdPageRequest extends Page<Long> {

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public ProfissionalSaudeIdPageRequest(
            @JsonProperty("page") int page,
            @JsonProperty("size") int size,
            @JsonProperty("content") List<Long> content
    ) {
        super(page, size, content);
    }
}
