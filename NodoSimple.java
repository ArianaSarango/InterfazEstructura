public class NodoSimple extends Nodo {
    private NodoSimple siguiente;

    @Override
    public int obtenerDato() {
        return dato;
    }

    @Override
    public void establecerDato(int dato) {
        this.dato = dato;
    }
}