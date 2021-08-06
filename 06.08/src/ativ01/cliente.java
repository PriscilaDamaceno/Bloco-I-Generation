
package ativ01;

public class cliente {



	public String nome;
	public String sexo;
	public String idade;
	public float pagar;

	void pagar(int cartao) {
		pagar -= cartao;
	}

	void parcelas(int parcelar) {
		pagar += parcelar;
}
	}