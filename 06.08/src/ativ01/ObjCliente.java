package ativ01;

public class ObjCliente {

	public static void main(String[] args) {

		cliente c1 = new cliente();

		c1.nome = "Maria";
		c1.sexo = "Feminino";
		c1.idade = "28";
c1.pagar = 100;
		
		System.out.println("Nome: " + c1.nome);
		System.out.println("Sexo: " + c1.sexo);

	
		System.out.println("Idade: " + c1.idade);
		System.out.println("Pagamento: "+ c1.pagar +" a vista");
	}
}