package Exercicios;
//Crie um programa que leia um número do teclado até que encontre um
//*número igual a zero. No final, mostre a soma dos números
//*digitados.(DO...WHILE)

import java.util.*;
public class exercicio05 {

	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		
		int num  , soma =0 ;
		
		
		do  {
		
		System.out.println("Digite números: ");
		num = ler.nextInt();
		soma = soma+num;
		}
		while(num != 0);
		
		System.out.println("A soma de todos os números é: "+soma);
		
		ler.close();
	}

}
