package dtos.requests;

import java.time.LocalDateTime;

public record CriarConsultaRequest(LocalDateTime data, Boolean domiciliar) {
}
