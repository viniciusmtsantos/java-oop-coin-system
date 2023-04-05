package empresa; // pacote empresa

public class Dolar extends Moeda{ // Classe filha de Moeda

	public Dolar(double valor) { // utilizando o super() para chamar o construtor da superclasse
		super(valor);
	}
	
	@Override
	double converter() { // aqui temos a utilização do metodo converter criado la na classe mãe Moeda
		double convertidoDolar = valor * 5.34; // dessa forma, tem-se que o valor convertido de Dolar de acordo com a cotação atual
		return convertidoDolar; // retornando então o valor convertido de dolar para reais
	}


	@Override
	public String toString() { // conversão do valor para string
		return "(DÓLAR) - " + valor;
	}
	
	
	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(valor);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
	}

	@Override
	public boolean equals(Object obj) { // utilizando o método equals() para comparações de equalidade
		if (this == obj)
			return true;
		if (obj == null)
		return false;
		if (getClass() != obj.getClass())
			return false;
		Dolar other = (Dolar) obj;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
		return false;
		return true;
	}
}