public class NodoT<T> {
    T dato;
    NodoT<T> siguiente;

    public NodoT(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    
}

