/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monticulo;

/**
 *
 * @author belay
 */
class HeapSort {
    public static void ordenar(int[] datos) {
        MonticuloMaximo monticulo = new MonticuloMaximo(datos);

        while (!monticulo.estaVacio()) {
            int maximo = monticulo.eliminarMaximo();
            datos[monticulo.tamanio] = maximo;
        }
    }    
}
