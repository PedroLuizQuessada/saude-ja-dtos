package dtos.responses;

import enums.StatusConsultaEnum;

import java.time.LocalDateTime;

public record ConsultaResponse(Long id, Long paciente, Long medico, LocalDateTime data, StatusConsultaEnum status, String comentarios, Boolean domiciliar) {
}
