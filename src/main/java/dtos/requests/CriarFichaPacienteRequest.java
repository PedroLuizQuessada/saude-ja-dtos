package dtos.requests;

import enums.GeneroEnum;

import java.time.LocalDate;

public record CriarFichaPacienteRequest(Long paciente, LocalDate dataNascimento, GeneroEnum genero, Boolean hipertensao, Boolean diabetes, Boolean aids, String observacoes) {
}
