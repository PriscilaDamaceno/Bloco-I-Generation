package portugol;
import java.util.*;
public class exerc05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double x1, y1, x2, y2, pX, pY, d;


		System.out.print("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.print("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		System.out.print("Digite o valor de x2: ");
		x2 = leia.nextDouble();
		System.out.print("Digite o valor de y2: ");
		y2 = leia.nextDouble();

		pX = Math.pow((x2 - x1), 2);
		pY = Math.pow((y2 - y1), 2);
		d = Math.sqrt(pX + pY);

		System.out.printf("Valor da distância: %.3f", d);

		leia.close();
	}
	
	
	
	
	
	
}
