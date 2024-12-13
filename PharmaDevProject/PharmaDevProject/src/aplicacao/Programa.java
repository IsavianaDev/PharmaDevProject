
package aplicacao;

import entidades.Carrinho; /// IMPORTA A CLASSE CARRINHO
import entidades.Cliente;//IMPORTA A CLASSE CLIENTE
import entidades.Funcionario; // IMPORTA A CLASSE FUNCIONÁRIO
import entidades.Medicamento;// IMPORTA A CLASSE MEDICAMENTO
//NAO HÁ NECESSIDADE DE IMPORTAR PESSOA, POIS É UMA CLASSE ABSTRATA.
import java.util.Scanner;

public class Programa { // PROGRAMA PRINCIPAL

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Carrinho carrinho = new Carrinho();
		// AQUI TEMOS O MENU INTERAÇÃO COM O USUÁRIO, QUANDO SOLICITADO O NOME E O CPF..
		System.out.println("Olá, seja bem vindo à PharmaDev.");
		System.out.print("Informe seu nome: ");
		String nome = sc.nextLine();// NOME DO USUÁRIO
		System.out.print("Informe seu CPF: ");
		String cpf = sc.nextLine(); // CPF DO USUÁRIO
		System.out.println();

		Cliente cliente = new Cliente(nome, cpf);

		// AQUI INICIAMOS A INTERAÇÃO COM O FUNCIONÁRIO
		// DAMOS AO USUÁRIO A OPÇÃO DE INTERAGIR TAMBÉM COM OS DADOS DOS
		// FUNCIONÁRIOS, COMO CADASTRO E CONSULTA.
		System.out.println("Você deseja acessar informações de funcionários? (S/N): ");
		String respostaFuncionario = sc.nextLine();

		// SE O USUÁRIO DISSER "S", ELE PODE ADC OU CONSULTAR
		// FUNCIONÁRIOS. 
		if (respostaFuncionario.equalsIgnoreCase("S")) {
			// NÓS CRIAMOS ALGUNS FUNCIONÁRIOS SOMENTE PARA A SIMULAÇÃO.
			Funcionario funcionario1 = new Funcionario("Melby Law", "111.222.333-44", "F001", "Atendente");
			Funcionario funcionario2 = new Funcionario("Jacinto Leite", "555.666.777-88", "F002", "Farmacêutico");
			Funcionario funcionario3 = new Funcionario("Antônio Aires", "999.000.111-22", "F003", "Gerente");

			//ADICIONANDO ESSES FUNCIONARIOS A UMA LISTA.
			System.out.println("\nFuncionários cadastrados:");
			System.out.println(funcionario1);
			System.out.println(funcionario2);
			System.out.println(funcionario3);

			// MENU PARA INTERAGIR COM O SISTEMA DE FUNCIONÁRIOS
			while (true) {
				System.out.println("\nO que você deseja fazer com os funcionários?");
				System.out.println("1. Consultar funcionário por ID");
				System.out.println("2. Adicionar novo funcionário");
				System.out.println("3. Sair");
				System.out.print("Informe a opção desejada: ");
				int opcaoFuncionario = sc.nextInt();
				sc.nextLine();

				if (opcaoFuncionario == 1) {
					System.out.print("Informe o ID do funcionário: ");
					String idFuncionarioConsulta = sc.nextLine();
					// CONSULTANDO O FUNCIONÁRIO POR ID
					boolean encontrado = false;
					if (idFuncionarioConsulta.equals("F001")) {
						System.out.println(funcionario1);
						encontrado = true;
					} else if (idFuncionarioConsulta.equals("F002")) {
						System.out.println(funcionario2);
						encontrado = true;
					} else if (idFuncionarioConsulta.equals("F003")) {
						System.out.println(funcionario3);
						encontrado = true;
					}
					if (!encontrado) {
						System.out.println("Funcionário não encontrado com o ID fornecido.");
					}
				} else if (opcaoFuncionario == 2) {
					// PERMITINDO QUE O USUÁRIO ADC MAIS UM FUNCIONÁRIO. 
					System.out.print("Informe o nome do novo funcionário: ");
					String nomeFuncionario = sc.nextLine();
					System.out.print("Informe o CPF do novo funcionário: ");
					String cpfFuncionario = sc.nextLine();
					System.out.print("Informe o ID do novo funcionário: ");
					String idFuncionario = sc.nextLine();
					System.out.print("Informe o cargo do novo funcionário: ");
					String cargoFuncionario = sc.nextLine();

					Funcionario novoFuncionario = new Funcionario(nomeFuncionario, cpfFuncionario, idFuncionario,
							cargoFuncionario);
					System.out.println();
					System.out.println("Novo funcionário adicionado com sucesso: ");
					System.out.println(novoFuncionario);
				} else if (opcaoFuncionario == 3) {
					System.out.println("Saindo do sistema de funcionários.");
					break; // SAINDO DO LAÇO DE INTERAÇÃO COM O SISTEMA DE FUNCIONÁRIOS.
				} else {
					System.out.println("Opção inválida.");// PARA QUALQUER RESPOSTA DIFERENTE DA ESPERADA.
				}
			}
		} else {
			System.out.println("Você escolheu não acessar informações de funcionários.");
		}

