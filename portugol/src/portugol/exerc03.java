package portugol;
import java.util.*;
public class exerc03 {

	public static void main(String[] args){
		int tempoSegundos, horas,minutos, segundos;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o total de segundos do evento: ");
		tempoSegundos = entrada.nextInt();
		horas = tempoSegundos/(60*60);
		minutos = tempoSegundos%(60*60)/60;
		segundos = tempoSegundos%(60*60)%60;

		System.out.println("O tempo do evento é "+ horas+":"+ minutos+":"+ segundos);
		entrada.close();

	}


	
	
	
	
}
