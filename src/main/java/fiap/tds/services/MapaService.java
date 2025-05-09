package fiap.tds.services;

import fiap.tds.dtos.MapaDto;

import java.util.ArrayList;
import java.util.List;

public class MapaService {

    private static final List<MapaDto> estacoes = new ArrayList<>(List.of(
            new MapaDto("Estação Paulista", -23.5505, -46.6333, new String[]{"Linha Amarela", "Linha Verde"}),
            new MapaDto("Estação Consolação", -23.6000, -46.6500, new String[]{"Linha Verde"})
    ));

    public List<MapaDto> listarEstacoes() {
        return estacoes;
    }

    public void adicionarEstacao(MapaDto novaEstacao) {
        estacoes.add(novaEstacao);
    }

    public boolean removerEstacao(String nomeEstacao) {
        return estacoes.removeIf(estacao -> estacao.getNomeEstacao().equalsIgnoreCase(nomeEstacao));
    }
}
