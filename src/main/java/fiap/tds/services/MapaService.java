package fiap.tds.services;

import fiap.tds.entities.Mapa;

import java.util.ArrayList;
import java.util.List;

public class MapaService {

    private static final List<Mapa> estacoes = new ArrayList<>(List.of(
            new Mapa("Estação Paulista", -23.5505, -46.6333, new String[]{"Linha Amarela", "Linha Verde"}),
            new Mapa("Estação Consolação", -23.6000, -46.6500, new String[]{"Linha Verde"})
    ));

    public List<Mapa> listarEstacoes() {
        return estacoes;
    }

    public void adicionarEstacao(Mapa novaEstacao) {
        estacoes.add(novaEstacao);
    }

    public boolean removerEstacao(String nomeEstacao) {
        return estacoes.removeIf(estacao -> estacao.getNomeEstacao().equalsIgnoreCase(nomeEstacao));
    }
}
