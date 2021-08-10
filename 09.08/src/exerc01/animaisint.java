package exerc01;

public interface animaisint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cavalo horse = new Cavalo();
		Cachorro dog = new Cachorro(null, 0);
		Preguiça sloth = new Preguiça();
		testeanimais ta = new testeanimais();

		horse.setNome("Shelby");
		horse.setIdade(8);

		dog.setNome("Luck");
		dog.setIdade(7);

		sloth.setNome("Slow");
		sloth.setIdade(17);

		System.out.println("Nome do Animal: " + horse.getNome());
		System.out.println("Idade: " + horse.getIdade());
		ta.emiteSom(new Cavalo());
		ta.movimento(new Cavalo());
		System.out.println();

		System.out.println("Nome do Animal: " + dog.getNome());
		System.out.println("Idade: " + dog.getIdade());
		ta.emiteSom(new Cachorro(null, 0));
		ta.movimento(new Cachorro(null, 0));
		System.out.println();

		System.out.println("Nome do Animal: " + sloth.getNome());
		System.out.println("Idade: " + sloth.getIdade());
		ta.emiteSom(new Preguiça());
		ta.movimento(new Preguiça());

	}



}
