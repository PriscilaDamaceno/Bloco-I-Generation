package Exercicios;
import java.util.*;
public class Exercicio02 {
//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. --FOR
	
	public static void main(String[]args) {
		
		try (Scanner ler = new Scanner (System.in)) {
			int par =0;
			int impar=0;
			int i, num;
			
				
			System.out.println("Digite 10 n�meros: ");
for(i = 1; i<=10; i++) {
			num= ler.nextInt();
			if(num % 2 != 0) {
				impar++;
				
			}
			else {
				par++;
			}
}
			
				System.out.println("Voc� digitou "+par+" n�meros pares e " +impar+ " n�meros �mpares");
			
				ler.close();
		}
		
	
	}
	}

