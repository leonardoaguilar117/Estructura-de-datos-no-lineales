public class sintaxis {
	
	public void datos() {
		int numero = 10;
		double pi = 3.1415926535;
		char letra = 'a';	
		System.out.print("Entero: " + numero +" Doble: "+ pi + "Char: "+ letra);
	}
	
	public void operadores(){
		
		// Operaciones aritmeticas
		int suma = 10 + 5;
		int resta = 10 - 5;
		int multiplicacion = 10 * 5;
		int division = 10 / 5;
		
		// Operaciones lógicas
		boolean verdad = true;
		boolean falsedad = false;
		boolean resultado = verdad && falsedad;
		
		// Operaciones relacionales
		int a = 10, b = 5;
		boolean mayor = a > b;
		boolean menor = a < b;
		boolean igual = a == b;
		
		System.out.println("Tenemos dos numeros: "+10 +"y"+5);
		System.out.println(" Suma es: "+suma+ " Resta es: "+resta+" Multiplicacion: "+multiplicacion+" Division"+
		division+"  ");
		
		System.out.println("Resultado de comparar verdadero y falso: "+resultado);
		
		
		System.out.println("Si comparamos 10 contra 5 con diferentes operadores, obtendremos: ");
		System.out.println("");
	}
	
	
	
	
	public static void main(String[] args) {
		
	}

}
