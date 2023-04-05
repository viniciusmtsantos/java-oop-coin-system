// Meu nome é Vinicius Santos e meu RU é 4063912
package empresa; // pacote empresa

import java.util.Scanner;

public class Principal { // Classe Principal publica que irá trabalhar com cada uma das classes criadas

	public static void main(String[] args) { 

		Scanner teclado = new Scanner(System.in); // para scan da digitação para o usuario
		int opcao;
	
		Cofrinho cofrinho = new Cofrinho(); // atribuindo a variavel cofrinho com tipo Cofrinho à Classe Cofrinho
		// Demonstração do MENU Principal para o Usuário poder escolher a opção desejada
		System.out.println("----MENU----");
		System.out.println("1-Adicionar");
		System.out.println("2-Remover");
		System.out.println("3-Listar");
		System.out.println("4-Calcular total convertido para Real");
		System.out.println("0-Encerrar");
		System.out.print("Selecione uma opção: ");
		opcao=teclado.nextInt(); // atribuindo a opção desejada de acordo com o numero digitado
		// criação das variaveis para poder atribuir o tipo de moeda a ser adicionado ou removida, assim como o valor da moeda que foi escolhida
		int tipoMoeda;
		double valor;
		Moeda comp; // variavel para computar do tipo Moeda

		while(opcao!=0) { // Abertura de loop enquanto a opção do usuario não for sair do programa
			
			switch(opcao) { // caso a opção desejada seja de 1 à 4, ele será levado ao caso escolhido, se não o programa retornará opção inválida de forma que ele escolha a opção do menu novamente
			
			case 1: // para o caso de Adicionar um valor
				tipoMoeda=0; // atribuindo o valor inicial para o tipo de Moeda
				while(tipoMoeda > 3 || tipoMoeda <= 0) { // abertura do loop para definição do tipo de moeda, caso inválido retornará
					System.out.println("\n---Moeda a ser Adicionada---"); // Menu para que o usuario reconheça as opções de adição
					System.out.println("1-Real");
					System.out.println("2-Dólar");
					System.out.println("3-Euro");
					System.out.print("Selecione a moeda: ");
					tipoMoeda = teclado.nextInt(); // atribuindo ao tipo de moeda que será direcionada nas condicionais a seguir
				}

				comp=null;

				if (tipoMoeda==1) { // para o tipo 1, será adicionado valor em Real
					System.out.print("Ok. Digite o valor em Reais: ");
					valor = teclado.nextDouble(); // atribuindo o valor digitado à variavel valor
					comp = new Real(valor); // computando o valor digitado para a classe Filha Real, onde será tratado
				}
				else if (tipoMoeda==2) { // para o tipo 1, será adicionado valor em Dolar
					System.out.print("Ok. Digite o valor em Dólar: ");
					valor = teclado.nextDouble(); // atribuindo o valor digitado à variavel valor
					comp = new Dolar(valor); // computando o valor digitado para a classe Filha Dolar, onde será tratado
				}
				else if (tipoMoeda==3) { // para o tipo 1, será adicionado valor em Euro
					System.out.print("Ok. Digite o valor em Euro: ");
					valor = teclado.nextDouble(); // atribuindo o valor digitado à variavel valor
					comp = new Euro(valor); // computando o valor digitado para a classe Filha Euro, onde será tratado
				}

				cofrinho.adicionar(comp); // Ao final do case, temos o método adicionar lá da classe Cofrinho que foi colocada na variavel cofrinho
				break; // saindo

			case 2: // para o caso de Remover um valor
				tipoMoeda=0;  // atribuindo o valor inicial para o tipo de Moeda
				while(tipoMoeda > 3 || tipoMoeda <= 0) { // abertura do loop para definição do tipo de moeda, caso inválido retornará
					System.out.println("\n---Moeda a ser Removida---"); // Menu para que o usuario reconheça as opções de remoção
					System.out.println("1-Real");
					System.out.println("2-Dólar");
					System.out.println("3-Euro");
					System.out.print("Selecione a moeda: ");
					tipoMoeda = teclado.nextInt();
				}
				
				comp=null;

				if (tipoMoeda==1) { 
					System.out.print("Ok. Digite o valor em Reais: ");
					valor = teclado.nextDouble();
					comp = new Real(valor);
				}
				else if (tipoMoeda==2) {
					System.out.print("Ok. Digite o valor em Dólar: ");
					valor = teclado.nextDouble();
					comp = new Dolar(valor);
				}
				else if (tipoMoeda==3) {
					System.out.print("Ok. Digite o valor em Euro: ");
					valor = teclado.nextDouble();
					comp = new Euro(valor);
				}

				cofrinho.remover(comp); // Ao final do case, temos o método remover lá da classe Cofrinho que foi colocada na variavel cofrinho
				break;

			case 3: // para o caso de Listar os valores de cada moeda

				cofrinho.listagemMoedas(); // Ao final do case, temos o método ListagemMoedas lá da classe Cofrinho que foi colocada na variavel cofrinho
				break;

			case 4: // para o caso de conversão total de todas as moedas para o real

				cofrinho.totalConvertido(); // Ao final do case, temos o método remover lá da classe totalConvertido que foi colocada na variavel cofrinho
				break;

			default: // caso padrão para determinação de opções invalidas que o usuario digitar
			
				System.out.println("Opção invalida!");				
			}
		// após os casos e as operações o usuario será retornado ao MENU Principal, onde terá a opção de escolher a opção que desejar novamente caso seja de seu interesse
			System.out.println("\n----MENU----");
			System.out.println("1-Adicionar");
			System.out.println("2-Remover");
			System.out.println("3-Listar");
			System.out.println("4-Calcular total convertido para Real");
			System.out.println("0-Encerrar");
			System.out.print("Selecione uma opção: ");
			opcao=teclado.nextInt();
		}
	// saindo do loop while para quando o usuario digitar a opção 0. Sendo assim o loop é encerrado e o programa se despede do usuário, indicando seu encerramento.
		System.out.println("-----"); // separação básica para mostragem da frase de encerramento.
		System.out.println("Programa Encerrado. Valeu!");
	}
}
