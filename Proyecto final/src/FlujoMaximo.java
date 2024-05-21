import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FlujoMaximo {

    // Clase interna que representa el grafo
    static class Grafo {
        int numVertices;
        int[][] capacidad;
        Set<Integer> fuentes;
        Set<Integer> sumideros;

        public Grafo(int numVertices) {
            this.numVertices = numVertices;
            this.capacidad = new int[numVertices][numVertices];
            this.fuentes = new HashSet<>();
            this.sumideros = new HashSet<>();
        }

        // Método para añadir una arista con capacidad
        public void agregarArista(int desde, int hasta, int cap) {
            this.capacidad[desde][hasta] += cap;
        }

        // Método para añadir un nodo fuente
        public void agregarFuente(int fuente) {
            this.fuentes.add(fuente);
        }

        // Método para añadir un nodo sumidero
        public void agregarSumidero(int sumidero) {
            this.sumideros.add(sumidero);
        }
    }

    // Método para leer el archivo DIMACS y crear el grafo
    public static Grafo leerDimacsMaxFlujo(String nombreArchivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        Grafo grafo = null;

        while ((linea = br.readLine()) != null) {
            String[] partes = linea.trim().split("\\s+");
            if (partes[0].equals("p")) {
                int numVertices = Integer.parseInt(partes[2]);
                grafo = new Grafo(numVertices);
            } else if (partes[0].equals("n")) {
                int nodo = Integer.parseInt(partes[1]) - 1;
                int suministro = Integer.parseInt(partes[2]);
                if (suministro > 0) {
                    grafo.agregarFuente(nodo);
                } else if (suministro < 0) {
                    grafo.agregarSumidero(nodo);
                }
            } else if (partes[0].equals("a")) {
                int desde = Integer.parseInt(partes[1]) - 1;
                int hasta = Integer.parseInt(partes[2]) - 1;
                int capacidad = Integer.parseInt(partes[4]);
                grafo.agregarArista(desde, hasta, capacidad);
            }
        }
        br.close();
        return grafo;
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        try {
            Grafo grafo = leerDimacsMaxFlujo("C:\\Users\\leona\\Downloads\\UAM\\Estructura de datos no lineales\\Proyecto final\\net.min");
            System.out.println("Flujo maximo: " + flujoMaximoParaMultiplesFuentesYSumideros(grafo));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para realizar BFS y encontrar un camino aumentante
    public static boolean bfs(int[][] grafoResidual, int fuente, int sumidero, int[] padre) {
        boolean[] visitado = new boolean[grafoResidual.length];
        Queue<Integer> cola = new LinkedList<>();
        cola.add(fuente);
        visitado[fuente] = true;
        padre[fuente] = -1;

        while (!cola.isEmpty()) {
            int u = cola.poll();

            for (int v = 0; v < grafoResidual.length; v++) {
                if (!visitado[v] && grafoResidual[u][v] > 0) {
                    cola.add(v);
                    padre[v] = u;
                    visitado[v] = true;
                    if (v == sumidero) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Implementación del algoritmo de Ford-Fulkerson para un par fuente-sumidero
    public static int fordFulkerson(int[][] capacidad, int fuente, int sumidero) {
        int u, v;
        int[][] grafoResidual = new int[capacidad.length][capacidad.length];

        for (u = 0; u < capacidad.length; u++) {
            for (v = 0; v < capacidad.length; v++) {
                grafoResidual[u][v] = capacidad[u][v];
            }
        }

        int[] padre = new int[capacidad.length];
        int flujoMaximo = 0;

        // Buscar caminos aumentantes usando BFS
        while (bfs(grafoResidual, fuente, sumidero, padre)) {
            int flujoCamino = Integer.MAX_VALUE;
            for (v = sumidero; v != fuente; v = padre[v]) {
                u = padre[v];
                flujoCamino = Math.min(flujoCamino, grafoResidual[u][v]);
            }

            // Actualizar capacidades residuales
            for (v = sumidero; v != fuente; v = padre[v]) {
                u = padre[v];
                grafoResidual[u][v] -= flujoCamino;
                grafoResidual[v][u] += flujoCamino;
            }

            flujoMaximo += flujoCamino;
        }

        return flujoMaximo;
    }

    // Método para calcular el flujo máximo considerando todas las combinaciones de fuentes y sumideros
    public static int flujoMaximoParaMultiplesFuentesYSumideros(Grafo grafo) {
        int flujoMaximoTotal = 0;
        for (int fuente : grafo.fuentes) {
            for (int sumidero : grafo.sumideros) {
                flujoMaximoTotal += fordFulkerson(grafo.capacidad, fuente, sumidero);
            }
        }
        return flujoMaximoTotal;
    }
}
