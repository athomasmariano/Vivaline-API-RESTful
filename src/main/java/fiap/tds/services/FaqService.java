package fiap.tds.services;

import fiap.tds.entities.Faq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FaqService {

    private List<Faq> faqs = new ArrayList<>(Arrays.asList(
            new Faq("O totem mostra se há atrasos ou problemas na linha?", "Sim. Informações sobre atrasos ou ocorrências operacionais são atualizadas em tempo real na seção \"Status das Linhas\"."),
            new Faq("Como criar uma conta no sistema Vivaline?", "Na primeira vez que usar, toque em \"Cadastrar\" no canto superior do site. Preencha seus dados básicos e crie uma senha para ter acesso a funcionalidades personalizadas."),
            new Faq("Como voltar ao menu inicial do totem?", "Toque no botão “Início” localizado no canto inferior esquerdo da tela para retornar ao menu principal a qualquer momento.")
            // Adicione mais perguntas fixas aqui, se necessário
    ));

    private List<Faq> mensagens = new ArrayList<>();

    public List<Faq> listarFaqs() {
        List<Faq> todos = new ArrayList<>(faqs);
        todos.addAll(mensagens); // junta perguntas fixas + mensagens de usuários
        return todos;
    }

    public String registrarContato(Faq dto) {
        if (dto.getEmail() != null && dto.getMensagem() != null) {
            mensagens.add(dto);
            return "Mensagem enviada com sucesso! Em breve entraremos em contato por e-mail.";
        } else {
            return "Erro: Email e mensagem são obrigatórios.";
        }
    }
}
