import java.util.*;

public class UnionMonticulos {

    public static void main(String[] args) {
        // Montículos originales
        PriorityQueue<Integer> monticulo1 = new PriorityQueue<>();
        PriorityQueue<Integer> monticulo2 = new PriorityQueue<>();

        monticulo1.add(3);
        monticulo1.add(6);
        monticulo1.add(9);

        monticulo2.add(2);
        monticulo2.add(5);
        monticulo2.add(8);

        // UNE los montículos
        PriorityQueue<Integer> monticuloUnion = unirMonticulos(monticulo1, monticulo2);
        System.out.println("Nuevo arbol por niveles:");
        imprimirPorNiveles(monticuloUnion);
    }

    public static PriorityQueue<Integer> unirMonticulos(PriorityQueue<Integer> monticulo1, PriorityQueue<Integer> monticulo2) {
        PriorityQueue<Integer> monticuloUnion = new PriorityQueue<>(monticulo1);
        monticuloUnion.addAll(monticulo2);
        return monticuloUnion;
    }

    public static void imprimirPorNiveles(PriorityQueue<Integer> monticulo) {
        while (!monticulo.isEmpty()) {
            System.out.println(monticulo.poll());
        }
    }
}
