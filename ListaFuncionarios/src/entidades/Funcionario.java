package entidades;

import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa{

	private List<Dependente> dependentes;
	private Setor setor;
	private Date dataAdmissao;
	private String matricula;
	
	public List<Dependente> getDependentes() {
		return dependentes;
	}
	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}
	public Setor getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return "Funcionario [dependentes=" + dependentes + ", setor=" + setor + ", dataAdmissao=" + dataAdmissao
				+ ", matricula=" + matricula + ", getNome()=" + getNome() + ", getDataNascimento()="
				+ getDataNascimento() + ", getCpf()=" + getCpf() + "]";
	}
	
	
	
	
}
