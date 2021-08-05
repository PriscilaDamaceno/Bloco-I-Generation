package vetoresematrizes;
import java.util.*;
///Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
///*que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
//*imprima a média aritmética dos lançamentos, contabilize e apresente também
//*quantas foram as ocorrências da maior pontuação.

public class ativ02 {

public static void main(String[]args) {


int[] lancamento = new int [10];
int  maior = 0;
double media = 0 , soma=0;

Random gerador = new Random();

for(int i = 0; i<=9; i++) {
lancamento[i] = gerador.nextInt(6)+1;
	System.out.println("Lançamento: " + lancamento[i]);

	soma = soma + lancamento[i];
media = soma/10;

if(lancamento[i]== 6) {
	maior++;
}




}
System.out.println("Média lançamentos: "+ media);
System.out.println("A maior pontuação caiu " + maior + " vezes") ;




}}	




	
	
	

