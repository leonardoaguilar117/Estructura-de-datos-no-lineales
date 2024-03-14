public class PilaT<T>{

    private NodoT<T> cima;
    
    public void push(T dato) {
        NodoT<T> nuevo = new NodoT<>(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public T pop() {
        if (cima == null) {
            return null;
        } else {
            T dato = cima.dato;
            cima = cima.siguiente;
            return dato;
        }
    }

    public T consultar() {
        if (cima == null) {
            return null;
        } else {
            return cima.dato;
        }
    }
    
    public T acceder(int posicion) {
        if (posicion < 0 || posicion >= size()) {
            return null;
        }
        NodoT<T> actual = cima;
        for (int i = 0; i < posicion; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }
    
    public int size() {
        int size = 0;
        NodoT<T> actual = cima;
        while (actual != null) {
            size++;
            actual = actual.siguiente;
        }
        return size;
    }
    
    public boolean buscar(T dato) {
        NodoT<T> actual = cima;
        while (actual != null) {
            if (actual.dato == dato) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        NodoT<T> actual = cima;
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
