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
	
	  // busqueda de un nodo
	  public NodoBinario buscarNodo(T dato) {
		if (dato.equals(this.dato)) {
		  return this;
		} else {
		  if (((Comparable) dato).compareTo(this.dato) > 0) {
			if (this.getNodosHijos().get(1) != null) {
			  return ((NodoBinario) this.getNodosHijos().get(1)).buscarNodo(dato);
			} else {
			  return null;
			}
		  } else {
			if (this.getNodosHijos().get(0) != null) {
			  return ((NodoBinario) this.getNodosHijos().get(0)).buscarNodo(dato);
			} else {
			  return null;
			}
		  }
		}
	  }
	  //funcion que elimina un nodo
	  public void eliminarNodo(T dato) {
		Nodo<T> nodo = buscarNodo(dato);
		if (nodo != null) {
		  nodo.setDato(null);
		}
	  }
}
