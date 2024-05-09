import java.util.*;
public class FuncionHash {

    public static int generarHash(String cadena) {
        int valorHash = 0;

        for (char caracter : cadena.toCharArray()) {
            valorHash = (valorHash * 31) + (int) caracter;
        }

        return valorHash;
    }
   
    public static void main(String[] args) {
        // Generar un conjunto de cadenas de entrada
        List<String> cadenas = generarCadenas();

        // Calcular la distribución de valores hash
        Map<Integer, Integer> distribucionHash = new HashMap<>();
        for (String cadena : cadenas) {
            int valorHash = FuncionHash.generarHash(cadena);
            distribucionHash.put(valorHash, distribucionHash.getOrDefault(valorHash, 0) + 1);
        }

        // Analizar la distribución de valores hash
        System.out.println("Distribución de valores hash:");
        for (Map.Entry<Integer, Integer> entrada : distribucionHash.entrySet()) {
            System.out.println("Valor hash: " + entrada.getKey() + ", Frecuencia: " + entrada.getValue());
        }
    }

    private static List<String> generarCadenas() {
        List<String> cadenas = new ArrayList<>();

        
        for (int i = 0; i < 100; i++) {
            int longitud = (int) (Math.random() * 10) + 1; // Longitud aleatoria entre 1 y 10
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < longitud; j++) {
                char caracter = (char) ('a' + Math.random() * 26); // Caracter aleatorio entre 'a' y 'z'
                sb.append(caracter);
            }
            cadenas.add(sb.toString());
        }

        return cadenas;
    }

}
