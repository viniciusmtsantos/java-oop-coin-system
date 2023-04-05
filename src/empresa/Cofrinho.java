package empresa; // pacote empresa

import java.util.ArrayList;

public class Cofrinho { // definição da classe publica Cofrinho para ser utilizada na Principal
	private double total;

	ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>(); // criação da array list para organização em array das moedas e dos seus respectivos valores
	
	public void adicionar(Moeda m) { // definição publica do metodo para adicionar um valor a determinada moeda de acordo com a opção do usuario que será validada na classe principal
		listaMoedas.add(m);
	}
	
	public void remover(Moeda m) {// definição publica do metodo para remover um valor a determinada moeda de acordo com a opção do usuario que será validada na classe principal
		listaMoedas.remove(m);
	}
	
	public void listagemMoedas() { // definição publica do metodo para listagem de moedas utilizando um loop for para poder apresentar na tela o tipo de moeda e os seus respectivos valores adicionados individualmente pelo usuario
		System.out.println("\n---Sua Lista---");
		for (Moeda m : listaMoedas) {
			System.out.println(m); // apresentaçao dos diferentes valores para cada tipo de moeda dentro do laço for
		}
	}
	

	public void totalConvertido() { // definição publca do metodo para a realizar a soma 
		System.out.println("\n---A Soma Convertida para Real---");
        for (Moeda m : listaMoedas) { // metodo loop for para poder somar em uma variavel total cada um dos diferentes valores convertidos para real obtidos em cada uma das classes filhas da Classe Moeda
			total += m.converter();
		}
        System.out.println("O total convertido para Real é: " + total); // apresentação do valor total convertido para o usuario após o encerramento do laço for
	}

}
