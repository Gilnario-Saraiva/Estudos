package entidades;

public class Dependente extends Pessoa {
	
	private Funcionario funcionario;

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Dependente [Funcionario Matricula=" + funcionario.getMatricula() + ", Nome dependente=" + getNome() + ", Data Nascimento()="
				+ getDataNascimento() + ", Cpf=" + getCpf() +  "]";
	}
	
	
}
