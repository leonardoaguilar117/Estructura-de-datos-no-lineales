/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monticulo;

/**
 *
 * @author belay
 */
public class Monticulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Necesito arreglar este código");

        int[] datos = {3, 2, 1, 5, 6, 4,63};
        HeapSort.ordenar(datos);

        System.out.println("Arreglo ordenado:");
        for (int dato : datos) {
            System.out.print(dato + " ");
        }
    }
    
}
