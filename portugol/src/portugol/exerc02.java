package portugol;
import java.util.*;
public class exerc02 {

	
	public static void main(String[] args) {
		int ano,mes,dia,dia1;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite quantos dias você viveu: ");
		dia = entrada.nextInt();
		ano = dia/365;
		mes = dia%365/30;
		dia1=dia%365%30;

		System.out.println("Sua idade é "+ ano+" anos "+ mes+" meses e "+ dia1+" dias");
		entrada.close();

	}


	
	
}
