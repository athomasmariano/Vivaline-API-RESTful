package fiap.tds.entities;

public class Faq {
    // Para perguntas frequentes
    private String pergunta;
    private String resposta;

    // Para envio de mensagem
    private String email;
    private String mensagem;

    public Faq() {}

    public Faq(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public Faq(String email, String mensagem, boolean contato) {
        this.email = email;
        this.mensagem = mensagem;
    }

    // Getters e Setters
    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}