package empresa; // pacote empresa
// Uma classe Abstrata, isto é, que não pode ser instanciada. Sendo uma classe mãe genérica para classes mais específicas
public abstract class Moeda {
    double valor; // toda moeda possui um valor

	public Moeda(double valor) { // indicando 
		this.valor = valor; // referenciando a um atributo externo do metodo
	}

	abstract double converter(); // metodo abstrato que força com que todas as filhas terão que implementar

	@Override	
	public int hashCode() { // um valor inteiro associado com todos os objetos em Java. Então, para obter esse hashcode precisamos utilizar o método hashCode(), esse método retornará um inteiro para o objeto passado.
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
		Moeda other = (Moeda) obj;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}

}
