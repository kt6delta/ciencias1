package punt1;
import punt1.Data;
public class OrganizarNum {
  public void crear(int num_dat, int caso) {
    //matriz con datos
    int datos[];
    datos = new int[num_dat];
    //llenar matriz
    for (int i = 0; i < num_dat; i++) {
      datos[i] = (int) (Math.random() * 100000) + 1; //0-100.000
      System.out.print(datos[i] + ", ");
    }
    System.out.println("");
    int conta = 0;
    long time_i = System.nanoTime(); //tiempo inicial

    switch (caso) { //en caso que en el switch sea 1 ascendente
      case (1):
        for (int i = 0; i < num_dat - 1; i++) {
          for (int j = i + 1; j < num_dat; j++) {
            if (datos[i] > datos[j]) {
              int num1 = datos[i];
              datos[i] = datos[j];
              datos[j] = num1;
              conta++;
            }
          }
        }
      case (2): //en caso que el switch sea 2 descendente
        for (int i = 0; i < num_dat - 1; i++) {
          for (int j = i + 1; j < num_dat; j++) {
            if (datos[i] < datos[j]) {
              int num1 = datos[i];
              datos[i] = datos[j];
              datos[j] = num1;
              conta++;
            }
          }
        }
    }
    long double_f = (System.nanoTime() - time_i);
    //imprime
    System.out.println("-----------------QUEDA-----------------");
    for (int l = 0; l < num_dat; l++) {
      System.out.print(datos[l] + ", ");
    }
    System.out.println("");
    System.out.println("se hicieron: " + conta + " intercambios");
    System.out.println("tiempo de ejecucion: " + double_f+" nano segundos");
  }
}
