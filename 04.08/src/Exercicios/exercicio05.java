package Exercicios;
//Crie um programa que leia um n�mero do teclado at� que encontre um
//*n�mero igual a zero. No final, mostre a soma dos n�meros
//*digitados.(DO...WHILE)

import java.util.*;
public class exercicio05 {

	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		
		int num  , soma =0 ;
		
		
		do  {
		
		System.out.println("Digite n�meros: ");
		num = ler.nextInt();
		soma = soma+num;
		}
		while(num != 0);
		
		System.out.println("A soma de todos os n�meros �: "+soma);
		
		ler.close();
	}

}
