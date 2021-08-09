package exerc01;

public class Cachorro extends animais {
	

		public Cachorro(String nome, int idade) {
			super(nome, idade);
		
		}
public void correr() {
			System.out.println("Correndo");

}
public void emitirSom()	{
	System.out.println("Latindo");
}
}