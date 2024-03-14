public class ColaT<T> {

    private NodoT<T> primero;
    private NodoT<T> ultimo;

    public void encolar(T dato) {
        NodoT<T> nuevo = new NodoT<>(dato);
        if (primero == null) {
            primero = ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }
    
    public T desencolar() {
        if (primero == null) {
            return null;
        } else {
            T dato = primero.dato;
            primero = primero.siguiente;
            if (primero == null) {
                ultimo = null;
            }
            return dato;
        }
    }
    
    public T buscarElemento(T elemento){
    	NodoT<T> aux = primero;
    	while(aux != null) {
    		if(aux.dato == elemento){
    			return aux.dato;
    		}
    		aux = aux.siguiente;
    	}
    	return null;
    }
    
    public T eliminarElemento() {
        if (ultimo == null) {
            return null;
        }
        T dato = ultimo.dato;
        if (primero == ultimo) {
            primero = ultimo = null;
        } else {
            NodoT<T> actual = primero;
            while (actual.siguiente != ultimo) {
                actual = actual.siguiente;
            }
            actual.siguiente = null;
            ultimo = actual;
        }
        return dato;
    }

    public T consultar() {
        if (primero == null) {
            return null;
        } else {
            return primero.dato;
        }
    }
    
    public T acceder(int posicion) {
        if (posicion < 0 || posicion >= size()) {
            return null;
        }
        NodoT<T> actual = primero;
        for (int i = 0; i < posicion; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }
    
    public int size() {
        int size = 0;
        NodoT<T> actual = primero;
        while (actual != null) {
            size++;
            actual = actual.siguiente;
        }
        return size;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        NodoT<T> actual = primero;
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

