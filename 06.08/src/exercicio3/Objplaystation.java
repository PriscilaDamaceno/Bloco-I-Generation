package exercicio3;

public class Objplaystation {

	public static void main(String[] args) {
		playstation ps = new playstation();
				

				ps.console = "Playstation 5";
				ps.dualshock = "Incluso";
				ps.leitordemidia = "Sim";
		        ps.memoria = "Capacidade: 16 GB de RAM GDDR6, 825 GB de memória SSD";
		        ps.resolucao = "HDMI 2.1, saída de vídeo 4K de 120 Hz";
				
		        System.out.println("Console: " + ps.console);
				System.out.println("Dualshock: " + ps.dualshock);

			
				System.out.println("Leitor de mídia: " + ps.leitordemidia);
				System.out.println("Memória: "+ ps.memoria);
				System.out.println("Resolução de imagem: "+ ps.resolucao);
	}


}
