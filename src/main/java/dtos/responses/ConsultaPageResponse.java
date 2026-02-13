package dtos.responses;

import dtos.abstrato.Page;

import java.util.List;

public class ConsultaPageResponse extends Page<ConsultaResponse> {
    public ConsultaPageResponse(int page, int size, List<ConsultaResponse> content) {
        super(page, size, content);
    }
}
