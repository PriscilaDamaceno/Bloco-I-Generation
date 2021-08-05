package vetoresematrizes;
import java.util.*;
//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.


public class ativ1 {
public static void main(String[]args) {
Scanner ler =new Scanner(System.in);

double maior = 0;

double[] pontuacao = new double [5];
{

for(int i = 0; i< pontuacao.length; i++) {
	System.out.println("Digite o " + (i+1)+ "º valor: ");
	pontuacao[i] = new Scanner (System.in).nextFloat();
	
	if(pontuacao[i] > maior ) {
		maior = pontuacao[i];
	}
	}
System.out.println("O maior valor é: "+ maior);
System.out.println("");
}
	ler.close();

}
}






