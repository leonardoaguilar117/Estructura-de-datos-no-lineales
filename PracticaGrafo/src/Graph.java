import java.util.*;

class Graph {
    private int vertices;
    private List<List<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>(vertices);
        
        for (int i = 0; i < vertices+1; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdgeDirected(int source, int destination) {
        adjacencyList.get(source).add(destination); 
    }
    
    public void addEdgeUndirected(int source, int destination) {
        if (!adjacencyList.get(source).contains(destination)) {
            adjacencyList.get(source).add(destination);
        }
        if (!adjacencyList.get(destination).contains(source)) {
            adjacencyList.get(destination).add(source);
        }
    }
    
    public void busquedaProfunda(int verticeInicio) {
        boolean[] visitados = new boolean[vertices + 1];
        Stack<Integer> pila = new Stack<>();
        
        pila.push(verticeInicio);
        
        while (!pila.isEmpty()) {
            int actVertice = pila.pop();
            if (!visitados[actVertice]) {
                visitados[actVertice] = true;
                System.out.print(actVertice + " ");
                
                List<Integer> vecinos = adjacencyList.get(actVertice);
                for (int vecino : vecinos) {
                    if (!visitados[vecino]) {
                        pila.push(vecino);
                    }
                }
            }
        }
    }
    
    public void busquedaAnchura(int verticeInicio) {
        boolean[] visitados = new boolean[vertices + 1];
        Queue<Integer> cola = new LinkedList<>();
        
        visitados[verticeInicio] = true;
        cola.offer(verticeInicio);
        
        while (!cola.isEmpty()) {
            int actVertice = cola.poll();
            System.out.print(actVertice + " ");
            
            List<Integer> vecinos = adjacencyList.get(actVertice);
            for (int vecino : vecinos) {
                if (!visitados[vecino]) {
                    visitados[vecino] = true;
                    cola.offer(vecino);
                }
            }
        }
    }

   

	public static void main(String []args) {
		Graph grafo1 = new Graph(6);
		
		grafo1.addEdgeUndirected(1, 2);
		grafo1.addEdgeUndirected(1, 5);
		
		grafo1.addEdgeUndirected(5, 2);
		grafo1.addEdgeUndirected(5, 4);
		
		grafo1.addEdgeUndirected(4, 5);
		grafo1.addEdgeUndirected(4, 3);
		
		grafo1.addEdgeUndirected(3, 2);
		
		grafo1.addEdgeUndirected(6, 4);
		
		grafo1.busquedaAnchura(1);
	}
    
    
}




