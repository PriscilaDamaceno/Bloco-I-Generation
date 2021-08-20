package portugol;
import java.util.*;
public class exerc06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);


		double a, b, c, d, e, f, x, y;


		System.out.println("Digite o valor do coeficiente A: ");
		a = entrada.nextDouble();
		System.out.println("Digite o valor do coeficiente B: ");
		b = entrada.nextDouble();
		System.out.println("Digite o valor do coeficiente C: ");
		c = entrada.nextDouble();
		System.out.println("Digite o valor do coeficiente D: ");
		d = entrada.nextDouble();
		System.out.println("Digite o valor do coeficiente E: ");
		e = entrada.nextDouble();
		System.out.println("Digite o valor do coeficiente F: ");
		f = entrada.nextDouble();


		x = (((c * e) - (b * f)) / ((a * e) - (b * d)));
		y = (((a * f) - (c * d)) / ((a * e) - (b * d)));


		System.out.println("O valor de x: " + x);
		System.out.println("O valor de y: " + y);

		entrada.close();

	}
	
	
	
}
