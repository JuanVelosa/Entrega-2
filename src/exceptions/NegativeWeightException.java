package exceptions;

public class NegativeWeightException extends Exception  {
	
	
	public NegativeWeightException(String name, double weight) {
		super("No se puede a�adir un peso negativo"+ weight + "Para el ingrediente ");
	}
}

