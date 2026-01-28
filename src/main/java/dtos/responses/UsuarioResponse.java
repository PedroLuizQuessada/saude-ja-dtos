package dtos.responses;

import enums.TipoUsuarioEnum;

public record UsuarioResponse(Long id, String nome, String email, TipoUsuarioEnum tipo, EnderecoUsuarioResponse enderecoUsuario, String celular) {
}
