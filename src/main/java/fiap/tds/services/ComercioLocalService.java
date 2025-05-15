package fiap.tds.services;

import fiap.tds.entities.ComercioLocal;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ComercioLocalService {
    // Lista estática de comercios, inicializada com alguns valores
    public static List<ComercioLocal> comercios = new ArrayList<>(Arrays.asList(
            new ComercioLocal("Padaria Central", "Padaria", "Rua A, nº 123"),
            new ComercioLocal("Farmácia Popular", "Farmácia", "Rua B, nº 456"),
            new ComercioLocal("Supermercado Bom Preço", "Supermercado", "Rua C, nº 789"),
            new ComercioLocal("Loja de Roupas Fashion", "Roupas", "Rua D, nº 101"),
            new ComercioLocal("Pet Shop Pet Love", "Pet Shop", "Rua E, nº 202")
    ));

    // Listar todos os comércios
    public List<ComercioLocal> listarComercios() {
        return comercios;
    }

    // Método para adicionar um comércio à lista
    public boolean adicionarComercio(ComercioLocal comercio) {
        // Verifica se os campos nome, tipo e endereco não são null ou vazios
        if (comercio == null || comercio.getNome() == null || comercio.getTipo() == null || comercio.getEndereco() == null
                || comercio.getNome().isEmpty() || comercio.getTipo().isEmpty() || comercio.getEndereco().isEmpty()) {
            return false; // Retorna false se algum campo for inválido
        }
        return comercios.add(comercio); // Retorna true se a adição for bem-sucedida
    }

    // Método para remover um comércio da lista baseado no nome
    public boolean removerComercio(String nome) {
        return comercios.removeIf(comercio -> comercio.getNome() != null && comercio.getNome().equalsIgnoreCase(nome)); // Garantir que o nome não seja null
    }
}
