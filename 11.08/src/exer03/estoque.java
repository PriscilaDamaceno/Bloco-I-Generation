package exer03;
import java.util.ArrayList;
public class estoque {

	public static void main(String[] args) {
	



			String estoque1 = "Brastemp";
			String estoque2 = "Continental";
			String estoque3 = "Electrolux";
			String estoque4 = "Consul";
			String estoque5 = "Atlas";

			ArrayList<String> estoque = new ArrayList<>();
			estoque.add(estoque1);
			estoque.add(estoque2);
			estoque.add(estoque3);
			estoque.add(estoque4);

			System.out.println(estoque);

			estoque.add(estoque5);
			System.out.println(estoque);

			estoque.remove(0);
			System.out.println(estoque);

			for(String i: estoque) {
				System.out.println("Marcas : " + i);
			
		}
}
}