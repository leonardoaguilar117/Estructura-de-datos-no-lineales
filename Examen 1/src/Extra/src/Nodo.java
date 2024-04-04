public class Nodo{
    
    private int dato;
    private Nodo izq;
    private Nodo der;
    
    //Constructor
    public Nodo (int dato2){
        dato=dato2;
        izq=null;
        der=null;
        
    }
    
    //Constructor 2
   public Nodo (int dato, Nodo izq, Nodo der){
        this.dato=dato;
        this.izq=izq;
        this.der=der;
        
    }
    
    //Getter 
    public int getDato(){
        return dato;
    }
    
    //Setter dato (escritura)
    
    public void setDato(int dato2){
        dato=dato2;
        
    }
    
    public Nodo getIzq(){
        return izq;
    }
    
    public void setIzq(Nodo i){
        izq=i;
    }
    
    public Nodo getDer(){
        return der;
    }
    
    public void setDer(Nodo i){    
        der=i;
    }
    
    
    
}