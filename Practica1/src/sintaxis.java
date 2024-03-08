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
		System.out.println(a+" mayor que "+b+mayor);
		System.out.println(a+" menor que "+b+menor);
		System.out.println(a+" igual que "+b+igual);
			
		}
	
	public void sentenciasControl(int numero, char letra){
		
		// Sentencia if
		if (numero > 10) {
			System.out.println("El número es mayor que 10");
		} else {
			System.out.println("El número es menor o igual que 10");
		}
		
		// Sentencia switch
		switch (letra) {
			case 'a':
				System.out.println("La letra es 'a'");
			break;
			case 'b':
				System.out.println("La letra es 'b'");
				break;
			default:
				System.out.println("La letra no es 'a' ni 'b'");
		}
		
		// Bucle for
		for (int i = 0; i < 10; i++) {
			System.out.println("Posiciones"+i);
		}
		
		// Bucle while
		int i = 0;
		while (i < 10) {
			System.out.println("Posiciones"+i);
			i++;
		}
		
		// Bucle do-while
		i = 0;
		do {
			System.out.println("Posiciones"+i);
			i++;
		} while (i < 10);
			
	}
	
	public void arreglos(){
		// Arreglo unidimensional
		int[] numeros = new int[10];
		// Arreglo bidimensional
		int[][] matriz = new int[3][3];
		
		for(int i= 0; i<10; i++){
			System.out.print(numeros[i]);
		}
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(matriz[i][j]);
			}
		}
	}
	
	public static void main(String[] args) {
		
	}

}
