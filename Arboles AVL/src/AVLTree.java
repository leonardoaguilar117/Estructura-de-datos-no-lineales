import java.util.LinkedList;
import java.util.Queue;


public class AVLTree<T extends Comparable<T>> {
	
	private Node<T> root;
	
	public int getHeight(){    
	    return getHeight(root);
	}
	
	
	public int getHeight(Node<T> node) {
		if (node == null) {
			return 0;
	    }
	    	return node.getHeight();
	}	
	
	public int getBalanceFactor(Node<T> node) {
		if (node == null) {
			return 0;
	    }
	    	return getHeight(node.getLeft()) - getHeight(node.getRight());
	}
	
	public Node<T> rightRotate(Node<T> y) {
	    Node<T> x = y.getLeft();
	    Node<T> T2 = x.getRight();
	
	    // Perform rotation
	    x.setRight(y);
	    y.setLeft(T2);

	    // Update heights
	    y.setHeight(Math.max(getHeight(y.getLeft()), getHeight(y.getRight())) + 1);
	    x.setHeight(Math.max(getHeight(x.getLeft()), getHeight(x.getRight())) + 1);
	
	    return x;
	}
	
	public Node<T> leftRotate(Node<T> x) {
	    Node<T> y = x.getRight();
	    Node<T> T2 = y.getLeft();
	
	    // Perform rotation
	    y.setLeft(x);
	    x.setRight(T2);
	
	    // Update heights
	    x.setHeight(Math.max(getHeight(x.getLeft()), getHeight(x.getRight())) + 1);
	    y.setHeight(Math.max(getHeight(y.getLeft()), getHeight(y.getRight())) + 1);
	
	    return y;
	}
	
	public Node<T> insert(Node<T> node, T data) {
	    if (node == null) {
	    	return new Node<>(data);
	    }
	    if (data.compareTo(node.getData()) < 0) {
	    	node.setLeft(insert(node.getLeft(), data));
	    } else if (data.compareTo(node.getData()) > 0) {
	    	node.setRight(insert(node.getRight(), data));
	    } else {
	      // Duplicate data (optional handling)
	    }
	
	    // Update height
	    node.setHeight(Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1);
	
	    // Check balance factor and perform rotations
	    int balance = getBalanceFactor(node);
	    if (balance > 1 && data.compareTo(node.getLeft().getData()) < 0) {
	      return rightRotate(node);
	    } else if (balance > 1 && data.compareTo(node.getLeft().getData()) > 0) {
	      node.setLeft(leftRotate(node.getLeft()));
	      return rightRotate(node);
	    } else if (balance < -1 && data.compareTo(node.getRight().getData()) > 0) {
	      return leftRotate(node);
	    } else if (balance < -1 && data.compareTo(node.getRight().getData()) < 0) {
	      node.setRight(rightRotate(node.getRight()));
	      return leftRotate(node);
	    }
	
	    return node;
	 }
	
	 public void insert(T data) {
		 root = insert(root, data);
	 }
	
	  // Search method
	 public Node<T> search(Node<T> node, T data) {
		 if (node == null) {
			 return null;
		 }
		 if (data.compareTo(node.getData()) == 0) {
			 return node;
		 }else if (data.compareTo(node.getData()) < 0) {
			 return search(node.getLeft(), data);
		 }else{
	      return search(node.getRight(), data);
		 }
	 }
	
	 public Node<T> search(T data) {
		 return search(root, data);
	 }
	
	  // Minimum value node
	 public Node<T> minValueNode(Node<T> node) {
		 Node<T> current = node;
		 while (current.getLeft() != null) {
			 current = current.getLeft();
		  }
		  return current;
	 }
	  // Additional methods for searching, deletion, etc. can be implemented here
	  
	 public Node<T> delete(Node<T> node, T data) {
		 if (node == null) {
			 return node; // Element not found
		 }
	
	    // Search for the node to delete
		 if (data.compareTo(node.getData()) < 0) {
			 node.setLeft(delete(node.getLeft(), data));
		 }else if(data.compareTo(node.getData()) > 0) {
			 node.setRight(delete(node.getRight(), data));
		 }else{
	      // Node with one or zero child
	
	      // Node with only one child or no child
         if ((node.getLeft() == null) || (node.getRight() == null)) {
        	 Node<T> temp = node.getLeft() != null ? node.getLeft() : node.getRight();
	
        	 // Node is a leaf
        	 if (temp == null) {
        		 temp = node;
        		 node = null;
        	 }else{ // Node has one child
        		 node = temp;
        	 }
	     }else{
	        // Node with two children
	        Node<T> temp = minValueNode(node.getRight());
	
	        // Copy the inorder successor's data to the current node
	        node.setData(temp.getData());
	
	        // Delete the inorder successor
	        node.setRight(delete(node.getRight(), temp.getData()));
	      }
	    }
	
	    // If the tree had only one node (root) and it is deleted
	    if (node == null) {
	      return node;
	    }
	
	    // Update height
	    node.setHeight(Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1);
	
	    // Check balance factor and perform rotations after deletion
	    int balance = getBalanceFactor(node);
	    if (balance > 1 && getBalanceFactor(node.getLeft()) >= 0) {
	      return rightRotate(node);
	    } else if (balance > 1 && getBalanceFactor(node.getLeft()) < 0) {
	      node.setLeft(leftRotate(node.getLeft()));
	      return rightRotate(node);
	    } else if (balance < -1 && getBalanceFactor(node.getRight()) <= 0) {
	      return leftRotate(node);
	    } else if (balance < -1 && getBalanceFactor(node.getRight()) > 0) {
	      node.setRight(rightRotate(node.getRight()));
	      return leftRotate(node);
	    }
	
	    return node;
	  }
	
