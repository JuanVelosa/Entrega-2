package exceptions;

public class NegativeWeightException extends Exception  {
	
	
	public NegativeWeightException(String name, double weight) {
		super("No se puede añadir un peso negativo"+ weight + "Para el ingrediente ");
	}
}

