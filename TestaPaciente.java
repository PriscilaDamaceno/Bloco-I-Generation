package br.comgeneration.javacina;

import java.util.Scanner;

public class TestaPaciente  {
		
		 public static void main(String [] args) {
			 
			 //Cria��o de objeto
			 Scanner leia = new Scanner(System.in);
					 
			 
			 //Vari�veis
			 String nome;
			 int idade = 0;
			 String telefone;
			 String email;
			 int regiao = 0;
			 int comorbidade = 0;
			 int pc1 = 0; // pr� cadastro
			 int pc = 0; //pr� cadastro
			 int zonaNorte = 1;
			 int zonaLeste = 2;
			 int zonaSul = 3;
			 int zonaOeste = 4;
			 
			 
			 System.out.println("=======================================================================");
			 System.out.println("=                        BEM VINDO AO JAVACINA                        =");
			 System.out.println("=  Entre com seus dados e verifique a melhor localidade de vacina��o  =");
			 System.out.println("=======================================================================");
			 
			 //Entrada de dados
			 System.out.println("Digite seu nome, por favor: ");
			 nome = leia.next();
			
			 System.out.println("\nOl�, " + nome + "!!! ");
			 System.out.println("\nSeja bem vindo.");
			 System.out.println("\n=======================================================================");
			 
			 System.out.println("\nDigite sua idade, por favor: ");
			 idade = leia.nextInt();
			 
			 System.out.println("\n=======================================================================");
			 //valida��o de idade de 0 a 120 anos
			 while(idade < 0 || idade >= 120){
				 
				 System.out.println("Idade inv�lida, digite novamente:");
				 System.out.println("=======================================================================");
				 idade = leia.nextInt();
			 }
			 // valida��o para idades menores que 30
			 if (idade <30) {
			//	 System.out.println("=======================================================================");
				 System.out.println("\nVoc� faz parte de algum grupo especial ou com comorbidade?: (1- Sim | 2- N�o) ");
				 comorbidade = leia.nextInt();
				 leia.nextLine();
				 System.out.println("\n=======================================================================");
			// valida��o de comorbidade	 
			if (comorbidade == 1) {
				
					System.out.println("\nVoc� est� dentro do grupo de pessoas que podem tomar a vacina!!");
					System.out.println("Siga com o cadastro, por gentileza!\n");
				//	pc1 = leia.nextInt();
					cadastrarUsuario(leia);
				//	System.out.println("\n=======================================================================");
				}
			// valida��o de comorbidade 
			else if (comorbidade == 2){
				
					System.out.println("\nSeu grupo de idade n�o esta dispon�vel");
					System.out.println("Deixe seu n�mero de telefone com DDD e para ser noticado: ");
					telefone = leia.next();
					while(telefone.length() < 11 || telefone.length() > 11 ){
						 System.out.println("Telefone inv�lido, digite novamente:");
						 telefone = leia.next();
					 }
					
					System.out.println("Enviaremos a notifica��o!! Obrigado.");
					
				}
			}		 			
			 	// idade maior que 30 	 
			 else if (idade >=30) {
				// System.out.println("=======================================================================");
				 System.out.println("Voc� est� dentro do grupo de pessoas que podem tomar a vacina!!");
				 System.out.println("\nGostaria de fazer o pr�-cadastro? (N�o � obrigat�rio mas acelera o processo de vacina��o)");
				 System.out.println("\n1- Sim | 2- N�o");
				 pc = leia.nextInt();
				 //pr� cadastro
				 if (pc == 1) {
					 System.out.println("\n=======================================================================\n");
					 cadastrarUsuario(leia);
				 }//pr� castro
				 else if(pc == 2) {
					 System.out.println("\n=======================================================================");
					 System.out.println("Por favor, escolha uma regi�o.\n");
					 do {
						 System.out.println(" 1 - Zona Norte\n 2 - Zona Leste\n 3 - Zona Sul\n 4 - Zona Oeste\n");
						 System.out.println("Digite a regi�o: ");
						 regiao = leia.nextInt();
						 if(regiao < 1 || regiao > 4) {
							 System.out.println("\nRegi�o inv�lida\n Tente novamente!\n");
						 }
						 
						 //verifica regi�o 
					 }while(regiao < 1 || regiao > 4);
					 // regi�o 1
					 if(regiao == 1) {
						System.out.println("\n=======================================================================");
						System.out.println("\nUNIDADES DE SA�DE B�SICA DISPON�VEIS PARA A REGI�O NORTE");
					    System.out.println();
					    System.out.println("Op��o 1: UBS JARAGU� \n R. DOMINGUES VIDIGAL, 97 - VL CURU��");
					    System.out.println();
					    System.out.println("Op��o 2: AMB ESPEC TUCURUVI - ARMANDO DE AGUIAR PUPO \n AV. NOVA CANTAREIRA, 1467 - TUCURUVI");
					    System.out.println();
					    System.out.println("COMPARE�A NA UNIDADE DE SUA PREFER�NCIA!!! \n Leve documento com FOTO (RG/CNH) \n Compare�a de M�scara! ");
					    System.out.println();
					    System.out.println("\n=======================================================================");
					 }
					  // regi�o 2  
					 else if (regiao == 2) {
						System.out.println("\n=======================================================================");
					    System.out.println("\nUNIDADES DE SA�DE B�SICA DISPON�VEIS PARA A REGI�O LESTE");
					    System.out.println();
					    System.out.println("Op��o 1:  UBS ITAQUERA \n R. AM�RICO SALVADOR NOVELLI, 265 - ITAQUERA");
					    System.out.println();
					    System.out.println("Op��o 2: UBS JARDIM PENHA \n AV. S�O MIGUEL, 4331 - PONTE RASA");
					    System.out.println();
					    System.out.println("COMPARE�A NA UNIDADE DE SUA PREFER�NCIA!!! \n Leve documento com FOTO (RG/CNH) \n Compare�a de M�scara! ");
					    System.out.println();
					    System.out.println("\n=======================================================================");
					 }
					 // regi�o 3
					 else if(regiao == 3) {
						System.out.println("\n=======================================================================");
					    System.out.println("\nUNIDADES DE SA�DE B�SICA DISPON�VEIS PARA A REGI�O SUL");
					    System.out.println();
					    System.out.println("Op��o 1:  UBS PARAISOPOLIS III \n R. SILVEIRA SAMPAIO, 660 - JD MORUMBI");
					    System.out.println();
					    System.out.println("Op��o 2: UBS INDIAN�POLIS - SIGMUND FREUD \n AV. INDIAN�POLIS, 650 - MOEMA");
					    System.out.println();
					    System.out.println("COMPARE�A NA UNIDADE DE SUA PREFER�NCIA!!! \n Leve documento com FOTO (RG/CNH) \n Compare�a de M�scara! ");
					    System.out.println();
					    System.out.println("\n=======================================================================");
					 }
					   // regi�o 4 
					 else if(regiao == 4) {
						System.out.println("\n=======================================================================");
					    System.out.println("\nUNIDADES DE SA�DE B�SICA DISPON�VEIS PARA A REGI�O OESTE");
					    System.out.println();
					    System.out.println("Op��o 1: CS ESCOLA BARRA FUNDA - ALEXANDRE VRANJAC \n AV. DR ABRAAO RIBEIRO, 283 - BARRA FUNDA");
					    System.out.println();
					    System.out.println("Op��o 2: UBS ALTO DE PINHEIROS \n AV. QUEIROZ FILHO, 313 - ALTO DE PINHEIROS");
					    System.out.println();
					    System.out.println("COMPARE�A NA UNIDADE DE SUA PREFER�NCIA!!! \n Leve documento com FOTO (RG/CNH) \n Compare�a de M�scara!");
					    System.out.println();
					    System.out.println("\n=======================================================================");
					 }
				 }
			 }System.exit(0);

			 leia.close();
		 }
		 //metodo para cadastrar usuario
		public static void cadastrarUsuario(Scanner leia) {
			String telefone;
			String email;
			int regiao;
			
			System.out.println("Digite Telefone com DDD: ");
			 telefone = leia.next();
			 
			 while(telefone.length() < 11 || telefone.length() > 11 ){
				 System.out.println("Numero inv�lido, digite novamente:");
				 telefone = leia.next();
			 }
			 
			 System.out.println("Digite Email: ");
			 email = leia.next();
			 
			 System.out.println("\nCadastro feito com sucesso!!!");
			 System.out.println("=======================================================================");

			 do {
				 System.out.println("Por favor, escolha uma regi�o.\n");
				 System.out.println(" 1 - Zona Norte\n 2 - Zona Leste\n 3 - Zona Sul\n 4 - Zona Oeste\n");
				 System.out.println("Digite a regi�o: ");
				 regiao = leia.nextInt();
				 if(regiao < 1 || regiao > 4) {
					 System.out.println("\nRegi�o inv�lida\n Tente novamente!\n");
				 }
				 
			 }while(regiao < 1 || regiao > 4);
			 
			 if(regiao == 1) {
				System.out.println("\n=======================================================================");
				System.out.println("\nUNIDADES DE SA�DE B�SICA DISPON�VEIS PARA A REGI�O NORTE");
			    System.out.println();
			    System.out.println("Op��o 1: UBS JARAGU� \n R. DOMINGUES VIDIGAL, 97 - VL CURU��");
			    System.out.println();
			    System.out.println("Op��o 2: AMB ESPEC TUCURUVI - ARMANDO DE AGUIAR PUPO \n AV. NOVA CANTAREIRA, 1467 - TUCURUVI");
			    System.out.println();
			    System.out.println("COMPARE�A NA UNIDADE DE SUA PREFER�NCIA!!! \n Leve documento com FOTO (RG/CNH) \n Compare�a de M�scara! ");
			    System.out.println();
			    System.out.println("\n=======================================================================");
			    
			 }
			    
			 else if (regiao == 2) {
				System.out.println("\n=======================================================================");
			    System.out.println("UNIDADES DE SA�DE B�SICA DISPON�VEIS PARA A REGI�O LESTE");
			    System.out.println();
			    System.out.println("Op��o 1:  UBS ITAQUERA \n R. AM�RICO SALVADOR NOVELLI, 265 - ITAQUERA");
			    System.out.println();
			    System.out.println("Op��o 2: UBS JARDIM PENHA \n AV. S�O MIGUEL, 4331 - PONTE RASA");
			    System.out.println();
			    System.out.println("COMPARE�A NA UNIDADE DE SUA PREFER�NCIA!!! \n Leve documento com FOTO (RG/CNH) \n Compare�a de M�scara! ");
			    System.out.println();
			    System.out.println("\n=======================================================================");
			 }
			 
			 else if(regiao == 3) {
				System.out.println("\n=======================================================================");
			    System.out.println("UNIDADES DE SA�DE B�SICA DISPON�VEIS PARA A REGI�O SUL");
			    System.out.println();
			    System.out.println("Op��o 1:  UBS PARAISOPOLIS III \n R. SILVEIRA SAMPAIO, 660 - JD MORUMBI");
			    System.out.println();
			    System.out.println("Op��o 2: UBS INDIAN�POLIS - SIGMUND FREUD \n AV. INDIAN�POLIS, 650 - MOEMA");
			    System.out.println();
			    System.out.println("COMPARE�A NA UNIDADE DE SUA PREFER�NCIA!!! \n Leve documento com FOTO (RG/CNH) \n Compare�a de M�scara! ");
			    System.out.println();
			    System.out.println("\n=======================================================================");
			 }
			    
			 else if(regiao == 4) {
				System.out.println("\n=======================================================================");
			    System.out.println("UNIDADES DE SA�DE B�SICA DISPON�VEIS PARA A REGI�O OESTE");
			    System.out.println();
			    System.out.println("Op��o 1: CS ESCOLA BARRA FUNDA - ALEXANDRE VRANJAC \n AV. DR ABRAAO RIBEIRO, 283 - BARRA FUNDA");
			    System.out.println();
			    System.out.println("Op��o 2: UBS ALTO DE PINHEIROS \n AV. QUEIROZ FILHO, 313 - ALTO DE PINHEIROS");
			    System.out.println();
			    System.out.println("COMPARE�A NA UNIDADE DE SUA PREFER�NCIA!!! \n Leve documento com FOTO (RG/CNH) \n Compare�a de M�scara!");
			    System.out.println();
			    System.out.println("\n=======================================================================");
			 }
		}
		 
	}
	

	
