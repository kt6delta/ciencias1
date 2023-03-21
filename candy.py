"""El pequeño Charlie es un niño simpático adicto a los dulces. Incluso es suscriptor de la revista All Candies y
fue seleccionado para participar en el Concurso Internacional de Recolección de Dulces.
En este concurso se dispone un número aleatorio de cajas que contienen dulces en M filas con N columnas
cada uno (por lo tanto, hay un total de M × N cajas). Cada caja tiene un número que indica cuántos dulces contiene.
contiene.
El concursante puede elegir una caja (cualquiera) y obtener todos los dulces que contiene. Pero hay una trampa
(siempre hay un problema): al elegir una casilla, todas las casillas de las filas inmediatamente superior e
inmediatamente debajo se vacían, así como la casilla de la izquierda y la casilla de la derecha del elegido
caja. El concursante continúa eligiendo una caja hasta que no quedan dulces.
La siguiente figura ilustra esto, paso a paso. Cada celda representa un cuadro y el número de
dulces que contiene. En cada paso, el cuadro elegido se encierra en un círculo y las celdas sombreadas representan los cuadros
que se vaciará. Después de ocho pasos, el juego termina y Charlie eligió 10+9+8+3+7+6+10+1 =
54 caramelos.

Para valores pequeños de M y N , Charlie puede encontrar fácilmente el número máximo de dulces que puede recoger,
pero cuando los números son realmente grandes se pierde por completo. ¿Puedes ayudar a Charlie a maximizar los dulces que puede recoger?

Input
La entrada contiene varios casos de prueba. La primera línea de un caso de prueba contiene dos enteros positivos M y N
(1 ≤ M ×N ≤ 10^5 ), separados por un solo espacio, indicando el número de filas y columnas respectivamente.
Cada una de las M líneas siguientes contiene N números enteros separados por espacios simples, cada uno de los cuales representa el
número inicial de caramelos en la caja correspondiente. Cada caja tendrá inicialmente al menos 1 y como máximo
103 caramelos.
El final de la entrada se indica mediante una línea que contiene dos ceros separados por un solo espacio.

Output
Para cada caso de prueba en la entrada, su programa debe imprimir una sola línea, que contenga un solo valor, el
número entero que indica el número máximo de dulces que Charlie puede recoger.

Sample Input
5 5
1 8 2 1 9
1 7 3 5 2
1 2 10 3 10
8 4 7 9 1
7 1 3 1 6

4 4
10 1 1 10
1 1 1 1
1 1 1 1
10 1 1 10

2 4
9 10 2 7
5 1 1 5
0 0

Sample Output
54
40
17
"""
# resolver con divide y venceras
def maxCandies(m, n, candies):
    if m == 1:
        return sum(candies[0])
    elif n == 1:
        return sum(candies[i][0] for i in range(m))
    else:
        return max(
            maxCandies(m-1, n, candies[:m-1]) 
            +max(candies[m-1][i] for i in range(n)),maxCandies(m, n-1, candies)
            +max(candies[i][n-1] for i in range(m)),maxCandies(m-1, n-1, candies[:m-1]) 
            +max(candies[m-1][i] for i in range(n-1))
        )


if __name__ == '__main__':
    result = []
    stop = False
    m = 1
    n = 1
    while stop == False:
        tamaño = input()
        m, n = tamaño.split(" ")
        n = int(n)
        m = int(m)
        if m == 0 and n == 0:
            stop = True
        else:
            candies = []
            # el contenido de las cajas son los arreiglos
            for i in range(m):
                candies.append(input().split(" "))
            # convierte en numeros enteros
            for i in range(m):
                for j in range(n):
                    candies[i][j] = int(candies[i][j])
            result.append(maxCandies(m, n, candies))
    for a in result:
        print(a)
