package interfaces;

import entidades.Medicamento;

import java.util.ArrayList;

public interface GerenciadorMedicamento {
    void adicionarMedicamento(Medicamento medicamento);
    void removerMedicamento(String nome);
    void alterarMedicamento(String nomeSubstituido, Medicamento substituto);
    ArrayList<Medicamento> listarMedicamentos();
}
