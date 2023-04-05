package empresa; // pacote empresa

public class Real extends Moeda{ // Classe filha de Moeda

	public Real(double valor) { // utilizando o super() para chamar o construtor da superclasse
		super(valor);
	}
		
	@Override
	double converter() { // metodo converter retornando apenas o valor, pois neste caso, temos que o valor real é o proprio valor real
		return valor;
	}

	@Override
	public String toString() { // conversão do valor para string
		return "(REAL) - " + valor;
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
		Real other = (Real) obj;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
		return false;
		return true;
	}

}