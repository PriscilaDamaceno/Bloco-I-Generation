package Exercicios;
///Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99.
////

import java.util.*;
public class exercicio03 {

	
public static void main(String[]args) {
		
	int idade=0, maior=0 , menor=0;
	Scanner ler = new Scanner (System.in);

	 
		
System.out.println("Informe sua idade: ");

while(idade!=-99) {
	idade = ler.nextInt();

	
	if (idade>0 && idade<21) menor++;


if (idade<50) maior ++;

}

System.out.println("\nO total de pessoas com mais de 50 anos é: " + maior);
System.out.println("O total de pessoas com menos de 21 anos é:" + menor);
	ler.close();
}
}



		

	
	

