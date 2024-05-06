/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

/**
 *
 * @author alarac04
 */
public class Grafica {

 private int matriz[][];
 
 
 public Grafica(int [][] matriz){
     
     this.matriz=matriz;
 }
 
 public Grafica(int num_vertices){
     
     //Inicializa en cero
     this.matriz=new int [num_vertices][num_vertices];
     
 }
 
 public void agregaVertice (int origen, int destino, int costo){
     
     matriz[origen][destino]=costo;
     
     
 }
 
 public int obtenCosto(int origen, int destino){
     
     return matriz[origen][destino];
 
 
 }
 
 public int  getNumVertices(){
     return matriz[0].length;
 }
 
 public int getNumAristas(){
     int cuenta=0;
     for(int i=0; i<matriz[0].length; i++){
         
         for(int j=0; j<matriz[0].length; i++){
             if(matriz[i][j]>0)
                 cuenta=cuenta+1;
                       
             
             
         }
         
     }
     
     return cuenta;
 }
 
 
 
 public String recorreEnAmplitud(int origen){
     String cadena = null;
     //
     
     return cadena;
 }
 
public String recorreEnAnchura(int origen){
    String cadena="";
    
    return cadena;
}


public String Dijisktra (int origen){
    //Una representación en texto de los costos mínimos de origen a los demás
    //Las rutas de codo  mínimo (camino)
    String resultado="";
    
    
    
    return resultado;
}
 
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int [][]matriz_adyacencia = null;
        
        //Función para leer la matriz adesde archivo
        
        Grafica valor = new Grafica(matriz_adyacencia);
        
        System.out.println("Número de vértices: "+valor.getNumVertices()); 
        System.out.println("Número de aristas: "+ valor.getNumAristas());
        
        System.out.println("Recorrido en anchura: "+valor.recorreEnAnchura(0));
        System.out.println("Recorrido en profundidad:"+ valor.recorreEnAmplitud(0));
        
        System.out.println("Dijkstra des del punto 0 a los demás");
        System.out.println(valor.Dijisktra(0));
        
        
        
    }
    
}
