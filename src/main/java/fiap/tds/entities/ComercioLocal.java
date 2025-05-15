package fiap.tds.entities;

public class ComercioLocal {
    private String nome;
    private String tipo;
    private String endereco;

    public ComercioLocal() {}

    public ComercioLocal(String nome, String tipo, String endereco) {
        this.nome = nome;
        this.tipo = tipo;
        this.endereco = endereco;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
