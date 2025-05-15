package fiap.tds.entities;

public class Mapa {
    private String nomeEstacao;
    private double latitude;
    private double longitude;
    private String[] linhas;

    public Mapa() {}

    public Mapa(String nomeEstacao, double latitude, double longitude, String[] linhas) {
        this.nomeEstacao = nomeEstacao;
        this.latitude = latitude;
        this.longitude = longitude;
        this.linhas = linhas;
    }

    // Getters e Setters

    public String getNomeEstacao() {
        return nomeEstacao;
    }

    public void setNomeEstacao(String nomeEstacao) {
        this.nomeEstacao = nomeEstacao;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String[] getLinhas() {
        return linhas;
    }

    public void setLinhas(String[] linhas) {
        this.linhas = linhas;
    }
}
