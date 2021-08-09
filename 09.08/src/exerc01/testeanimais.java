package exerc01;

public class testeanimais  extends animais {
	public testeanimais(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		
	}
		public void emitirSom(animais animal) {
			animal.emitirSom();
		}
		public void correr(animais animal) {
			animal.correr();
		}
		public void subir(animais animal) {
			animal.subirArvore();
		}
	
}