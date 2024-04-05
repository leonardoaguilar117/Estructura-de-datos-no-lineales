public class ArbolBinBusqueda {

    private NodoABB raiz;
    private int num_nodos;

    // Constructor
    public ArbolBinBusqueda() {
        num_nodos = 0;
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private NodoABB insertarRecursivo(NodoABB nodo, int valor) {
        if (nodo == null) {
            num_nodos++;
            return new NodoABB(valor);
        }
        if (valor < nodo.getValor()) {
            nodo.setIzq(insertarRecursivo(nodo.getIzq(), valor));
        } else if (valor > nodo.getValor()) {
            nodo.setDer(insertarRecursivo(nodo.getDer(), valor));
        } else {
            nodo.agregarValor(valor);
        }
        return nodo;
    }

    private void imprimirArbolRecursivo(NodoABB nodo, int nivel) {
        if (nodo == null) {
            return;
        }

        for (int i = 0; i < nivel; i++) {
            System.out.print("   ");
        }
        System.out.println(nodo.getValor());

        imprimirArbolRecursivo(nodo.getIzq(), nivel + 1);
        imprimirArbolRecursivo(nodo.getDer(), nivel + 1);
    }

    public void imprimirArbol() {
        imprimirArbolRecursivo(raiz, 0);
    }

    public static void main(String[] args) {
        ArbolBinBusqueda arbol = new ArbolBinBusqueda();

        int[] valores = { 5, 5, 3, 2, 7, 1, 12, 1, 0 }; // Valores múltiples: 7
        for (int valor : valores) {
            arbol.insertar(valor);
        }

        // Imprimir el árbol
        System.out.println("Árbol binario de búsqueda:");
        arbol.imprimirArbol();
    }
}