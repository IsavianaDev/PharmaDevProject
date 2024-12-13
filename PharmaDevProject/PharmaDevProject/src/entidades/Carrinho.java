package entidades;

import interfaces.GerenciadorMedicamento;

import java.util.ArrayList;

public class Carrinho implements GerenciadorMedicamento {
	private ArrayList<Medicamento> medicamentos;

	public Carrinho() {
		medicamentos = new ArrayList<>();
	}

	@Override
	public void adicionarMedicamento(Medicamento medicamento) {
		medicamentos.add(medicamento);
	}

	@Override
	public void removerMedicamento(String nome) {
		Medicamento encontrado = null;
		for (Medicamento medicamento : medicamentos) {
			if (medicamento.getNome().equalsIgnoreCase(nome)) {
				encontrado = medicamento;
				break;
			}
		}
		if (encontrado != null) {
			medicamentos.remove(encontrado);
			System.out.println("Medicamento removido com sucesso.");
		} else {
			System.out.println("Medicamento não encontrado.");
		}
	}

	@Override
	public void alterarMedicamento(String nomeSubstituido, Medicamento substituto) {
		for (int i = 0; i < medicamentos.size(); i++) {
			if (medicamentos.get(i).getNome().equalsIgnoreCase(nomeSubstituido)) {
				medicamentos.set(i, substituto);
				System.out.println("Medicamento substituído com sucesso.");
				return;
			}
		}
		System.out.println("Medicamento a ser substituído não encontrado.");
	}

	@Override
	public ArrayList<Medicamento> listarMedicamentos() {
		return medicamentos;
	}

	@Override
	public String toString() {
		String resultado = "";
		double total = 0.0;

		for (Medicamento medicamento : medicamentos) {
			resultado += "Nome: " + medicamento.getNome() + "; Preço: R$" + medicamento.getPreco() + "\n";
			total += medicamento.getPreco();
		}

		resultado += "Total: R$" + total;
		return resultado;
	}
}