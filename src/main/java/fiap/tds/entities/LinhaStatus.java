package fiap.tds.entities;

public class LinhaStatus {
    private int id;
    private String nomeLinha;
    private String status; // Ex: "Operando normalmente", "Com atraso", "Paralisada"

    public LinhaStatus() {}

    public LinhaStatus(int id, String nomeLinha, String status) {
        this.id = id;
        this.nomeLinha = nomeLinha;
        this.status = status;
    }

// Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeLinha() {
        return nomeLinha;
    }

    public void setNomeLinha(String nomeLinha) {
        this.nomeLinha = nomeLinha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
