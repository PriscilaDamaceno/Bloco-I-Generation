package portugol;
import java.util.*;
public class exerc04 {
	
	
	public static void main(String[] args) {
		
		
		double p1, p2, p3, n1, n2, n3, media;
		Scanner entrada = new Scanner(System.in);

	    p1 = 2.0;
	    p2 = 3.0;
	    p3 = 5.0;

	    System.out.println("Qual sua nota 1? ");
	    n1 = entrada.nextDouble();

	    System.out.println("Qual sua nota 2? ");
	    n2 = entrada.nextDouble();

	    System.out.println("Qual sua nota 3? ");
	    n3 = entrada.nextDouble();

	    media = (((p1*n1)+(p2*n2)+(p3*n3))/(p1+p2+p3));
	    System.out.println("Sua média ponderada é: "+media);
	    entrada.close();

	}

	
	
	
	
}
