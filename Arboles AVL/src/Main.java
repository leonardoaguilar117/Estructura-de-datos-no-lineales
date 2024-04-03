public class Main
{
	public static void main(String[] args) {
	    
	    
	   AVLTree<Integer> tree = new AVLTree<>();

    System.out.println("Inserting 100");
    tree.insert(100);
    tree.print();
    System.out.println("Inserting 99");
    tree.insert(99);
    tree.print();
    System.out.println("Inserting 98");
    tree.insert(98);
tree.print();
    System.out.println("Inserting 97");
    tree.insert(97);
    tree.print();
    System.out.println("Inserting 96");
    tree.insert(96);
   tree.print();
    System.out.println("Inserting 95");
    tree.insert(95);
    tree.print();
    System.out.println("Inserting 175");
    tree.insert(175);
    tree.print();

    System.out.println("Searching for 75: " );
    
    Node<Integer> nodo= tree.search(75);
    if(nodo== null)
        System.out.println("No se encontró");
        else
        System.out.println("Si se encontró");
    System.out.println("Deleting 100");
    tree.delete(100);

    System.out.println("Inorder traversal after deletion:");
   System.out.println("Tree height "+ tree.getHeight());
//tree.levelOrderVisual(tree.getHeight());

tree.print();
	}
}
