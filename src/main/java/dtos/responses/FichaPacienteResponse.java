package dtos.responses;

import enums.GeneroEnum;

import java.time.LocalDate;

public record FichaPacienteResponse(Long id, Long paciente, LocalDate dataNascimento, GeneroEnum genero, Boolean hipertensao, Boolean diabetes, Boolean aids, String observacoes) {
}
