package br.comgeneration.javacina;

import java.util.Scanner;

public class TestaPaciente  {
		
		 public static void main(String [] args) {
			 
			 //Criação de objeto
			 Scanner leia = new Scanner(System.in);
					 
			 
			 //Variáveis
			 String nome;
			 int idade = 0;
			 String telefone;
			 String email;
			 int regiao = 0;
			 int comorbidade = 0;
			 int pc1 = 0; // pré cadastro
			 int pc = 0; //pré cadastro
			 int zonaNorte = 1;
			 int zonaLeste = 2;
			 int zonaSul = 3;
			 int zonaOeste = 4;
			 
			 
			 System.out.println("=======================================================================");
			 System.out.println("=                        BEM VINDO AO JAVACINA                        =");
			 System.out.println("=  Entre com seus dados e verifique a melhor localidade de vacinação  =");
			 System.out.println("=======================================================================");
			 
			 //Entrada de dados
			 System.out.println("Digite seu nome, por favor: ");
			 nome = leia.next();
			
			 System.out.println("\nOlá, " + nome + "!!! ");
			 System.out.println("\nSeja bem vindo.");
			 System.out.println("\n=======================================================================");
			 
			 System.out.println("\nDigite sua idade, por favor: ");
			 idade = leia.nextInt();
			 
			 System.out.println("\n=======================================================================");
			 //validação de idade de 0 a 120 anos
			 while(idade < 0 || idade >= 120){
				 
				 System.out.println("Idade inválida, digite novamente:");
				 System.out.println("=======================================================================");
				 idade = leia.nextInt();
			 }
			 // validação para idades menores que 30
			 if (idade <30) {
			//	 System.out.println("=======================================================================");
				 System.out.println("\nVocê faz parte de algum grupo especial ou com comorbidade?: (1- Sim | 2- Não) ");
				 comorbidade = leia.nextInt();
				 leia.nextLine();
				 System.out.println("\n=======================================================================");
			// validação de comorbidade	 
			if (comorbidade == 1) {
				
					System.out.println("\nVocê está dentro do grupo de pessoas que podem tomar a vacina!!");
					System.out.println("Siga com o cadastro, por gentileza!\n");
				//	pc1 = leia.nextInt();
					cadastrarUsuario(leia);
				//	System.out.println("\n=======================================================================");
				}
			// validação de comorbidade 
			else if (comorbidade == 2){
				
					System.out.println("\nSeu grupo de idade não esta disponível");
					System.out.println("Deixe seu número de telefone com DDD e para ser noticado: ");
					telefone = leia.next();
					while(telefone.length() < 11 || telefone.length() > 11 ){
						 System.out.println("Telefone inválido, digite novamente:");
						 telefone = leia.next();
					 }
					
					System.out.println("Enviaremos a notificação!! Obrigado.");
					
				}
			}		 			
			 	// idade maior que 30 	 
			 else if (idade >=30) {
				// System.out.println("=======================================================================");
				 System.out.println("Você está dentro do grupo de pessoas que podem tomar a vacina!!");
				 System.out.println("\nGostaria de fazer o pré-cadastro? (Não é obrigatório mas acelera o processo de vacinação)");
				 System.out.println("\n1- Sim | 2- Não");
				 pc = leia.nextInt();
				 //pré cadastro
				 if (pc == 1) {
					 System.out.println("\n=======================================================================\n");
					 cadastrarUsuario(leia);
				 }//pré castro
				 else if(pc == 2) {
					 System.out.println("\n=======================================================================");
					 System.out.println("Por favor, escolha uma região.\n");
					 do {
						 System.out.println(" 1 - Zona Norte\n 2 - Zona Leste\n 3 - Zona Sul\n 4 - Zona Oeste\n");
						 System.out.println("Digite a região: ");
						 regiao = leia.nextInt();
						 if(regiao < 1 || regiao > 4) {
							 System.out.println("\nRegião inválida\n Tente novamente!\n");
						 }
						 
						 //verifica região 
					 }while(regiao < 1 || regiao > 4);
					 // região 1
					 if(regiao == 1) {
						System.out.println("\n=======================================================================");
						System.out.println("\nUNIDADES DE SAÚDE BÁSICA DISPONÍVEIS PARA A REGIÃO NORTE");
					    System.out.println();
					    System.out.println("Opção 1: UBS JARAGUÁ \n R. DOMINGUES VIDIGAL, 97 - VL CURUÇÁ");
					    System.out.println();
					    System.out.println("Opção 2: AMB ESPEC TUCURUVI - ARMANDO DE AGUIAR PUPO \n AV. NOVA CANTAREIRA, 1467 - TUCURUVI");
					    System.out.println();
					    System.out.println("COMPAREÇA NA UNIDADE DE SUA PREFERÊNCIA!!! \n Leve documento com FOTO (RG/CNH) \n Compareça de Máscara! ");
					    System.out.println();
					    System.out.println("\n=======================================================================");
					 }
					  // região 2  
					 else if (regiao == 2) {
						System.out.println("\n=======================================================================");
					    System.out.println("\nUNIDADES DE SAÚDE BÁSICA DISPONÍVEIS PARA A REGIÃO LESTE");
					    System.out.println();
					    System.out.println("Opção 1:  UBS ITAQUERA \n R. AMÉRICO SALVADOR NOVELLI, 265 - ITAQUERA");
					    System.out.println();
					    System.out.println("Opção 2: UBS JARDIM PENHA \n AV. SÃO MIGUEL, 4331 - PONTE RASA");
					    System.out.println();
					    System.out.println("COMPAREÇA NA UNIDADE DE SUA PREFERÊNCIA!!! \n Leve documento com FOTO (RG/CNH) \n Compareça de Máscara! ");
					    System.out.println();
					    System.out.println("\n=======================================================================");
					 }
					 // região 3
					 else if(regiao == 3) {
						System.out.println("\n=======================================================================");
					    System.out.println("\nUNIDADES DE SAÚDE BÁSICA DISPONÍVEIS PARA A REGIÃO SUL");
					    System.out.println();
					    System.out.println("Opção 1:  UBS PARAISOPOLIS III \n R. SILVEIRA SAMPAIO, 660 - JD MORUMBI");
					    System.out.println();
					    System.out.println("Opção 2: UBS INDIANÓPOLIS - SIGMUND FREUD \n AV. INDIANÓPOLIS, 650 - MOEMA");
					    System.out.println();
					    System.out.println("COMPAREÇA NA UNIDADE DE SUA PREFERÊNCIA!!! \n Leve documento com FOTO (RG/CNH) \n Compareça de Máscara! ");
					    System.out.println();
					    System.out.println("\n=======================================================================");
					 }
					   // região 4 
					 else if(regiao == 4) {
						System.out.println("\n=======================================================================");
					    System.out.println("\nUNIDADES DE SAÚDE BÁSICA DISPONÍVEIS PARA A REGIÃO OESTE");
					    System.out.println();
					    System.out.println("Opção 1: CS ESCOLA BARRA FUNDA - ALEXANDRE VRANJAC \n AV. DR ABRAAO RIBEIRO, 283 - BARRA FUNDA");
					    System.out.println();
					    System.out.println("Opção 2: UBS ALTO DE PINHEIROS \n AV. QUEIROZ FILHO, 313 - ALTO DE PINHEIROS");
					    System.out.println();
					    System.out.println("COMPAREÇA NA UNIDADE DE SUA PREFERÊNCIA!!! \n Leve documento com FOTO (RG/CNH) \n Compareça de Máscara!");
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
				 System.out.println("Numero inválido, digite novamente:");
				 telefone = leia.next();
			 }
			 
			 System.out.println("Digite Email: ");
			 email = leia.next();
			 
			 System.out.println("\nCadastro feito com sucesso!!!");
			 System.out.println("=======================================================================");

			 do {
				 System.out.println("Por favor, escolha uma região.\n");
				 System.out.println(" 1 - Zona Norte\n 2 - Zona Leste\n 3 - Zona Sul\n 4 - Zona Oeste\n");
				 System.out.println("Digite a região: ");
				 regiao = leia.nextInt();
				 if(regiao < 1 || regiao > 4) {
					 System.out.println("\nRegião inválida\n Tente novamente!\n");
				 }
				 
			 }while(regiao < 1 || regiao > 4);
			 
			 if(regiao == 1) {
				System.out.println("\n=======================================================================");
				System.out.println("\nUNIDADES DE SAÚDE BÁSICA DISPONÍVEIS PARA A REGIÃO NORTE");
			    System.out.println();
			    System.out.println("Opção 1: UBS JARAGUÁ \n R. DOMINGUES VIDIGAL, 97 - VL CURUÇÁ");
			    System.out.println();
			    System.out.println("Opção 2: AMB ESPEC TUCURUVI - ARMANDO DE AGUIAR PUPO \n AV. NOVA CANTAREIRA, 1467 - TUCURUVI");
			    System.out.println();
			    System.out.println("COMPAREÇA NA UNIDADE DE SUA PREFERÊNCIA!!! \n Leve documento com FOTO (RG/CNH) \n Compareça de Máscara! ");
			    System.out.println();
			    System.out.println("\n=======================================================================");
			    
			 }
			    
			 else if (regiao == 2) {
				System.out.println("\n=======================================================================");
			    System.out.println("UNIDADES DE SAÚDE BÁSICA DISPONÍVEIS PARA A REGIÃO LESTE");
			    System.out.println();
			    System.out.println("Opção 1:  UBS ITAQUERA \n R. AMÉRICO SALVADOR NOVELLI, 265 - ITAQUERA");
			    System.out.println();
			    System.out.println("Opção 2: UBS JARDIM PENHA \n AV. SÃO MIGUEL, 4331 - PONTE RASA");
			    System.out.println();
			    System.out.println("COMPAREÇA NA UNIDADE DE SUA PREFERÊNCIA!!! \n Leve documento com FOTO (RG/CNH) \n Compareça de Máscara! ");
			    System.out.println();
			    System.out.println("\n=======================================================================");
			 }
			 
			 else if(regiao == 3) {
				System.out.println("\n=======================================================================");
			    System.out.println("UNIDADES DE SAÚDE BÁSICA DISPONÍVEIS PARA A REGIÃO SUL");
			    System.out.println();
			    System.out.println("Opção 1:  UBS PARAISOPOLIS III \n R. SILVEIRA SAMPAIO, 660 - JD MORUMBI");
			    System.out.println();
			    System.out.println("Opção 2: UBS INDIANÓPOLIS - SIGMUND FREUD \n AV. INDIANÓPOLIS, 650 - MOEMA");
			    System.out.println();
			    System.out.println("COMPAREÇA NA UNIDADE DE SUA PREFERÊNCIA!!! \n Leve documento com FOTO (RG/CNH) \n Compareça de Máscara! ");
			    System.out.println();
			    System.out.println("\n=======================================================================");
			 }
			    
			 else if(regiao == 4) {
				System.out.println("\n=======================================================================");
			    System.out.println("UNIDADES DE SAÚDE BÁSICA DISPONÍVEIS PARA A REGIÃO OESTE");
			    System.out.println();
			    System.out.println("Opção 1: CS ESCOLA BARRA FUNDA - ALEXANDRE VRANJAC \n AV. DR ABRAAO RIBEIRO, 283 - BARRA FUNDA");
			    System.out.println();
			    System.out.println("Opção 2: UBS ALTO DE PINHEIROS \n AV. QUEIROZ FILHO, 313 - ALTO DE PINHEIROS");
			    System.out.println();
			    System.out.println("COMPAREÇA NA UNIDADE DE SUA PREFERÊNCIA!!! \n Leve documento com FOTO (RG/CNH) \n Compareça de Máscara!");
			    System.out.println();
			    System.out.println("\n=======================================================================");
			 }
		}
		 
	}
	

	
