package empresa; // pacote empresa

public class Euro extends Moeda{ // Classe filha de Moeda

	public Euro(double valor) { // utilizando o super() para chamar o construtor da superclasse
		super(valor);
	}
		
	@Override
	double converter() { // aqui temos a utilização do metodo converter criado la na classe mãe Moeda
		double convertidoEuro = valor * 5.32; // dessa forma, tem-se que o valor convertido de euro de acordo com a cotação atual
		return convertidoEuro; // retornando então o valor convertido de euro para reais
	}
	

	@Override
	public String toString() { // conversão do valor para string
		return "(EURO) - " + valor;
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
		Euro other = (Euro) obj;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
		return false;
		return true;
	}

}
