package restaurante;

import restaurante.Individuos.Cliente;
import restaurante.Individuos.Funcionario;
import restaurante.Restaurante.Mesa;
import restaurante.Restaurante.Pedido;
import restaurante.Restaurante.Produto;

public class Main {
	
	Cliente cliente1 = new Cliente();
	Cliente cliente2 = new Cliente();
	Funcionario funcionario1, funcionario2;
	Produto lasanha = new Produto();
	Produto pizza = new Produto();
	
	public void cadastrarProdutos() {
		lasanha.setNomeProduto("Lasanha");
		lasanha.setValorProduto((float) 30.00);
		pizza.setNomeProduto("Pizza");
		pizza.setValorProduto((float) 40.00);
	}
	
	public void cadastrarCliente() {
		cliente1.setNome("Fulano");
		cliente2.setNome("Ciclano");
	}
	
	public static void main(String args[]) {
		Main restaurante = new Main();
		restaurante.cadastrarProdutos();
		restaurante.cadastrarCliente();
		Pedido pedido = new Pedido();
		Pedido[] pedidos = {pedido};
		
		Produto[] produtos = {restaurante.lasanha, restaurante.pizza};
		pedido.setProduto(produtos);
		pedido.setNroPedido(1);
		
		Mesa mesa = new Mesa();
		mesa.setCliente(restaurante.cliente1);
		mesa.setPedido(pedidos);
		mesa.setNroMesa(10);
		
		System.out.println("A mesa "+mesa.getNroMesa()+" está reservada para "+mesa.getCliente().getNome());
		System.out.println("Foram feitos os seguintes pedidos: ");
		for (Pedido p: mesa.getPedido()) {
			System.out.println("Pedido: "+p.getNroPedido());
			System.out.println("Produtos do pedido:");
			for (Produto pro: p.getProduto()) {
				System.out.print(pro.getNomeProduto() + " | " );
			}
		}
		
		
	}

}
