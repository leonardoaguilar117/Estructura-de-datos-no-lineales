import java.util.*;

public class grafoCiudad {
    private int vertices;
    private int[][] matrizAdyacencia;

    public grafoCiudad(int vertices) {
        this.vertices = vertices;
        matrizAdyacencia = new int[vertices][vertices];
    }

    public void agregarArista(int origen, int destino, int peso) {
        matrizAdyacencia[origen][destino] = peso;
        matrizAdyacencia[destino][origen] = peso; // Esto hace que el grafo sea no dirigido
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vertices = 10; 
        grafoCiudad grafoCiudad = new grafoCiudad(vertices);

     
        grafoCiudad.agregarArista(0, 1, 6);
        grafoCiudad.agregarArista(0, 2, 9);
        grafoCiudad.agregarArista(1, 2, 1);
        grafoCiudad.agregarArista(1, 3, 7);
        grafoCiudad.agregarArista(1, 4, 8);
        grafoCiudad.agregarArista(2, 5, 1);
        grafoCiudad.agregarArista(3, 4, 2);
        grafoCiudad.agregarArista(3, 6, 8);
        grafoCiudad.agregarArista(4, 5, 2);
        grafoCiudad.agregarArista(4, 6, 4);
        grafoCiudad.agregarArista(4, 7, 4);
        grafoCiudad.agregarArista(5, 9, 9);
        grafoCiudad.agregarArista(6, 7, 2);
        grafoCiudad.agregarArista(6, 8, 3);
        grafoCiudad.agregarArista(6, 9, 3);
        grafoCiudad.agregarArista(7, 8, 1);
        grafoCiudad.agregarArista(7, 9, 2);
        grafoCiudad.agregarArista(8, 9, 8);

        System.out.println("Ingrese el nodo de origen:");
        int origen = scanner.nextInt(); // Vértice origen para iniciar el algoritmo de Dijkstra

        System.out.println("Ingrese el nodo de destino:");
        int destino = scanner.nextInt(); // Vértice destino para calcular las distancias más cortas

        Dijkstra dijkstra = new Dijkstra(grafoCiudad);
        int[] distanciasMasCortas = dijkstra.calcularDistanciasMasCortas(origen, destino);

        System.out.println("Distancias más cortas desde el nodo " + origen + " al nodo " + destino + ":");
        System.out.println("Distancia: " + distanciasMasCortas[destino]);
    }

    static class Dijkstra {
        private grafoCiudad grafo;

        public Dijkstra(grafoCiudad grafo) {
            this.grafo = grafo;
        }

        public int[] calcularDistanciasMasCortas(int origen, int destino) {
            int[] distancia = new int[grafo.vertices];
            boolean[] visitado = new boolean[grafo.vertices];
            Arrays.fill(distancia, Integer.MAX_VALUE);
            distancia[origen] = 0;

            PriorityQueue<Arista> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.peso));
            minHeap.add(new Arista(origen, 0));

            while (!minHeap.isEmpty()) {
                Arista actual = minHeap.poll();
                int u = actual.destino;
                if (visitado[u]) continue;
                visitado[u] = true;

                for (int v = 0; v < grafo.vertices; v++) {
                    if (grafo.matrizAdyacencia[u][v] != 0 && !visitado[v]) {
                        int nuevaDistancia = distancia[u] + grafo.matrizAdyacencia[u][v];
                        if (nuevaDistancia < distancia[v]) {
                            distancia[v] = nuevaDistancia;
                            minHeap.add(new Arista(v, nuevaDistancia));
                        }
                    }
                }
            }

            return distancia;
        }

        static class Arista {
            int destino;
            int peso;

            public Arista(int destino, int peso) {
                this.destino = destino;
                this.peso = peso;
            }
        }
    }
}