		// A FUNÇÃO DO WHILE É CRIAR UM LAÇO, ONDE ENQUANTO FOR (VERDADEIRO),
		// O USUÁRIO PODERÁ TER ACESSO AO MENU INTERATIVO. É POSSÍVEL SUBSTITUIR PELO
		// DO-WHILE, PORÉM,
		// EU, PÉROLA, QUE FIQUEI RESPONSÁVEL PELO PROGRAMA PRINCIPAL, ESQUECI DA
		// EXISTÊNCIA DELE.
		// É POSSÍVEL FAZER USO DO FOR TAMBÉM, MAS NÃO É TÃO COMUM E EU TAMBÉM NÃO
		// ACERTEI FAZER, PORTANTO,
		// NÃO ME PERGUNTE COMO EU SUBSTITUIRIA, EU TENTEI E NÃO CONSEGUI.
		while (true) {
			System.out.println("Informações disponíveis:");
			System.out.println("1. Adicionar medicamento(s) no carrinho");
			System.out.println("2. Remover medicamento(s) do carrinho");
			System.out.println("3. Alterar medicamento(s) do carrinho");
			System.out.println("4. Listar medicamento(s) no carrinho");
			System.out.println("5. Sair");
			System.out.print("Informe a opção desejada: ");
			int opcao = sc.nextInt();
			sc.nextLine();
			System.out.println();
			// O MENU INTERATIVO ACIMA FORNECE AO USUÁRIO OPÇÕES PARA ADICIONAR, REMOVER,
			// ALTERAR E LISTAR OS MEDICAMENTOS QUE ESTÃO, ESTAVAM E/OU ESTARÃO NO CARRINHO.
			if (opcao == 1) {
				System.out.print("Você está em posse da receita? (S/N): ");
				String Receita = sc.nextLine();
				// A FUNÇÃO DO CÓDIGO É FORNECER UMA SIMULAÇÃO DE VENDA DE MEDICAMENTOS DE UMA
				// FARMÁCIA, LOGO
				// ALGUNS REMÉDIOS SÓ PODEM SER ADQUIRIDOS EM POSSE DA RECEITA.
				// UM ADENDO, É QUE NÃO EXISTE MEDICAÇÃO SEM TARJA. NEM TODOS SÃO TARJA
				// VERMELHA, ENTRETANTO,
				// SUA GRANDE MAIORIA É. PORTANTO, UTILIZANDO DO CONCEITO DE ABSTRAÇÃO, AS
				// ÚNICAS COISAS QUE ME
				// INTERESSAM DENTRO DO UNIVERSO DE POSSÍVEIS TARJAS, É A TARJA VERMELHA E
				// PRETA, PARA SIMULAÇÃO.
				if (Receita.equalsIgnoreCase("S")) { // AQUI INICIAMOS O BLOCO PARA A CONDIÇÃO DE HAVER RECEITA
					System.out.print("Qual a classificação do medicamento? (V - Tarja vermelha/P - Tarja preta): ");
					String classificacao = sc.nextLine();
					System.out.println();
					if (classificacao.equalsIgnoreCase("V") || classificacao.equalsIgnoreCase("P")) {
						System.out.print("Informe o nome do medicamento a ser adicionado: ");
						String nomeMedicamento = sc.nextLine();
						System.out.print("Informe o preço do medicamento a ser adicionado: ");
						double precoMedicamento = sc.nextDouble();
						sc.nextLine();
						// O SEGUNDO IF É REFERENTE À ESCOLHA DE V PARA VERMELHO E P PARA PRETO. EM
						// AMBOS OS CASOS O
						// MENU DE INTERAÇÃO É IGUAL, O QUE VAI DIFERENCIÁ-LO É UM DOS ELSES ABAIXO, QUE
						// LOGO SERÁ EXPLICADO.
						carrinho.adicionarMedicamento( // AQUI ADICIONA O MEDICAMENTO AO CARRINHO.
								new Medicamento(nomeMedicamento, precoMedicamento, classificacao));
						System.out.println("Produto adicionado com sucesso.");

						System.out.print("Deseja adicionar mais algum medicamento? (S/N): ");
						String adicionar = sc.nextLine();
						if (!adicionar.equalsIgnoreCase("S")) {
							System.out.println("\n" + carrinho);
						}
					} else {
						System.out.println("Classificação inválida.");// ESSE BLOCO É REFERENTE A QUALQUER OUTRA
						// RESPOSTA DIFERENTE DE V OU P.
					}
				} else { // ESSE ELSE É REFERENTE A AUSÊNCIA DE RECEITA NA
				}
			}
		}
	}
}
