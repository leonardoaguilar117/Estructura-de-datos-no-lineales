
public class Main {
	public static void main(String [] args) {
		ArbolBin arbolBinario = new ArbolBin();
		
		int[] valores = {10, 5, 15, 2, 7, 20, -1, -1, -1, 6, 9};
		arbolBinario.insertar(valores);
		
		
		arbolBinario.imprimirCamino(7);
	}
}


