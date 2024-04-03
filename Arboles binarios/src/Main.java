public class Main
{
	public static void main(String[] args) {
		
		ArbolBin arbol= new ArbolBin();
		arbol.insertar(1);
		arbol.insertar(2);
		arbol.insertar(3);
		arbol.insertar(4);
		//arbol.insertar(5);
		//arbol.insertar(6);
		//arbol.insertar(7);
		arbol.preorden();
		System.out.println("");
		
		arbol.inorden();
		System.out.println("");
		
		arbol.posorden();
		
		System.out.println(arbol.buscar(3));
	
	}
}