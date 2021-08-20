package portugol;
import java.util.*;
public class exerc07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);


		double custoConsumidor, custoFabrica, custoDistribuidor, impostos;


		System.out.println("Digite o custo de fábrica do carro: ");
		custoFabrica = entrada.nextDouble();


		custoDistribuidor = custoFabrica * 0.28;
		impostos = custoFabrica * 0.45;
		custoConsumidor = custoFabrica + custoDistribuidor + impostos; 


		System.out.println("Custo de fábrica: " + custoFabrica + " reais");
		System.out.println("Porcentagem do distribuidor: " + custoDistribuidor + " reais");
		System.out.println("Impostos: " + impostos + " reais");
		System.out.println("Custo ao consumidor: " + custoConsumidor + " reais");

		entrada.close();
	}	
	
	
	
	
	
	
	
}
