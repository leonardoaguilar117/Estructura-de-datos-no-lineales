import java.util.*;

class Grafo {
    private int V; // Número de vértices
    private LinkedList<Integer>[] adyacencias; // Lista de adyacencias

    public Grafo(int v) {
        V = v;
        adyacencias = new LinkedList[V];
        for (int i = 0; i < V; ++i)
            adyacencias[i] = new LinkedList<>();
    }

    // Método para agregar una arista al grafo
    public void agregarArista(int v, int w) {
        adyacencias[v].add(w);
        adyacencias[w].add(v);
    }

    // Método para recorrer el grafo en anchura (BFS)
    public void BFS(int v, boolean[] visitado) {
        LinkedList<Integer> cola = new LinkedList<>();
        visitado[v] = true;
        cola.add(v);

        while (!cola.isEmpty()) {
            v = cola.poll();
            System.out.print(v + " ");

            Iterator<Integer> i = adyacencias[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visitado[n]) {
                    visitado[n] = true;
                    cola.add(n);
                }
            }
        }
    }

    // Método para verificar si el grafo es conexo
    public boolean esConexo() {
        boolean[] visitado = new boolean[V];
        Arrays.fill(visitado, false);

        BFS(0, visitado); // Realizar un BFS desde el primer nodo

        // Verificar si todos los nodos fueron visitados
        for (int i = 0; i < V; i++) {
            if (!visitado[i])
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Grafo g = new Grafo(8); // Crear un grafo con 8 nodos

        // Agregar aristas al grafo
        g.agregarArista(0, 1);
        g.agregarArista(0, 2);
        g.agregarArista(1, 3);
        g.agregarArista(2, 4);
        g.agregarArista(3, 5);
        g.agregarArista(4, 6);
        g.agregarArista(5, 7);

        System.out.println("Recorrido en anchura (BFS) desde el nodo 0:");
        boolean[] visitado = new boolean[8];
        g.BFS(0, visitado);

        // Verificar si el grafo es conexo
        if (g.esConexo())
            System.out.println("\nEl grafo es conexo.");
        else
            System.out.println("\nEl grafo no es conexo.");
    }
}
