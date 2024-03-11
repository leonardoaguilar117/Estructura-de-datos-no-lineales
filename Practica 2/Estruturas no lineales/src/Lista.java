public class Lista {
    private Nodo primero;
    private Nodo ultimo;

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (primero == null) {
            primero = ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }
    
    public int eliminar(int posicion) {
        if (posicion < 0 || posicion >= size()) {
            return -1;
        }
        if (posicion == 0) {
            return eliminarPrimero();
        } else if (posicion == size() - 1) {
            return eliminarUltimo();
        } else {
            Nodo anterior = obtenerNodo(posicion - 1);
            Nodo actual = anterior.siguiente;
            anterior.siguiente = actual.siguiente;
            return actual.dato;
        }
    }

    private int eliminarPrimero() {
        if (primero == null) {
            return -1;
        }
        int dato = primero.dato;
        primero = primero.siguiente;
        if (primero == null) {
            ultimo = null;
        }
        return dato;
    }

    private int eliminarUltimo() {
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

    public boolean buscar(int dato) {
        Nodo actual = primero;
        while (actual != null) {
            if (actual.dato == dato) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
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

    private Nodo obtenerNodo(int posicion) {
        if (posicion < 0 || posicion >= size()) {
            return null;
        }
        Nodo actual = primero;
        for (int i = 0; i < posicion; i++) {
            actual = actual.siguiente;
        }
        return actual;
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

