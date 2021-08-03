package Exercicios0308;
import java.lang.*;
import java.util.*;



public class Exercicio04 {

	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		double numero;
		
		System.out.println("Digite um número: ");
		numero = ler.nextDouble();
		
		
		
	if (numero % 2 != 0) {
	System.out.println("O número " + numero + " é ímpar.\n");
	System.out.println(numero + "²: " + Math.pow(numero, 2));
	}
	else 
		System.out.println("O número " +numero+" é par.");
	System.out.println("A raíz quadrada de " +numero+" é: "+ Math.sqrt(numero));
}	

 

}



