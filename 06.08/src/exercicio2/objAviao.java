package exercicio2;

public class objAviao {

	public static void main(String[] args) {
aviao av=new aviao();
		

		av.modelo = "Embraer E-Jets";
		av.paisdeOrigem = "Brasil";
		av.km = "890 km/h";
        av.passageiros = "66–124";
		
		System.out.println("Modelo: " + av.modelo);
		System.out.println("País de Origem: " + av.paisdeOrigem);

	
		System.out.println("KM: " + av.km);
		System.out.println("Passageiros: "+ av.passageiros);
	}



}
