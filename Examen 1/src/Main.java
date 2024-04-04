public class Main{
	
	public static void main(String[] args) {
		
		ArbolBin arbol= new ArbolBin();
		ArbolBin arbol1 = new ArbolBin();
		
		arbol.insertar(6);
		arbol.insertar(1);
		arbol.insertar(2);
		arbol.insertar(3);
		arbol.insertar(1);
		arbol.insertar(2);
		arbol.insertar(6);
		arbol.insertar(0);
		
		arbol1.insertar(3);
		arbol1.insertar(5);
		arbol1.insertar(1);
		arbol1.insertar(5);
		arbol1.insertar(1);
		arbol1.insertar(2);
		arbol1.insertar(6);
		arbol1.insertar(0);
		
		
		System.out.println("Arbol original: ");
		arbol.preorden();
		System.out.println("");
		
		System.out.println("Arbol secundario: ");
		arbol1.preorden();
		System.out.println("");
		
		
		
		arbol1.imprimirArbol();
		
		
	
	}
}