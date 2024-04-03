public class BinTree {
	
    // Atributos
    Nodo root;
    int level;
    
    // Constructor
    public BinTree(int N) {
        this.level = N;
        this.root = null;
    }

    // Método para agregar un nodo
    public void addNode(int data) {
        Nodo newNode = new Nodo(data);
        root = addNodeRecursive(root, newNode, level);
    }

    // Método recursivo para agregar un nodo
    private Nodo addNodeRecursive(Nodo actualNode, Nodo newNode, int currentLevel) {
        // Si el nodo actual es nulo y el nivel actual es mayor o igual a cero, asigna el nuevo nodo al nodo actual
        if (actualNode == null && currentLevel >= 0) {
            return newNode;
        }
        // Agrega el nuevo nodo al subárbol izquierdo si el nivel actual es mayor o igual a cero
        if (currentLevel >= 0) {
            actualNode.setLeft(addNodeRecursive(actualNode.getLeft(), newNode, currentLevel - 1));
        }
        // Agrega el nuevo nodo al subárbol derecho si el nivel actual es mayor o igual a cero y el subárbol derecho está vacío
        if (currentLevel >= 0 && actualNode.getRight() == null) {
            actualNode.setRight(addNodeRecursive(actualNode.getRight(), newNode, currentLevel - 1));
        }
        // Retorna el nodo actual modificado
        return actualNode;
    }

    // Método para imprimir el árbol (recorrido en orden)
    public void printInOrder(Nodo node) {
        if (node != null) {
            printInOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            printInOrder(node.getRight());
            
        }
    }

    public static void main(String[] args) {
        BinTree tree = new BinTree(2);
        tree.addNode(1);
        tree.addNode(2);
        tree.addNode(3);


        System.out.println("Árbol binario (recorrido en orden):");
        tree.printInOrder(tree.root);
    }
}
