package dtos.responses;

import enums.TipoUsuarioEnum;

public record CredenciaisUsuarioResponse(String email, String senha, TipoUsuarioEnum tipo) {
}
