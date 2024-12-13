package entidades;

public class Funcionario extends Pessoa {
    private String idFuncionario;
    private String cargo;

    // Construtor.
    public Funcionario(String nome, String cpf, String idFuncionario, String cargo) {
        super(nome, cpf);
        this.idFuncionario = idFuncionario;
        this.cargo = cargo;
    }

    // Getters e Setters.
    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
//Método sobrescrito para retornar valores formatados do funcionário.
    @Override
    public String toString() {
        return "Funcionario:" +
                "Nome: " + getNome() +
                ", CPF: " + getCpf() +
                ", ID: " + idFuncionario +
                ", Cargo: " + cargo;
    }
}