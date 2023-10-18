package IPhone;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

	@Override
	public void exibirPagina() {
		System.out.println("Página exibida");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualiza página");
		
	}

	@Override
	public void ligar() {
		System.out.println("Fazendo ligação");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando Música");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Música");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Música");
		
	}
}

