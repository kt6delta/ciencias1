
package ArbolRN;

import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Random ran = new Random();
    Arbol Arbolito = new Arbol();
    /*21, 28, 15, 8, 2, 18, 19, 6, 0, 26, 21, 17, 30, 7, 13, 25, 16, 5, 32*/
    for (int i = 0; i < 10; i++) {
        Arbolito.insertar(ran.nextInt(56));
    }
    Arbolito.eliminar(0);
    Arbolito.recorrer(Recorrido.INORDER);
    System.out.println("preorder");
    Arbolito.recorrer(Recorrido.PREORDER);
    System.out.println();
    Arbolito.recorrer(Recorrido.HOJAS);
    System.out.println();
    Arbolito.recorrer(Recorrido.POSTORDER);
    System.out.println();
    System.out.println(Arbolito.buscar(5));
  }
}