	  public void delete(T data) {
	    root = delete(root, data);
	  }
	
	  // Additional methods for searching, deletion, etc. can be implemented here
	  // In-order traversal
	  
	  public void inOrder(){
	      inOrder(root); 
	  }
	  
	  public void inOrder(Node<T> node) {
	    if (node == null) {
	      return;
	    }
	    inOrder(node.getLeft());
	    System.out.print(node.getData() + " ");
	    inOrder(node.getRight());
	  }
	  
	   public void preOrder(){
	      preOrder(root);
	  }
	
	  // Pre-order traversal
	  public void preOrder(Node<T> node) {
	    if (node == null) {
	      return;
	    }
	
	    System.out.print(node.getData() + " ");
	    preOrder(node.getLeft());
	    preOrder(node.getRight());
	  }
	
	 public void postOrder(){
	      
	      postOrder(root);
	      
	  }
	  // Post-order traversal
	  public void postOrder(Node<T> node) {
	    if (node == null) {
	      return;
	    }
	
	    postOrder(node.getLeft());
	    postOrder(node.getRight());
	    System.out.print(node.getData() + " ");
	  }
	
	
	public void levelOrder() {
	  if (root == null) {
	    return;
	  }
	
	  Queue<Node<T>> queue = new LinkedList<>();
	  queue.add(root);
	  int currentLevel = 1;  // Track current level
	  int nextLevel = 0;      // Track number of nodes in next level
	
	  while (!queue.isEmpty()) {
	    Node<T> current = queue.poll();
	    System.out.print(current.getData() + " ");
	
	    if (current.getLeft() != null) {
	      queue.add(current.getLeft());
	      nextLevel++;
	    }
	    if (current.getRight() != null) {
	      queue.add(current.getRight());
	      nextLevel++;
	    }
	
	    currentLevel--;  // Decrement current level count
	
	    // Print new line when all nodes of current level are processed
	    if (currentLevel == 0) {
	      System.out.println();
	      currentLevel = nextLevel;
	      nextLevel = 0;
	    }
	  }
	}
	
	public void levelOrderVisual(int level) {
	  if (root == null) {
	    return;
	  }
	
	  printLevelVisual(root, level, "");
	
	  System.out.println();  // Extra newline for better formatting
	}
	
	private void printLevelVisual(Node<T> node, int level, String indent) {
	  if (node == null) {
	    return;
	  }
	
	  if (level > 1) {
	    System.out.print(indent + "|---");  // Indent and dashes for children
	  }
	  System.out.println(indent + node.getData());  // Print data with indent
	
	  printLevelVisual(node.getLeft(), level - 1, indent + "  ");  // Recursively call for left child with increased indent
	  printLevelVisual(node.getRight(), level - 1, indent + "  "); // Recursively call for right child with increased indent
	}
	
	public void printTreeGraphical() {
	  if (root == null) {
	    System.out.println("Tree is empty!");
	    return;
	  }
	
	  printTreeGraphicalHelper(root, 0, true);
	}
	
	private void printTreeGraphicalHelper(Node<T> node, int level, boolean isLeftChild) {
	  if (node == null) {
	    return;
	  }
	
	  printTreeGraphicalHelper(node.getRight(), level + 1, false);  // Print right subtree first
	
	  String indent = "";
	  for (int i = 0; i < level; i++) {
	    indent += (i != 0 ? (isLeftChild ? "│   " : "    ") : "");  // Adjust indentation based on left child presence and isLeftChild flag
	  }
	
	  System.out.println(indent + (isLeftChild ? "├─›" : "└─›") + "(" + node.getData() + ")");  // Print node data with indentation and connection symbols
	
	  printTreeGraphicalHelper(node.getLeft(), level + 1, true);   // Print left subtree
	}
	
	
	public void print (){
	    print("", root, false);
	    
	}
	
	
	public void print(String prefix, Node<T> n, boolean isLeft) {
	    if (n != null) {
	        print(prefix + "     ", n.getRight(), false);
	        System.out.println (prefix + ("|-- ") + n.getData());
	        print(prefix + "     ", n.getLeft(), true);
	    }
	}
	
	  
}