import java.util.*;

public class UnionMonticulos {

    public static void main(String[] args) {
        // Montículos originales
        PriorityQueue<Integer> monticulo1 = new PriorityQueue<>();
        PriorityQueue<Integer> monticulo2 = new PriorityQueue<>();

        // Agregar elementos a los montículos originales
        monticulo1.add(3);
        monticulo1.add(6);
        monticulo1.add(9);

        monticulo2.add(2);
        monticulo2.add(5);
        monticulo2.add(8);

        // Unir los montículos
        PriorityQueue<Integer> monticuloUnion = unirMonticulos(monticulo1, monticulo2);

        // Imprimir el nuevo árbol por niveles
        System.out.println("Nuevo arbol por niveles:");
        imprimirPorNiveles(monticuloUnion);
    }

    // Método para unir dos montículos
    public static PriorityQueue<Integer> unirMonticulos(PriorityQueue<Integer> monticulo1, PriorityQueue<Integer> monticulo2) {
        PriorityQueue<Integer> monticuloUnion = new PriorityQueue<>(monticulo1);
        monticuloUnion.addAll(monticulo2);
        return monticuloUnion;
    }

    // Método para imprimir el árbol por niveles
    public static void imprimirPorNiveles(PriorityQueue<Integer> monticulo) {
        while (!monticulo.isEmpty()) {
            System.out.println(monticulo.poll());
        }
    }
}
