
public class PruebaDeTiempo {
	
	public PruebaDeTiempo() {
		
	}
	
	public void operList(int n) {
		double inicio, fin, res; 
		Lista L = new Lista();
		
		inicio = System.nanoTime();
		for(int i=0; i<n; i++) {
			L.insertar(i);
		}
		fin = System.nanoTime();
		res = fin - inicio;
		System.out.println("Insertar en lista con "+ n +" elementos: "+res);
		
		
		inicio = System.nanoTime();
		for(int i=0; i<n; i++) {
			L.buscar(i);
		}
		fin = System.nanoTime();
		res = fin - inicio;
		System.out.println("Buscar en lista con "+ n +" elementos: "+res);
		
		inicio = System.nanoTime();
		for(int i=0; i<n; i++) {
			L.acceder(i);
		}
		fin = System.nanoTime();
		res = fin - inicio;
		System.out.println("Acceder en lista con "+ n +" elementos: "+res);
		
		inicio = System.nanoTime();
		for(int i=0; i<n; i++) {
			L.eliminar(i);
		}
		fin = System.nanoTime();
		res = fin - inicio;
		System.out.println("Eliminar en lista con "+ n +" elementos: "+res);	
	}

	public void operCola(int n) {
		double inicio, fin, res; 
		Cola L = new Cola();
		
		inicio = System.nanoTime();
		for(int i=0; i<n; i++) {
			L.encolar(i);
		}
		fin = System.nanoTime();
		res = fin - inicio;
		System.out.println("Insertar en cola con "+ n+" elementos: "+res);
		
		
		inicio = System.nanoTime();
		for(int i=0; i<n; i++) {
			L.buscarElemento(i);
		}
		fin = System.nanoTime();
		res = fin - inicio;
		System.out.println("Buscar en cola con "+ n+" elementos: "+res);
		
		inicio = System.nanoTime();
		for(int i=0; i<n; i++) {
			L.acceder(i);
		}
		fin = System.nanoTime();
		res = fin - inicio;
		System.out.println("Acceder en cola con "+ 50+" elementos: "+res);
		
		inicio = System.nanoTime();
		for(int i=0; i<n; i++) {
			L.desencolar();
		}
		fin = System.nanoTime();
		res = fin - inicio;
		System.out.println("Borrar en cola con "+ n+" elementos: "+res);	
	}
	
	public void operPila(int n) {
		double inicio, fin, res; 
		Pila L = new Pila();
		
		inicio = System.nanoTime();
		for(int i=0; i<n; i++) {
			L.push(i);
		}
		fin = System.nanoTime();
		res = fin - inicio;
		System.out.println("Insertar en pila con "+ n +" elementos: "+res);
		
		
		inicio = System.nanoTime();
		for(int i=0; i<n; i++) {
			L.buscar(i);
		}
		fin = System.nanoTime();
		res = fin - inicio;
		System.out.println("Buscar en pila con "+ n+" elementos: "+res);
		
		inicio = System.nanoTime();
		for(int i=0; i<n; i++) {
			L.acceder(i);
		}
		fin = System.nanoTime();
		res = fin - inicio;
		System.out.println("Acceder en pila con "+ n+" elementos: "+res);
		
		inicio = System.nanoTime();
		for(int i=0; i<n; i++) {
			L.pop();
		}
		fin = System.nanoTime();
		res = fin - inicio;
		System.out.println("Borrar en pila con "+ n+" elementos: "+res);	
	}

	public static void main(String args[]) {
		PruebaDeTiempo P = new PruebaDeTiempo();
		
		P.operList(50000);
		System.out.println(" ");
		P.operCola(50000);
		System.out.println(" ");
		P.operPila(50000);
		
	}
	
}
