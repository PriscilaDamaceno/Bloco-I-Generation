package Exercicios0308;

import java.util.*;

public class Exercicio01 {

	public static void main(String[]args) {
	
	Scanner entrada = new Scanner (System.in);
	
	double numero1, numero2, numero3, maior = 0;
	
	
	
	System.out.println("Digite um número: ");
	numero1 = entrada.nextInt();
numero2 = entrada.nextInt();
numero3 = entrada.nextInt();

if(numero1 > numero2 && numero1 > numero3) {
	maior = numero1;
}
else if (numero2 > numero3 && numero2 > numero1) {
	maior = numero2;
}
else {
	maior = numero3;
	
}
	System.out.println("Maior número é:" +maior);
entrada.close();
	}
}

