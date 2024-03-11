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

    public T consultar() {
        if (primero == null) {
            return null;
        } else {
            return primero.dato;
        }
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

