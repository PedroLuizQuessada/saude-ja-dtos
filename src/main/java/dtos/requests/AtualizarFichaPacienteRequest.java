package dtos.requests;

import enums.GeneroEnum;

public record AtualizarFichaPacienteRequest(Long paciente, GeneroEnum genero, Boolean hipertensao, Boolean diabetes, Boolean aids, String observacoes) {
}
