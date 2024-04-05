public class ArbolBin{
    private Nodo raiz;
    private int num_nodos;
    
    public ArbolBin(){
        num_nodos=0;
        raiz=null;
    }
    
    public ArbolBin(Nodo r){
        
        raiz=r;
    }
    
    
    public void insertar(int dato){
        Nodo nuevo = new Nodo(dato);
        insertaRecursivo(raiz,nuevo);
        
    }
    
    public void insertaRecursivo(Nodo nodo_actual, Nodo nuevo_nodo){
     
        //El árbol está vacío
        if (raiz == null){
            raiz=nuevo_nodo;
        }
        
        //Si  ya tenemos raíz
        else{
            if (num_nodos % 2 == 0) {
            	if (nodo_actual.getIzq() == null) {
            		nodo_actual.setIzq(nuevo_nodo);
            		num_nodos++;
            		return;
            	}else{
            		insertaRecursivo(nodo_actual.getIzq(),nuevo_nodo);
            	}
            }	
            else{
            	if (nodo_actual.getDer() == null) {
            		nodo_actual.setDer(nuevo_nodo);
            		num_nodos++;
            		return;
            	}else {
            		insertaRecursivo(nodo_actual.getDer(),nuevo_nodo);
            	}
            }        
        }
    }
    
    public void preorden(){
        preorden_recursivo(raiz);
    }
    
    public void preorden_recursivo(Nodo nodo_actual){
        
        //Mientras no sea nodo terminal
        if(nodo_actual!= null){
            System.out.print(nodo_actual.getDato()+" ");
            preorden_recursivo(nodo_actual.getIzq());
            preorden_recursivo(nodo_actual.getDer());
        }
    }
    
    
    public void inorden(){
        inorden_recursivo(raiz);
    }
    
    public void inorden_recursivo(Nodo nodo_actual){
        //Mientras no sea nodo terminal
        if(nodo_actual!= null){
            inorden_recursivo(nodo_actual.getIzq());
            System.out.print(nodo_actual.getDato()+" ");
            inorden_recursivo(nodo_actual.getDer()); 
        }  
    }
    
     
    
    
    public void posorden(){
        posorden_recursivo(raiz);
    }
    
    public void posorden_recursivo(Nodo nodo_actual){
        //Mientras no sea nodo terminal
        if(nodo_actual!= null){
            posorden_recursivo(nodo_actual.getIzq());
            posorden_recursivo(nodo_actual.getDer());
            System.out.print(nodo_actual.getDato()+" ");
        }
        
        
    }
    
    public boolean buscar (int dato){
        return buscar_recursivo(raiz,dato);  
    }
    
    
    public boolean buscar_recursivo(Nodo nodo, int dato){
        //LLegue a una hoja del arbol, no lo encontré en el camino
        if(nodo== null){
            return false;
        }
        
        if(nodo!=null && nodo.getDato()== dato){
            return true;
        }
        
        
        return buscar_recursivo(nodo.getIzq(),dato) ||  buscar_recursivo(nodo.getDer(),dato);   
    }
    
    
    public boolean sonEquivalentes(ArbolBin otroArbol) {
        return sonEquivalentesRecursivo(this.raiz, otroArbol.raiz);
    }

	private boolean sonEquivalentesRecursivo(Nodo nodo1, Nodo nodo2) {
	        // Si ambos nodos son nulos, son equivalentes
	        if (nodo1 == null && nodo2 == null) {
	            return true;
	        }
	        // Si solo uno de los nodos es nulo, no son equivalentes
	        if (nodo1 == null || nodo2 == null) {
	            return false;
	        }
	        // Verificar si los datos de los nodos son diferentes
	        if (nodo1.getDato() != nodo2.getDato()) {
	            return false;
	        }
	        // Verificar recursivamente la estructura y los datos de los nodos izquierdos y derechos
	        return sonEquivalentesRecursivo(nodo1.getIzq(), nodo2.getIzq()) && sonEquivalentesRecursivo(nodo1.getDer(), nodo2.getDer());
	 }
	
}
    
    
    
    
    
    
    
    
    
