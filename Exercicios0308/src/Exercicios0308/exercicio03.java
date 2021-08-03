package Exercicios0308;
import java.util.Scanner;
public class exercicio03 {

	
	public static void main(String[]args) {
		
		Scanner ler = new Scanner (System.in);
		
	 int idade;

	 
	 
	 System.out.println("Digite sua idade: ");
	 idade = ler.nextInt();
	 
	 ler.nextLine();
	 
	 if(idade >=10 && idade <=14)
	 {
		 System.out.println("A categoria é INFANTIL");
		 
	 }
	 else if (idade>=15 && idade<=17) {
		 System.out.println("A categoria é JUVENIL");
		 
	 }
	 else if (idade>=18 && idade<=25 ) {
		 System.out.println("A categoria é ADULTO");
	 
	 
	 }
	 else System.out.println("Idade Inválida"); 
ler.close();
	}





}
