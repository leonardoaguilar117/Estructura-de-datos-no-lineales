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

