package dtos.requests;

import java.time.LocalDateTime;

public record AgendarConsultaRequest(LocalDateTime data, Long medico) {
}
