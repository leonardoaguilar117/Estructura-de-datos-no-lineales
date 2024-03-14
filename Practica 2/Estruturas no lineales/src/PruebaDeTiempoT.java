
public class PruebaDeTiempoT<T> {
	
	private T crearElemento(int valor) {
	    return (T) (Integer.valueOf(valor)); 
	}
	
	public void Insercion(int n) {
	    ListaT<T> L = new ListaT<>();
	    PilaT<T> P = new PilaT<>();
	    ColaT<T> C = new ColaT<>();
	    
	    for (int i = 0; i < n; i++) {
	    	T elemento = crearElemento(i);
	        L.insertar(elemento); // Aquí deberías proporcionar el valor de tipo T que deseas insertar
	        P.push(elemento); // Aquí también
	        C.encolar(elemento); // Igualmente aquí
	    }
	}

	public void Eliminar(int n) {
	    ListaT<T> L = new ListaT<>();
	    PilaT<T> P = new PilaT<>();
	    ColaT<T> C = new ColaT<>();
	    
	    for (int i = 0; i < n; i++) {
	        L.eliminar(i); // Aquí deberías proporcionar el valor de tipo T que deseas eliminar
	        P.pop();
	        C.desencolar();
	    }
	}

	public void Busqueda(int n) {
	    ListaT<T> L = new ListaT<>();
	    PilaT<T> P = new PilaT<>();
	    ColaT<T> C = new ColaT<>();
	    
	    for (int i = 0; i < n; i++) {
	    	
	    	T elemento = crearElemento(i);
	        L.buscar(elemento); // Aquí deberías proporcionar el valor de tipo T que deseas buscar
	        P.buscar(elemento); // Aquí también
	        C.buscarElemento(elemento); // Igualmente aquí
	    }
	}

	public void Acceso(int n) {
	    ListaT<T> L = new ListaT<>();
	    PilaT<T> P = new PilaT<>();
	    ColaT<T> C = new ColaT<>();
	    
	    for (int i = 0; i < n; i++) {
	        L.acceder(i); // Aquí deberías proporcionar el índice de tipo T al que deseas acceder
	        P.acceder(i); // Aquí también
	        C.acceder(i); // Igualmente aquí
	    }
	}


	
	public static void main(String[] args) {
		PruebaDeTiempoT<Integer> P1 = new PruebaDeTiempoT<>();
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
