public class Nodo{
	int data;
	Nodo left , right;
	
	public Nodo(int data){
		this.data = data;
		left = right = null;
	}	
	public Nodo(){
		left = right = null;
	}
	
	public void setLeft(Nodo newest){
		this.left = newest;
	}
	public Nodo getLeft() {
		return left;
	}
	public void setRight(Nodo newest){
		this.right = newest;
	}
	public Nodo getRight() {
		return right;
	}
	public void setData(int newData) {
		this.data = newData;
	}
	public int getData() {
		return data;
	}
	
}










