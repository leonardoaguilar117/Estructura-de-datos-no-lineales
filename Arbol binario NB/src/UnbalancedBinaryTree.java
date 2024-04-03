public class UnbalancedBinaryTree {
	
    private TreeNode root;

    public UnbalancedBinaryTree() {
        this.root = null;
    }

    // Implementar la inserción de un valor en el árbol
    public void insert(int val) {
        TreeNode nuevo = new TreeNode(val);
        // Implementación necesaria
        insertaRecursivo(nuevo, root);
    }

    public void insertaRecursivo(TreeNode nodo_nuevo, TreeNode nodo_actual){
        if (root == null) {
            root = nodo_nuevo; // Si el árbol está vacío, el nuevo nodo se convierte en la raíz
        } else {
            if (nodo_nuevo.getVal() < nodo_actual.getVal()) { // Si el valor del nuevo nodo es menor que el valor del nodo actual
                if (nodo_actual.getLeft() == null) { // Si no hay nodo hijo izquierdo
                    nodo_actual.setLeft(nodo_nuevo); // Inserta el nuevo nodo como hijo izquierdo
                } else {
                    insertaRecursivo(nodo_nuevo, nodo_actual.getLeft()); // Hace recursión en el hijo izquierdo
                }
            } else { // Si el valor del nuevo nodo es mayor o igual que el valor del nodo actual
                if (nodo_actual.getRight() == null) { // Si no hay nodo hijo derecho
                    nodo_actual.setRight(nodo_nuevo); // Inserta el nuevo nodo como hijo derecho
                } else {
                    insertaRecursivo(nodo_nuevo, nodo_actual.getRight()); // Hace recursión en el hijo derecho
                }
            }
        }
    }

	public void delete(int val) {
	    root = deleteRecursivo(root, val);
	}

	private TreeNode deleteRecursivo(TreeNode nodo_actual, int val) {
	    if (nodo_actual == null) {
	        return null; // Si el nodo actual es nulo, no hay nada que eliminar
	    }
	    
	    if (val < nodo_actual.getVal()) { // Si el valor a eliminar es menor que el valor del nodo actual
	        nodo_actual.setLeft(deleteRecursivo(nodo_actual.getLeft(), val)); // Eliminar recursivamente en el subárbol izquierdo
	    } else if (val > nodo_actual.getVal()) { // Si el valor a eliminar es mayor que el valor del nodo actual
	        nodo_actual.setRight(deleteRecursivo(nodo_actual.getRight(), val)); // Eliminar recursivamente en el subárbol derecho
	    } else { // Si encontramos el nodo con el valor a eliminar
	        // Caso 1: El nodo es una hoja o tiene un solo hijo
	        if (nodo_actual.getLeft() == null) {
	            return nodo_actual.getRight(); // Retorna el hijo derecho o null si no tiene hijo derecho
	        } else if (nodo_actual.getRight() == null) {
	            return nodo_actual.getLeft(); // Retorna el hijo izquierdo
	        }
	        
	        // Caso 2: El nodo tiene dos hijos
	        // Encontramos el sucesor inmediato (el menor valor en el subárbol derecho)
	        nodo_actual.setVal(findMinValue(nodo_actual.getRight()));
	        // Eliminamos el sucesor inmediato del subárbol derecho
	        nodo_actual.setRight(deleteRecursivo(nodo_actual.getRight(), nodo_actual.getVal()));
	    }
	    return nodo_actual;
	}

	// Método auxiliar para encontrar el valor mínimo en un subárbol
	private int findMinValue(TreeNode nodo_actual) {
	    int minValue = nodo_actual.getVal();
	    while (nodo_actual.getLeft() != null) {
	        minValue = nodo_actual.getLeft().getVal();
	        nodo_actual = nodo_actual.getLeft();
	    }
	    return minValue;
	}

	public boolean search(int val) {
	    return searchRecursivo(root, val);
	}

	private boolean searchRecursivo(TreeNode nodo_actual, int val) {
	    if (nodo_actual == null) {
	        return false; // Si el nodo actual es nulo, el valor no está presente en el árbol
	    }
	    
	    if (val == nodo_actual.getVal()) {
	        return true; // Si el valor coincide con el valor del nodo actual, lo hemos encontrado
	    } else if (val < nodo_actual.getVal()) {
	        return searchRecursivo(nodo_actual.getLeft(), val); // Buscar recursivamente en el subárbol izquierdo
	    } else {
	        return searchRecursivo(nodo_actual.getRight(), val); // Buscar recursivamente en el subárbol derecho
	    }
	}

    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.getLeft());
            System.out.print(root.getVal() + " ");
            inorderTraversal(root.getRight());
        }
    }


    public void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.getVal() + " ");
            preorderTraversal(root.getLeft());
            preorderTraversal(root.getRight());
        }
    }

// Método para imprimir el árbol en orden
    public void posorderTraversal(TreeNode root) {
        if (root != null){  
        	posorderTraversal(root.getLeft());
            posorderTraversal(root.getRight());
            System.out.print(root.getVal() + " ");
        }
    }
}
