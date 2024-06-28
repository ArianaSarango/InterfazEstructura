public abstract class Nodo {
    protected int dato;
    protected int valor;
    protected Color color;

    public abstract int obtenerDato();
    public abstract void establecerDato(int dato);
}