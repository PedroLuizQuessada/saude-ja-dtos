package dtos.responses;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dtos.abstrato.Page;

import java.util.List;

public class PostoSaudePageResponse extends Page<PostoSaudeResponse> {
    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public PostoSaudePageResponse(
            @JsonProperty("page") int page,
            @JsonProperty("size") int size,
            @JsonProperty("content") List<PostoSaudeResponse> content
    ) {
        super(page, size, content);
    }
}
