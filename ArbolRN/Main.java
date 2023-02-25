package ArbolRN;

import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Random random = new Random();
    Arbol Arbolito = new Arbol();
    int datos[]={21, 28, 15, 8, 2, 18, 19, 6, 0, 26, 21, 17, 30, 7, 13, 25, 16, 5, 32};
    for (int i = 0; i < datos.length; i++) {
      Arbolito.insertar(datos[i]);
      //Arbolito.insertar(random.nextInt(56));
    }
    //Arbolito.eliminar(0);
    Arbolito.recorrer(Recorrido.POSTORDER);//Left, Right, Nodo
    System.out.println();
    Arbolito.recorrer(Recorrido.INORDER); //Left, Nodo, Right
    System.out.println();
    Arbolito.recorrer(Recorrido.PREORDER);//Nodo, Left,Right
    System.out.println();
    Arbolito.recorrer(Recorrido.HOJAS);
    System.out.println();
    System.out.println(Arbolito.buscar(5));
  }
}
