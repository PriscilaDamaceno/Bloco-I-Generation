package exerc01;

public class animais {

	
	private int idade;
	private String nome;
	


	public animais(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void emitirSom() {
		System.out.println(nome + " Emitindo som...");
	}
public void correr() {
		
	}
	
	public void subirArvore() {
		
	
	
}}
