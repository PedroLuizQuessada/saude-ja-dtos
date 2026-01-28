package dtos.requests;

public record AtualizarProprioUsuarioRequest(String nome, String email, EnderecoUsuarioRequest enderecoUsuario, String celular) {
}
