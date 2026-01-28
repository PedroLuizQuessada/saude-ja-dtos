package dtos.requests;

import enums.TipoUsuarioEnum;

public record CriarUsuarioRequest(String nome, String email, String senha, TipoUsuarioEnum tipo, EnderecoUsuarioRequest enderecoUsuario, String celular) {
}
