package arboles.binarios;

import arboles.Nodo;
//carga los nodos hijos y padre
public abstract class NodoBinario <T> extends Nodo {
	
	public NodoBinario(T dato) {
		super(dato);
		this.nodosHijos.add(null);
		this.nodosHijos.add(null);
	}
	
	public NodoBinario(T dato, Nodo<T> padre) {
		super(dato, padre);
		this.nodosHijos.add(null);
		this.nodosHijos.add(null);
	} 

	//aqui se agregan los metodos buscar, eliminar, mostrar para cuando el dato solo son numeros
	public void recorridoInfijo() {
		if (getNodosHijos().get(0) != null) {
		  ((NodoBinario) getNodosHijos().get(0)).recorridoInfijo();
		}
		System.out.println(this.toString());
		if (getNodosHijos().get(1) != null) {
		  ((NodoBinario) getNodosHijos().get(1)).recorridoInfijo();
		}
	  }
	  
	  @Override
	  public String toString() {
		if (dato == null) {
		return "borrado";
		}
		else{
			return dato.toString();
		}
	  }
	
	  public void recorridoPosfijo() {
		if (getNodosHijos().get(0) != null) {
		  ((NodoBinario) getNodosHijos().get(0)).recorridoInfijo();
		}
		if (getNodosHijos().get(1) != null) {
		  ((NodoBinario) getNodosHijos().get(1)).recorridoInfijo();
		}
			System.out.println(this.toString());
	  } 
	
}
