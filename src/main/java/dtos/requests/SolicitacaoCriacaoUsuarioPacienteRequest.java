package dtos.requests;

public record SolicitacaoCriacaoUsuarioPacienteRequest(String nome, String email, String senha, EnderecoUsuarioRequest enderecoUsuario, String celular) {
}
