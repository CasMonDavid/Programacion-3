package Clase08_05;

public class InputCharValidException extends RuntimeException {

	public InputCharValidException() {
		super("Tiene elementos invalidos");
	}
	
	public InputCharValidException(String cadena) {
		super("La cadena "+cadena+" contiene elementos invalidos");
	}

}
