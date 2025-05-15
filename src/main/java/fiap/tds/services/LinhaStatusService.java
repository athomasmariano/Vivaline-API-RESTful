package fiap.tds.services;

import fiap.tds.entities.LinhaStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LinhaStatusService {
    private List<LinhaStatus> statusList = new ArrayList<>();

    public LinhaStatusService() {
        statusList.add(new LinhaStatus(1, "Amarela", "Operação normal"));
        statusList.add(new LinhaStatus(2, "Lilás", "Operação normal"));
        statusList.add(new LinhaStatus(3, "Diamante", "Operação normal"));
        statusList.add(new LinhaStatus(4, "Esmeralda", "Operação normal"));
    }

    public List<LinhaStatus> listarStatus() {
        return statusList;
    }

    public boolean validarStatus(LinhaStatus linhaStatus) {
        return linhaStatus != null && linhaStatus.getNomeLinha() != null && !linhaStatus.getNomeLinha().isEmpty()
                && linhaStatus.getStatus() != null && !linhaStatus.getStatus().isEmpty();
    }

    public void adicionarStatus(LinhaStatus linhaStatus) {
        if (validarStatus(linhaStatus)) {
            statusList.add(linhaStatus);
        }
    }

    public boolean removerStatus(int id) {
        Optional<LinhaStatus> linhaStatus = statusList.stream()
                .filter(status -> status.getId() == id)
                .findFirst();

        if (linhaStatus.isPresent()) {
            statusList.remove(linhaStatus.get());
            return true;
        }
        return false;
    }

    // Método para atualizar o status de uma linha
    public boolean atualizarStatus(int id, LinhaStatus linhaStatusDto) {
        Optional<LinhaStatus> linhaStatus = statusList.stream()
                .filter(status -> status.getId() == id)
                .findFirst();

        if (linhaStatus.isPresent()) {
            LinhaStatus statusToUpdate = linhaStatus.get();
            statusToUpdate.setStatus(linhaStatusDto.getStatus());  // Atualiza o status da linha
            return true;
        }
        return false;  // Retorna false se o status não for encontrado
    }
}
