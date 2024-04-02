package Exercicio;

import java.util.ArrayList;

public class CarrinhoDeCompra {

	private ArrayList<Item> compras;
	
	public CarrinhoDeCompra() {
		this.compras = new ArrayList<>();
	}
	
	public void inserirItem(Item item) {
		this.compras.add(item);
	}
	
	public void removerItem(Item item) {
		this.compras.remove(item);
	}
	
	public void imprimeCompra() {
		float valorTotal = 0;
		for (Item item : compras) {
			System.out.println("Produto: " + item.getProduto().getNome() + " -- " + item.getProduto().getCodigo());
			System.out.println("--");
			System.out.println("Valor: " + item.getProduto().getPreco());
			System.out.println("--");
			System.out.println("Quantidade: " + item.getQuantidade());
			System.out.println("--");
			System.out.println("Valor Parcial: " + item.getProduto().getPreco() * item.getQuantidade());
			
			valorTotal += item.getProduto().getPreco() * item.getQuantidade();
		}
		System.out.println("****************************");
		System.out.println("Valor Total: " + valorTotal);
	}
	
}
