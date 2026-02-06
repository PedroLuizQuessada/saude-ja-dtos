package dtos.requests;

public record EnviarNotificacaoRequest(String destinatario, String assunto, String mensagem) {
}
