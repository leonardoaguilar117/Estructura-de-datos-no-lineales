
public class PruebaDeTiempo {
	
	
	public void Insercion(int n){
		Lista L = new Lista();
		Pila P = new Pila();
		Cola C = new Cola();
		
		for(int i=0; i<n; i++) {
			L.insertar(i);
			P.push(i);
			C.encolar(i);
		}
	}
	
	public void Eliminar(int n){
		Lista L = new Lista();
		Pila P = new Pila();
		Cola C = new Cola();
		
		for(int i=0; i<n; i++) {
			L.eliminar(i);
			P.pop();
			C.desencolar();
		}
	}
	
	public void Busqueda(int n) {
		Lista L = new Lista();
		Pila P = new Pila();
		Cola C = new Cola();
		
		for(int i=0; i<n; i++) {
			L.buscar(i);
			P.buscar(i);
			C.buscarElemento(i);
		}
	}
	
	public void Acceso(int n){
		Lista L = new Lista();
		Pila P = new Pila();
		Cola C = new Cola();
		
		for(int i=0; i<n; i++) {
			L.acceder(i);
			P.acceder(i);
			C.acceder(i);
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		PruebaDeTiempo P1 = new PruebaDeTiempo();
		long inicio, Final, total;
		
		//Operaciones con 50 elementos
		inicio = System.nanoTime();
		P1.Insercion(50);
		Final = System.nanoTime();
		total = (Final - inicio);
		System.out.println("Insercion, tiempo: "+total+" nano segundos con 50 elementos");
	
		//Operaciones con 50 elementos
		inicio = System.nanoTime();
		P1.Acceso(50);
		Final = System.nanoTime();			
		total = (Final - inicio);
		System.out.println("Acceso, tiempo: "+total+" nano segundos con 50 elementos");
				
		//Operaciones con 50 elementos
		inicio = System.nanoTime();
		P1.Busqueda(50);;
		Final = System.nanoTime();			
		total = (Final - inicio);
		System.out.println("Busqueda, tiempo: "+total+" nano segundos con 50 elementos");
					
		//Operaciones con 50 elementos
		inicio = System.nanoTime();
		P1.Eliminar(50);;
		Final = System.nanoTime();			
		total = (Final - inicio);
		System.out.println("Eliminacion, tiempo: "+total+" nano segundos con 50 elementos");
		
		System.out.println(" ");
		
		//------------------------------------ 500 -------------------------------------

		//Operaciones con 500 elementos
		inicio = System.nanoTime();
		P1.Insercion(500);
		Final = System.nanoTime();
		total = (Final - inicio);
		System.out.println("Insercion, tiempo: "+total+" nano segundos con 500 elementos");
			
		//Operaciones con 500 elementos
		inicio = System.nanoTime();
		P1.Acceso(500);
		Final = System.nanoTime();			
		total = (Final - inicio);
		System.out.println("Acceso, tiempo: "+total+" nano segundos con 500 elementos");
						
		//Operaciones con 500 elementos
		inicio = System.nanoTime();
		P1.Busqueda(500);;
		Final = System.nanoTime();			
		total = (Final - inicio);
		System.out.println("Busqueda, tiempo: "+total+" nano segundos con 500 elementos");
							
		//Operaciones con 500 elementos
		inicio = System.nanoTime();
		P1.Eliminar(500);;
		Final = System.nanoTime();			
		total = (Final - inicio);
		System.out.println("Eliminacion, tiempo: "+total+" nano segundos con 500 elementos");
				
		System.out.println(" ");
		
	
		//------------------------------------ 5000 -------------------------------------
		//Operaciones con 5000 elementos
		inicio = System.nanoTime();
		P1.Insercion(5000);
		Final = System.nanoTime();
		total = (Final - inicio);
		System.out.println("Insercion, tiempo: "+total+" nano segundos con 5000 elementos");
					
		//Operaciones con 5000 elementos
		inicio = System.nanoTime();
		P1.Acceso(5000);
		Final = System.nanoTime();			
		total = (Final - inicio);
				System.out.println("Acceso, tiempo: "+total+" nano segundos con 5000 elementos");
								
		//Operaciones con 5000 elementos
		inicio = System.nanoTime();
		P1.Busqueda(5000);
		Final = System.nanoTime();			
		total = (Final - inicio);
		System.out.println("Busqueda, tiempo: "+total+" nano segundos con 5000 elementos");
									
		//Operaciones con 5000 elementos
		inicio = System.nanoTime();
		P1.Eliminar(5000);
		Final = System.nanoTime();			
		total = (Final - inicio);
		System.out.println("Eliminacion, tiempo: "+total+" nano segundos con 5000 elementos");
						
		System.out.println(" ");
		
		//------------------------------------ 50000 -------------------------------------
		//Operaciones con 50000 elementos
		inicio = System.nanoTime();
		P1.Insercion(50000);
		Final = System.nanoTime();
		total = (Final - inicio);
		System.out.println("Insercion, tiempo: "+total+" nano segundos con 50000 elementos");
							
		//Operaciones con 50000 elementos
		inicio = System.nanoTime();
		P1.Acceso(50000);
		Final = System.nanoTime();			
		total = (Final - inicio);
		System.out.println("Acceso, tiempo: "+total+" nano segundos con 50000 elementos");
										
		//Operaciones con 50000 elementos
		inicio = System.nanoTime();
		P1.Busqueda(50000);
		Final = System.nanoTime();			
		total = (Final - inicio);
		System.out.println("Busqueda, tiempo: "+total+" nano segundos con 50000 elementos");
											
		//Operaciones con 5000 elementos
		inicio = System.nanoTime();
		P1.Eliminar(50000);
		Final = System.nanoTime();			
		total = (Final - inicio);
		System.out.println("Eliminacion, tiempo: "+total+" nano segundos con 50000 elementos");
								
		System.out.println(" ");
	
	}
}
