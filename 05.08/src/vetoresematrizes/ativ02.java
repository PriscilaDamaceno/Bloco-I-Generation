package vetoresematrizes;
import java.util.*;
///Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
///*que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
//*imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
//*quantas foram as ocorr�ncias da maior pontua��o.

public class ativ02 {

public static void main(String[]args) {


int[] lancamento = new int [10];
int  maior = 0;
double media = 0 , soma=0;

Random gerador = new Random();

for(int i = 0; i<=9; i++) {
lancamento[i] = gerador.nextInt(6)+1;
	System.out.println("Lan�amento: " + lancamento[i]);

	soma = soma + lancamento[i];
media = soma/10;

if(lancamento[i]== 6) {
	maior++;
}




}
System.out.println("M�dia lan�amentos: "+ media);
System.out.println("A maior pontua��o caiu " + maior + " vezes") ;




}}	




	
	
	

