import java.util.ArrayList;
import java.util.List;

class NodoABB {
    private int valor;
    private List<Integer> valores;
    private NodoABB izq;
    private NodoABB der;

    public NodoABB(int valor) {
        this.valor = valor;
        this.valores = new ArrayList<>();
        this.valores.add(valor);
        izq = null;
        der = null;
    }

    public int getValor() {
        return valor;
    }

    public List<Integer> getValores() {
        return valores;
    }

    public NodoABB getIzq() {
        return izq;
    }

    public void setIzq(NodoABB izq) {
        this.izq = izq;
    }

    public NodoABB getDer() {
        return der;
    }

    public void setDer(NodoABB der) {
        this.der = der;
    }

    public void agregarValor(int valor) {
        valores.add(valor);
    }
}