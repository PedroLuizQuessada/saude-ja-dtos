package dtos.responses;

import enums.TipoUsuarioEnum;

public record CredenciaisUsuarioResponse(Long id, String senha, TipoUsuarioEnum tipo) {
}
