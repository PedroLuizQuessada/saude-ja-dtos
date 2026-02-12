package dtos.requests;

import enums.EstadoEnum;

public record EnderecoPostoSaudeRequest(EstadoEnum estado, String cidade, String bairro, String rua, String numero, String complemento, String cep) {
}
