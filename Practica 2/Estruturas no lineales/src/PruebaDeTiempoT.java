public class PruebaDeTiempoT<T> {
    
    public PruebaDeTiempoT() {
        
    }
    
    public void operList(int n) {
        double inicio, fin, res; 
        ListaT<T> L = new ListaT<>();
        
        inicio = System.nanoTime();
        for(int i=0; i<n; i++) {
            // Insertar elementos en la lista
            L.insertar((T) Integer.valueOf(i)); // Suponiendo que la lista toma elementos de tipo Integer
        }
        fin = System.nanoTime();
        res = fin - inicio;
        System.out.println("Insertar en lista con "+ n +" elementos: "+res);
        
        
        inicio = System.nanoTime();
        for(int i=0; i<n; i++) {
            // Buscar elementos en la lista
            L.buscar((T) Integer.valueOf(i)); // Suponiendo que la lista toma elementos de tipo Integer
        }
        fin = System.nanoTime();
        res = fin - inicio;
        System.out.println("Buscar en lista con "+ n +" elementos: "+res);
        
        inicio = System.nanoTime();
        for(int i=0; i<n; i++) {
            // Acceder a elementos en la lista
            L.acceder(i);
        }
        fin = System.nanoTime();
        res = fin - inicio;
        System.out.println("Acceder en lista con "+ n +" elementos: "+res);
        
        inicio = System.nanoTime();
        for(int i=0; i<n; i++) {
            // Eliminar elementos en la lista
            L.eliminar(i); // Suponiendo que la lista toma elementos de tipo Integer
        }
        fin = System.nanoTime();
        res = fin - inicio;
        System.out.println("Eliminar en lista con "+ n +" elementos: "+res);    
    }

    public void operCola(int n) {
        double inicio, fin, res; 
        ColaT<T> L = new ColaT<>();
        
        inicio = System.nanoTime();
        for(int i=0; i<n; i++) {
            // Encolar elementos
            L.encolar((T) Integer.valueOf(i)); // Suponiendo que la cola toma elementos de tipo Integer
        }
        fin = System.nanoTime();
        res = fin - inicio;
        System.out.println("Insertar en cola con "+ n+" elementos: "+res);
        
        
        inicio = System.nanoTime();
        for(int i=0; i<n; i++) {
            // Buscar elementos en la cola
            L.buscarElemento((T) Integer.valueOf(i)); // Suponiendo que la cola toma elementos de tipo Integer
        }
        fin = System.nanoTime();
        res = fin - inicio;
        System.out.println("Buscar en cola con "+ n+" elementos: "+res);
        
        inicio = System.nanoTime();
        for(int i=0; i<n; i++) {
            // Acceder a elementos en la cola
            L.acceder(i);
        }
        fin = System.nanoTime();
        res = fin - inicio;
        System.out.println("Acceder en cola con "+ 50+" elementos: "+res);
        
        inicio = System.nanoTime();
        for(int i=0; i<n; i++) {
            // Desencolar elementos
            L.desencolar();
        }
        fin = System.nanoTime();
        res = fin - inicio;
        System.out.println("Borrar en cola con "+ n+" elementos: "+res);    
    }
    
    public void operPila(int n) {
        double inicio, fin, res; 
        PilaT<T> L = new PilaT<>();
        
        inicio = System.nanoTime();
        for(int i=0; i<n; i++) {
            // Insertar elementos en la pila
            L.push((T) Integer.valueOf(i)); // Suponiendo que la pila toma elementos de tipo Integer
        }
        fin = System.nanoTime();
        res = fin - inicio;
        System.out.println("Insertar en pila con "+ n +" elementos: "+res);
        
        
        inicio = System.nanoTime();
        for(int i=0; i<n; i++) {
            // Buscar elementos en la pila
            L.buscar((T) Integer.valueOf(i)); // Suponiendo que la pila toma elementos de tipo Integer
        }
        fin = System.nanoTime();
        res = fin - inicio;
        System.out.println("Buscar en pila con "+ n+" elementos: "+res);
        
        inicio = System.nanoTime();
        for(int i=0; i<n; i++) {
            // Acceder a elementos en la pila
            L.acceder(i);
        }
        fin = System.nanoTime();
        res = fin - inicio;
        System.out.println("Acceder en pila con "+ n+" elementos: "+res);
        
        inicio = System.nanoTime();
        for(int i=0; i<n; i++) {
            // Desapilar elementos
            L.pop();
        }
        fin = System.nanoTime();
        res = fin - inicio;
        System.out.println("Borrar en pila con "+ n+" elementos: "+res);    
    }

    public static void main(String args[]) {
        PruebaDeTiempoT<Integer> P = new PruebaDeTiempoT<>();
        
        P.operList(5000);
        System.out.println(" ");
        P.operCola(5000);
        System.out.println(" ");
        P.operPila(5000);
        
    }
    
}

