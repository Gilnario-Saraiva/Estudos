
public class App {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.setNome("Gilnario");
		Conta corrente = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		corrente.depositar(100);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		corrente.transferir(50, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
