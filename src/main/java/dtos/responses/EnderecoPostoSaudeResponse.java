package dtos.responses;

import enums.EstadoEnum;

public record EnderecoPostoSaudeResponse(Long id, EstadoEnum estado, String cidade, String bairro, String rua, String numero, String complemento, String cep) {
}
