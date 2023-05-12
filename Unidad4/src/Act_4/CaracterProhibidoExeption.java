package Act_4;

public class CaracterProhibidoExeption extends RuntimeException {

	public CaracterProhibidoExeption() {
		super("Se detectaron caracteres no permitidos");
	}
	
	public CaracterProhibidoExeption(String cadena) {
		super("Se detectaron caracteres no permitidos en "+cadena);
	}
	
}