import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import java.util.*;

public class GraphVisualization extends Application {
    static ArrayList<ArrayList<Integer>> grafo = new ArrayList<>();
    static int inicio = 0;
    static int fin = 4;
    static List<Integer> nodosVisitados = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) {
        crearGrafo();
        bfs();

        Pane root = new Pane();
        Scene scene = new Scene(root, 400, 400);

        dibujarGrafo(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Visualización de BFS");
        primaryStage.show();
    }

    private void crearGrafo() {
        grafo.add(new ArrayList<>(Arrays.asList(1, 2)));
        grafo.add(new ArrayList<>(Arrays.asList(0, 3)));
        grafo.add(new ArrayList<>(Arrays.asList(0, 3, 4)));
        grafo.add(new ArrayList<>(Arrays.asList(1, 2, 4)));
        grafo.add(new ArrayList<>(Arrays.asList(2, 3)));
    }

    private void bfs() {
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

    private void dibujarGrafo(Pane root) {
        for (int i = 0; i < grafo.size(); i++) {
            Circle circulo = new Circle(50 + i * 80, 200, 15, Color.BLACK);
            root.getChildren().add(circulo);
        }

        for (int i = 0; i < grafo.size(); i++) {
            for (int vecino : grafo.get(i)) {
                Line linea = new Line(50 + i * 80, 200, 50 + vecino * 80, 200);
                root.getChildren().add(linea);
            }
        }

        for (int i = 0; i < nodosVisitados.size(); i++) {
            int indiceNodo = nodosVisitados.get(i);
            Circle circulo = (Circle) root.getChildren().get(indiceNodo);
            circulo.setFill(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
