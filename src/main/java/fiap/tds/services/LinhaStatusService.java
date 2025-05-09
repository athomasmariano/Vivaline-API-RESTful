package fiap.tds.services;

import fiap.tds.dtos.LinhaStatusDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LinhaStatusService {
    private List<LinhaStatusDto> statusList = new ArrayList<>();

    public LinhaStatusService() {
        statusList.add(new LinhaStatusDto(1, "Amarela", "Operação normal"));
        statusList.add(new LinhaStatusDto(2, "Lilás", "Operação normal"));
        statusList.add(new LinhaStatusDto(3, "Diamante", "Operação normal"));
        statusList.add(new LinhaStatusDto(4, "Esmeralda", "Operação normal"));
    }

    public List<LinhaStatusDto> listarStatus() {
        return statusList;
    }

    public boolean validarStatus(LinhaStatusDto linhaStatusDto) {
        return linhaStatusDto != null && linhaStatusDto.getNomeLinha() != null && !linhaStatusDto.getNomeLinha().isEmpty()
                && linhaStatusDto.getStatus() != null && !linhaStatusDto.getStatus().isEmpty();
    }

    public void adicionarStatus(LinhaStatusDto linhaStatusDto) {
        if (validarStatus(linhaStatusDto)) {
            statusList.add(linhaStatusDto);
        }
    }

    public boolean removerStatus(int id) {
        Optional<LinhaStatusDto> linhaStatus = statusList.stream()
                .filter(status -> status.getId() == id)
                .findFirst();

        if (linhaStatus.isPresent()) {
            statusList.remove(linhaStatus.get());
            return true;
        }
        return false;
    }

    // Método para atualizar o status de uma linha
    public boolean atualizarStatus(int id, LinhaStatusDto linhaStatusDto) {
        Optional<LinhaStatusDto> linhaStatus = statusList.stream()
                .filter(status -> status.getId() == id)
                .findFirst();

        if (linhaStatus.isPresent()) {
            LinhaStatusDto statusToUpdate = linhaStatus.get();
            statusToUpdate.setStatus(linhaStatusDto.getStatus());  // Atualiza o status da linha
            return true;
        }
        return false;  // Retorna false se o status não for encontrado
    }
}
