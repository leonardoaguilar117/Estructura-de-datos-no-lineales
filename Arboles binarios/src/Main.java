public class Main{
	
	public static void main(String[] args) {
		
		ArbolBin arbol= new ArbolBin();
		ArbolBin arbol1 = new ArbolBin();
		
		arbol.insertar(1);
		arbol.insertar(2);
		arbol.insertar(3);
		arbol.insertar(4);
		
		arbol1.insertar(2);
		arbol1.insertar(3);
		arbol1.insertar(3);
		arbol1.insertar(4);
		
		System.out.println("Arbol original: ");
		arbol.preorden();
		System.out.println("");
		
		System.out.println("Arbol secundario: ");
		arbol1.preorden();
		System.out.println("");
		
		
		
		if(arbol.sonEquivalentes(arbol1) == true){
			System.out.print("Son iguales");
		}else {
			System.out.print("Son diferentes");
		}
		
		
	
	}
}