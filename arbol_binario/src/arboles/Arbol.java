
package arboles;

//obtener la raiz del nodo
/**
 *
 * @author KIKE
 */
public abstract class Arbol <T>{
    protected Nodo<T> raiz = null;
    
    public abstract void agregarNodo(T dato);
    
    public abstract void agregarNodo(Nodo<T> nodo);
    
    public abstract void eliminarNodo(Nodo<T> nodo);

    /**
     * @return the raiz
     */
    public Nodo<T> getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(Nodo<T> raiz) {
        this.raiz = raiz;
    }
}
