public class PilaT<T>{

    private NodoT<T> cima;
    
    public void apilar(T dato) {
        NodoT<T> nuevo = new NodoT<>(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public T desapilar() {
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
