package exercicio4;
import java.util.*;
public class Objfuncionario {



	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		funcionario func = new funcionario();
		
		func.nome = "Priscila";
		func.empresa = "Generation";
		func.setor = "Dev.Java";
        
		do {
			System.out.println("Digite o ID do funcion�rio: ");
			func.ID = leia.nextInt();
		}while(func.ID != 1234);
		
        System.out.println("Funcion�rio: " + func.nome);
		System.out.println("Empresa: " + func.empresa);

	
		System.out.println("Setor: " + func.setor);
	

			
leia.close();			
	}		
}			


