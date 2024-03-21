package entidades;

public class Setor {

	private String nomeSetor;
	private String codigoSetor;
	
	public String getNomeSetor() {
		return nomeSetor;
	}
	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}
	public String getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(String codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	@Override
	public String toString() {
		return "Setor [nomeSetor=" + nomeSetor + ", codigoSetor=" + codigoSetor + "]";
	}
	
	
}
