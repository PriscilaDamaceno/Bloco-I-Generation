package vetoresematrizes;
import java.util.*;
//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
//atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.


public class ativ1 {
public static void main(String[]args) {
Scanner ler =new Scanner(System.in);

double maior = 0;

double[] pontuacao = new double [5];
{

for(int i = 0; i< pontuacao.length; i++) {
	System.out.println("Digite o " + (i+1)+ "� valor: ");
	pontuacao[i] = new Scanner (System.in).nextFloat();
	
	if(pontuacao[i] > maior ) {
		maior = pontuacao[i];
	}
	}
System.out.println("O maior valor �: "+ maior);
System.out.println("");
}
	ler.close();

}
}






