import java.util.ArrayList;
import java.util.List;

public class ArbolBin {

    private Nodo raiz;
    private int num_nodos;

    // Método de inserción personalizado
    public void insertar(int[] valores) {
        if (valores == null || valores.length == 0) {
            return;
        }
        this.raiz = insertarRecursivo(valores, 0);
    }

    private Nodo insertarRecursivo(int[] valores, int indice) {
        if (indice >= valores.length) {
            return null;
        }

        Nodo nodo = new Nodo(valores[indice]);
        nodo.setIzq(insertarRecursivo(valores, 2 * indice + 1));
        nodo.setDer(insertarRecursivo(valores, 2 * indice + 2));

        return nodo;
    }
    
    public void imprimirCamino(int valor) {
        List<Integer> camino = new ArrayList<>();
        if (encontrarCamino(raiz, valor, camino)) {
            System.out.print("Camino desde la raiz hasta " + valor + ": ");
            for (int i = 0; i < camino.size() - 1; i++) {
                System.out.print(camino.get(i) + " -> ");
            }
            System.out.println(camino.get(camino.size() - 1));
        } else {
            System.out.println("No se encontro el nodo con el valor " + valor);
        }
    }

    private boolean encontrarCamino(Nodo nodo, int valor, List<Integer> camino) {
        if (nodo == null) {
            return false;
        }
        camino.add(nodo.getDato());
        if (nodo.getDato() == valor) {
            return true;
        }
        if (encontrarCamino(nodo.getIzq(), valor, camino) || encontrarCamino(nodo.getDer(), valor, camino)) {
            return true;
        }
        camino.remove(camino.size() - 1);
        return false;
    }
}
