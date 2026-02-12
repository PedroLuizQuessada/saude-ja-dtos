package dtos.responses;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dtos.abstrato.Page;

import java.util.List;

public class ProfissionalSaudeIdPageResponse extends Page<Long> {
    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public ProfissionalSaudeIdPageResponse(
            @JsonProperty("page") int page,
            @JsonProperty("size") int size,
            @JsonProperty("content") List<Long> content
    ) {
        super(page, size, content);
    }
}
