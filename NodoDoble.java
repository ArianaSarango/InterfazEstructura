public class NodoDoble extends Nodo {
    private NodoDoble siguiente;
    private NodoDoble anterior;

    @Override
    public int obtenerDato() {
        return dato;
    }

    @Override
    public void establecerDato(int dato) {
        this.dato = dato;
    }
}