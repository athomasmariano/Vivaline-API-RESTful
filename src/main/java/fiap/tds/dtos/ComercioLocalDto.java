package fiap.tds.dtos;

public class ComercioLocalDto {
    private String nome;
    private String tipo;
    private String endereco;

    public ComercioLocalDto() {}

    public ComercioLocalDto(String nome, String tipo, String endereco) {
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
