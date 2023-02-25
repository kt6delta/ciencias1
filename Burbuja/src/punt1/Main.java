/*catalina preciado
 * organizar numeros de ascendente y descente
 * mayo 9 del 2019
 * version 1.0
 */
package punt1;

import java.util.Scanner;

public class Main {

  private static Scanner sc;

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    OrganizarNum decir = new OrganizarNum();
    short repit;
    do {
      //tamaño del arreiglo
      System.out.print("numero de datos a organizar: ");
      int num_dat;
      //verificar dato
      do {
        num_dat = sc.nextInt();
        if (num_dat <= 0) {
          System.out.println("ingresa valor valido: ");
        }
      } while (num_dat <= 0);
      //decidir si descendente o ascendente
      System.out.println("1). organizar de forma ascendente:  ");
      System.out.println("2). organizar de forma descendente:  ");
      short menu;
      do {
        menu = sc.nextShort();
        //verificar dato
        if (menu != 1 && menu != 2) {
          System.out.println("ingresa valor valido: ");
        }
      } while (menu != 1 && menu != 2);
      switch (menu) {
        case 1:
          //organiza
          decir.crear(num_dat, menu);
          break;
        case 2:
          // reorganiza
          decir.crear(num_dat, menu);
          break;
      }
      System.out.println(
        "\npara detenerse 0, o para continuar cualquier numero"
      );
      repit = sc.nextShort();
    } while (repit != 0);
  }
}
