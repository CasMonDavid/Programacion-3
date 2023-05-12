package Clase08_05;

public class Main {

	public static void main(String[] args) {
		
		int [] arreglo = {0,1,2,3};
		int x = 5,y = 0;
		String email = "juanito@fakemail.com";
		//System.out.println("X: "+arreglo[5]);
		
		if(email.contains("fake")) {
			
			System.out.println("Hola 1");
			//throw new ArrayIndexOutOfBoundsException();
			throw new InputCharValidException();
			
		}else {
			
			System.out.println("Hola 2");
			System.out.println(arreglo[5]);
			
		}
		
		
		/*try {
			
			x = 7/2;
			
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("fuera del limite");
			System.out.println(e.getMessage());
			
		}catch (ArithmeticException e) {
			
			System.out.println("Error aritmetico");
			System.out.println(e.getMessage());
			
		}catch (Exception e) {
			System.out.println("error no identificado: "+e.getMessage());
		}finally {
			System.out.println("Hola soy un final");
		}*/
		
		/*try {
			
			
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}*/
		
	}

}
