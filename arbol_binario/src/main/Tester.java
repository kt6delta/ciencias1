package main;
//muestra el arbol
import arboles.ordenamiento.NodoOrdenamientoB;

public class Tester {

  //0 izquierda 1 derecha
  public static void main(String[] args) {
    // arbol de edificio (se organiza en base a los pisos)
    /*
    Edificio e1=new Edificio(10, 50.5, 1);
    Edificio e2= new Edificio(15, 50.5, 1);
    Edificio e3= new Edificio(13, 50.5, 1);
    Edificio e4= new Edificio(14, 50.5, 1);
    NodoOrdenamientoB<Edificio> a = new NodoOrdenamientoB<Edificio>(e1);
    NodoOrdenamientoB<Edificio> b = new NodoOrdenamientoB<Edificio>(e2);
    NodoOrdenamientoB<Edificio> c = new NodoOrdenamientoB<Edificio>(e3);
    a.agregarNodo(b); //defino a como raiz
    a.agregarNodo(c);

    a.ArbolInfijo();
    if (a.buscarNodo(e2) != null) {//probar con e4
      System.out.println("Encontrado");
    } else {
      System.out.println("No encontrado");
    }
    a.eliminarNodo(e1);
    a.ArbolPosfijo();
*/
///*
    //arbol de enteros
    NodoOrdenamientoB<Integer> n1 = new NodoOrdenamientoB<>(80); //agrega nodo
    n1.agregarNodo(new NodoOrdenamientoB<>(20));
    n1.agregarNodo(new NodoOrdenamientoB<>(150));
    n1.agregarNodo(new NodoOrdenamientoB<>(120));
    n1.agregarNodo(new NodoOrdenamientoB<>(130));

    n1.recorridoInfijo();
   
    if (n1.buscarNodo(120) != null) {
      System.out.println("Encontrado");
    } else {
      System.out.println("No encontrado");
    }

    n1.eliminarNodo(120);
    n1.recorridoPosfijo();
   // */
  }
}
