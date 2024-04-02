package Exercicio;

public class Programa {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.setCodigo(001);
		produto1.setNome("Tenis Nike");
		produto1.setPreco(190.90);
		
		Produto produto2 = new Produto();
		produto2.setCodigo(002);
		produto2.setNome("Tenis Adidas");
		produto2.setPreco(180.90);
		
		Produto produto3 = new Produto();
		produto3.setCodigo(003);
		produto3.setNome("Tenis Rainha");
		produto3.setPreco(130.90);
		
		Item item1 = new Item(produto1, 2);
		Item item2 = new Item(produto3, 1);
		
		
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		
		carrinho.inserirItem(item1);
		carrinho.inserirItem(item2);
		
		carrinho.imprimeCompra();
	}

}
