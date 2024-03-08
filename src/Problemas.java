public class Problemas {
	
	public void primero(int a, int b) {
		if(a > b){
			System.out.print(a+" es mayor que "+b);
		}else if(a == b){
			System.out.print(a+" es igual que "+b);
		}else if(a < b){
			System.out.print(a+" es menor que "+b);
		}
	}
	
	public void numeros() {
		for(int i=0; i<=100; i++) {
			System.out.println(i);
		}
	}
	
	public String invierte(String cadena) {
		String cad = "";
		for(int i = cadena.length()-1; i>=0; i--) {
			cad += cadena.charAt(i);
		}
		return cad;
	}
	
	public int[] sort(int array[]){
		int nums[];
		int aux;
		for(int i=0; i<array.length-1;i++){
			for(int j=0; j<array.length-i-1; j++) {
				if(array[j] > array[j+1]) {
					aux = array[j+1];
					array[j+1] = array[j];
					array[j] = aux;
				}
			}
		}
		return array;
	}
	
	
}
