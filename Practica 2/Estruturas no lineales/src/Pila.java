public class Pila {

    private Nodo cima;

    public void apilar(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public int desapilar() {
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

