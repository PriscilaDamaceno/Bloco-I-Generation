package exercicio3;

public class Objplaystation {

	public static void main(String[] args) {
		playstation ps = new playstation();
				

				ps.console = "Playstation 5";
				ps.dualshock = "Incluso";
				ps.leitordemidia = "Sim";
		        ps.memoria = "Capacidade: 16 GB de RAM GDDR6, 825 GB de mem�ria SSD";
		        ps.resolucao = "HDMI 2.1, sa�da de v�deo 4K de 120 Hz";
				
		        System.out.println("Console: " + ps.console);
				System.out.println("Dualshock: " + ps.dualshock);

			
				System.out.println("Leitor de m�dia: " + ps.leitordemidia);
				System.out.println("Mem�ria: "+ ps.memoria);
				System.out.println("Resolu��o de imagem: "+ ps.resolucao);
	}


}
