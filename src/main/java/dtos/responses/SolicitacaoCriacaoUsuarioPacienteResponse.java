package dtos.responses;

public record SolicitacaoCriacaoUsuarioPacienteResponse(Long id, SolicitacaoContaUsuarioResponse solicitacaoContaUsuarioResponse, String nome, String email, EnderecoUsuarioResponse enderecoUsuario, String celular) {
}
