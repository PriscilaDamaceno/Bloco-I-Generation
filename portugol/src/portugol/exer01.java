package portugol;
import java.util.*;
public class exer01 {





		public static void main(String[] args) {
			int idade,mes,dia;
			Scanner entrada = new Scanner(System.in);

			int diasVida;
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();

			System.out.println("Digite quantos meses: ");
			mes = entrada.nextInt();

			System.out.println("Digite os dias: ");
			dia = entrada.nextInt();

			diasVida=((idade*365)+(mes*30)+dia);

			System.out.println("Você tem "+diasVida+" dias vividos");
			entrada.close();

}
}