import java.util.*;

public class BFS {
    static ArrayList<ArrayList<Integer>> grafo = new ArrayList<>();
    static int inicio = 0;
    static int fin = 4;
    static List<Integer> nodosVisitados = new ArrayList<>();

    public static void main(String[] args) {
        crearGrafo();
        bfs();
        System.out.println("Nodos visitados durante BFS: " + nodosVisitados);
    }

    private static void crearGrafo() {
        grafo.add(new ArrayList<>(Arrays.asList(1, 2)));
        grafo.add(new ArrayList<>(Arrays.asList(0, 3)));
        grafo.add(new ArrayList<>(Arrays.asList(0, 3, 4)));
        grafo.add(new ArrayList<>(Arrays.asList(1, 2, 4)));
        grafo.add(new ArrayList<>(Arrays.asList(2, 3)));
    }

    private static void bfs() {
        Queue<Integer> cola = new LinkedList<>();
        boolean[] visitado = new boolean[grafo.size()];

        cola.add(inicio);
        visitado[inicio] = true;

        while (!cola.isEmpty()) {
            int actual = cola.poll();
            nodosVisitados.add(actual);

            for (int vecino : grafo.get(actual)) {
                if (!visitado[vecino]) {
                    cola.add(vecino);
                    visitado[vecino] = true;
                }
            }
        }
    }
}
