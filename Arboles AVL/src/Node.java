public  class Node<T> {
  private T data;
  private Node<T> left;
  private Node<T> right;
  private int height;

  public Node(T data) {
    this.data = data;
    this.height = 1;
  }

  // Getters
  public T getData() {
    return data;
  }

  public Node<T> getLeft() {
    return left;
  }

  public Node<T> getRight() {
    return right;
  }

  public int getHeight() {
    return height;
  }

  // Setters
  public void setData(T data) {
    this.data = data;
  }

  public void setLeft(Node<T> left) {
    this.left = left;
  }

  public void setRight(Node<T> right) {
    this.right = right;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public String toString() {
    return "Node{" +
        "data=" + data +
        ", left=" + (left != null ? left.data : "null") +
        ", right=" + (right != null ? right.data : "null") +
        ", height=" + height +
        '}';
  }
}