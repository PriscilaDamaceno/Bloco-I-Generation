package Exercicios;
import java.util.*;
public class Exercicio02 {
//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. --FOR
	
	public static void main(String[]args) {
		
		try (Scanner ler = new Scanner (System.in)) {
			int par =0;
			int impar=0;
			int i, num;
			
				
			System.out.println("Digite 10 números: ");
for(i = 1; i<=10; i++) {
			num= ler.nextInt();
			if(num % 2 != 0) {
				impar++;
				
			}
			else {
				par++;
			}
}
			
				System.out.println("Você digitou "+par+" números pares e " +impar+ " números ímpares");
			
				ler.close();
		}
		
	
	}
	}

