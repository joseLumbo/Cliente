package br.com.generation.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mcliente cliente = new Mcliente();
		Mcliente cliente1 = new Mcliente();
		
		
		cliente.nome = "Jose Lumbo";
		cliente.cidade = "Sao paulo";
		cliente.telefone = 234654876;
		cliente.cpf = 234567876;
		System.out.println("Nome do cliente: " + cliente.nome );
		System.out.println("Mora na cidade " + cliente.cidade);
		System.out.println("Cpf numero: " + cliente.cpf);
		System.out.println("Telefone: " + cliente.telefone);
		cliente.comprar();
		cliente.trocar();
		
		System.out.println();
		
		cliente1.nome = "Jose ";
		cliente1.cidade = "Luanda";
		cliente1.telefone = 987654321;
		cliente1.cpf = 435234432;
		System.out.println("Nome do cliente: " + cliente1.nome );
		System.out.println("Mora na cidade " + cliente1.cidade);
		System.out.println("Cpf numero: " + cliente1.cpf);
		System.out.println("Telefone: " + cliente1.telefone);
		cliente.comprar();
		cliente.trocar();
		
		
		
		
		
	}

}
