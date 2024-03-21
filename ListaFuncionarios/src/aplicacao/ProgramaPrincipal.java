package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.Setor;

public class ProgramaPrincipal {
	
	static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {
		List<Setor> setores = new ArrayList<>();
		List<Funcionario> funcionarios = new ArrayList<>();
		
		ProgramaPrincipal.menu(setores, funcionarios);
	}
	
	private static void menu(List<Setor> setores, List<Funcionario> funcionarios) {
		
		ProgramaPrincipal.listagemMenu(setores, funcionarios);
		
		
	}

	private static void listagemMenu(List<Setor> setores, List<Funcionario> funcionarios) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Adicionar Setor;");
        System.out.println("2 - Adicionar Funcionario;");
        System.out.println("3 - Adicionar Dependentes;");
        System.out.println("4 - Ver Funcionarios;");
        System.out.println("5 - Ver Setor;");
        System.out.println("6 - Ver Dependentes.");
        
        System.out.print("Digite a opção escolhida: ");
        int opcao = scanner.nextInt();
        
        switch(opcao) {
            case 1:
                System.out.println("Opção escolhida: Adicionar Setor");
                ProgramaPrincipal.adicionaSetor(setores, funcionarios);;
                break;
            case 2:
                System.out.println("Opção escolhida: Adicionar Funcionario");
                ProgramaPrincipal.adcionaFuncionario(setores, funcionarios);
                break;
            case 3:
                System.out.println("Opção escolhida: Adicionar Dependentes");
                // Coloque aqui o código para adicionar um dependente
                break;
            case 4:
                System.out.println("Opção escolhida: Ver Funcionarios");
                // Coloque aqui o código para visualizar os funcionários
                break;
            case 5:
                System.out.println("Opção escolhida: Ver Setor");
                ProgramaPrincipal.verSetor(setores, funcionarios);
                break;
            case 6:
                System.out.println("Opção escolhida: Ver Dependentes");
                // Coloque aqui o código para visualizar os dependentes
                break;
            default:
                System.out.println("Opção inválida");
        }
        
        scanner.close();
		
	}
	
	private static void adcionaFuncionario(List<Setor> setores, List<Funcionario> funcionarios) {
		Funcionario funcionario = new Funcionario();
		System.out.println("Informe os dados do funcionario:");
		System.out.print("Nome: ");
		funcionario.setNome(ProgramaPrincipal.teclado.nextLine()); 
		System.out.print("CPF: ");
		funcionario.setCpf(ProgramaPrincipal.teclado.nextLine());
		System.out.println();
		System.out.print("Data de nascimento: ");
		funcionario.setDataNascimento(ProgramaPrincipal.teclado.nex);
	}

	private static void verSetor(List<Setor> setores, List<Funcionario> funcionarios) {
		setores.forEach(setor -> {
            System.out.println("Nome do Setor: " + setor.getNomeSetor());
            System.out.println("Código do Setor: " + setor.getCodigoSetor());
        });
		ProgramaPrincipal.menu(setores, funcionarios);		
	}

	private static void adicionaSetor(List<Setor> setores, List<Funcionario> funcionarios) {
		Setor setor = new Setor();
		
		System.out.println("Informe os dados do setor: ");
		System.out.println("Código do Setor: ");
		String codigoSetor = ProgramaPrincipal.teclado.nextLine();
		System.out.println("Nome do Setor: ");
		String nomeSetor = ProgramaPrincipal.teclado.nextLine();
		
		setor.setCodigoSetor(codigoSetor);
		setor.setNomeSetor(nomeSetor);
		
		setores.add(setor);
		ProgramaPrincipal.menu(setores, funcionarios);
		
		
		
	}
}
