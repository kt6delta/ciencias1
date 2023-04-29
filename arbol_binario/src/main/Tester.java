package main;

import arboles.Nodo;
//muestra el arbol
import arboles.ordenamiento.NodoOrdenamientoB;

public class Tester {

  //0 izquierda 1 derecha
  public static void main(String[] args) {
    // arbol de edificio (se organiza en base a los pisos)
    NodoOrdenamientoB<Edificio> a = new NodoOrdenamientoB<Edificio>(
      new Edificio(10, 50.5, 1) //agregar edificio
    );
    NodoOrdenamientoB<Edificio> b = new NodoOrdenamientoB<Edificio>(
      new Edificio(15, 50.5, 1)
    );
    NodoOrdenamientoB<Edificio> c = new NodoOrdenamientoB<Edificio>(
      new Edificio(13, 50.5, 1)
    );
    a.agregarNodo(b); //defino a como raiz
    a.agregarNodo(c);
    //a.ArbolInfijo();
    //a.ArbolPosfijo();
   // a.ArbolbuscarNodo(pisos:10, area:50.5, localidad:1); //busca nodo

    //arbol de enteros
    NodoOrdenamientoB<Integer> n1 = new NodoOrdenamientoB<>(80); //agrega nodo
    n1.agregarNodo(new NodoOrdenamientoB<>(20));
    n1.agregarNodo(new NodoOrdenamientoB<>(150));
    n1.agregarNodo(new NodoOrdenamientoB<>(120));
    n1.agregarNodo(new NodoOrdenamientoB<>(130));

    
    n1.recorridoPosfijo();
    if (n1.buscarNodo(120) != null) {
      System.out.println("Encontrado");
    } else {
      System.out.println("No encontrado");
    }

    n1.eliminarNodo(120);
    n1.recorridoInfijo();
  }
}
