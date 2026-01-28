package dtos.responses;

import java.time.LocalDateTime;

public record SolicitacaoContaUsuarioResponse(Long id, LocalDateTime validade, boolean consumida, String email) {
}
