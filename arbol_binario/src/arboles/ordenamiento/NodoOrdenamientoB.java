package arboles.ordenamiento;

import arboles.Nodo;
import arboles.binarios.NodoBinario;
import main.Edificio;

public class NodoOrdenamientoB<T extends Comparable> extends NodoBinario {

  //metodo agregar nodo, aqui es donde se deben agregar los otros metodos (buscar, eliminar, mostrar)
  public NodoOrdenamientoB(T dato) {
    super(dato);
  }

  @Override
  public void agregarNodo(Nodo nodo) {
    if (((Comparable) nodo.getDato()).compareTo(this.dato) > 0) {
      if (this.getNodosHijos().get(1) != null) {
        ((NodoOrdenamientoB) this.getNodosHijos().get(1)).agregarNodo(nodo); //asigna al nodo hijos
      } else {
        nodo.setPadre(this);
        this.getNodosHijos().set(1, nodo); //se asigna nodo padre
      }
    } else {
      if (this.getNodosHijos().get(0) != null) {
        ((NodoOrdenamientoB) this.getNodosHijos().get(0)).agregarNodo(nodo);
      } else {
        nodo.setPadre(this);
        this.getNodosHijos().set(0, nodo);
      }
    }
  }

  //funcion que muestra el arbol en notacion prefija y posfija
  public void ArbolInfijo() {
    if (getNodosHijos().get(0) != null) {
      ((NodoOrdenamientoB) getNodosHijos().get(0)).ArbolInfijo();
    }
    System.out.println(
      "Pisos: " +
      (((Edificio) this.getDato())).getPisos() +
      ", Area: " +
      (((Edificio) this.getDato())).getArea() +
      ", Localidad: " +
      (((Edificio) this.getDato())).getLocalidad()
    );

    if (getNodosHijos().get(1) != null) {
      ((NodoOrdenamientoB) getNodosHijos().get(1)).ArbolInfijo();
    }
  }

  public void ArbolPosfijo() {
    if (getNodosHijos().get(0) != null) {
      ((NodoOrdenamientoB) getNodosHijos().get(0)).ArbolInfijo();
    }
    if (getNodosHijos().get(1) != null) {
      ((NodoOrdenamientoB) getNodosHijos().get(1)).ArbolInfijo();
    }
	System.out.println(
		"Pisos: " +
		(((Edificio) this.getDato())).getPisos() +
		", Area: " +
		(((Edificio) this.getDato())).getArea() +
		", Localidad: " +
		(((Edificio) this.getDato())).getLocalidad()
	  );
  }

  //funcion que busca un nodo
  public Nodo<T> ArbolbuscarNodo(T dato) {
    if (dato.compareTo(this.dato) == 0) {
      return this;
    } else if (dato.compareTo(this.dato) > 0) {
      if (this.getNodosHijos().get(1) != null) {
        return (
          (NodoOrdenamientoB) this.getNodosHijos().get(1)
        ).ArbolbuscarNodo(dato);
      } else {
        return null;
      }
    } else {
      if (this.getNodosHijos().get(0) != null) {
        return (
          (NodoOrdenamientoB) this.getNodosHijos().get(0)
        ).ArbolbuscarNodo(dato);
      } else {
        return null;
      }
    }
  }

  //funcion que elimina un nodo
  public void eliminarNodo(T dato) {
    Nodo<T> nodo = ArbolbuscarNodo(dato);
    if (nodo != null) {
      nodo.setDato(null);
    }
  }
}
