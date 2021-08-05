package vetoresematrizes;
import java.util.*;
///Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
//em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
//diagonal, ou seja, diagonal principal.
public class ativ04 {
public static void main(String[]args) {
	
	Scanner entrada=new Scanner(System.in);
	int[][] M1=new int[3][3];
	
	int diagonal=0, soma=0, c,l;
	
	System.out.println("Digite os valores da matriz: ");
	for(l=0;l<M1.length;l++){
		for(c=0; c<M1[l].length; c++) {
			M1[l][c]=entrada.nextInt();
		soma+=M1[l][c];
		
		if(l==c) { diagonal+=M1[l][c];
		}
		}
	}

System.out.println("A soma total dos elementos foi de: "+soma);
System.out.println("A soma diagonal dos elementos foi de: "+ diagonal);


}
	















	
	
	






}
