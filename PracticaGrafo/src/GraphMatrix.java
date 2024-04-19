import java.util.*;

class GraphMatrix {
    private int vertices;
    private int[][] adjacencyMatrix;

    public GraphMatrix(int vertices) {
        this.vertices = vertices;
        this.adjacencyMatrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1; 
        }

   
    public void busquedaProfunda(int verticeInicio) {
        boolean[] visitados = new boolean[vertices];
        Stack<Integer> pila = new Stack<>();
        
        pila.push(verticeInicio);
        visitados[verticeInicio] = true;
        
        while (!pila.isEmpty()) {
            int vertAct = pila.pop();
            System.out.print(vertAct + " ");
            
            for (int i = 0; i < vertices; i++) {
                if (adjacencyMatrix[vertAct][i] == 1 && !visitados[i]) {
                    pila.push(i);
                    visitados[i] = true;
                }
            }
        }
    }
    
    
    public void busquedaAnchura(int verticeInicio) {
        boolean[] visitados = new boolean[vertices];
        Queue<Integer> cola = new LinkedList<>();
        
        visitados[verticeInicio] = true;
        cola.offer(verticeInicio);
        
        while (!cola.isEmpty()) {
            int vertAct = cola.poll();
            System.out.print(vertAct + " ");
            
            for (int i = 0; i < vertices; i++) {
                if (adjacencyMatrix[vertAct][i] == 1 && !visitados[i]) {
                    visitados[i] = true;
                    cola.offer(i);
                }
            }
        }
    }

    
}

