public class Cola {

    private Nodo primero;
    private Nodo ultimo;

    public void encolar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (primero == null) {
            primero = ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public int desencolar() {
        if (primero == null) {
            return -1;
        } else {
            int dato = primero.dato;
            primero = primero.siguiente;
            if (primero == null) {
                ultimo = null;
            }
            return dato;
        }
    }

    public int consultar() {
        if (primero == null) {
            return -1;
        } else {
            return primero.dato;
        }
    }
    
    public int eliminarElemento() {
        if (ultimo == null) {
            return -1;
        }
        int dato = ultimo.dato;
        if (primero == ultimo) {
            primero = ultimo = null;
        } else {
            Nodo actual = primero;
            while (actual.siguiente != ultimo) {
                actual = actual.siguiente;
            }
            actual.siguiente = null;
            ultimo = actual;
        }
        return dato;
    }
    
    public int buscarElemento(int elemento){
    	Nodo aux = primero;
    	while(aux != null) {
    		if(aux.dato == elemento){
    			return aux.dato;
    		}
    		aux = aux.siguiente;
    	}
    	return -1;
    }
    
    public int acceder(int posicion) {
        if (posicion < 0 || posicion >= size()) {
            return -1;
        }
        Nodo actual = primero;
        for (int i = 0; i < posicion; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }
    
    public int size() {
        int size = 0;
        Nodo actual = primero;
        while (actual != null) {
            size++;
            actual = actual.siguiente;
        }
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Nodo actual = primero;
        while (actual != null) {
            sb.append(actual.dato);
            if (actual.siguiente != null) {
                sb.append(", ");
            }
            actual = actual.siguiente;
        }
        sb.append("]");
        return sb.toString();
    }
}

