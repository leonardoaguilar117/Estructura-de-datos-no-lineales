public class Pila {

    private Nodo cima;

    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public int pop() {
        if (cima == null) {
            return -1;
        } else {
            int dato = cima.dato;
            cima = cima.siguiente;
            return dato;
        }
    }

    public int consultar() {
        if (cima == null) {
            return -1;
        } else {
            return cima.dato;
        }
    }
    
    public int acceder(int posicion) {
        if (posicion < 0 || posicion >= size()) {
            return -1;
        }
        Nodo actual = cima;
        for (int i = 0; i < posicion; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }
    
    public int size() {
        int size = 0;
        Nodo actual = cima;
        while (actual != null) {
            size++;
            actual = actual.siguiente;
        }
        return size;
    }
    
    public boolean buscar(int dato) {
        Nodo actual = cima;
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
        Nodo actual = cima;
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

