package TrabajosPracticos;

import java.util.Random;
import java.util.Scanner;

public class TPN10AdivinarNumero {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Random randomGenerador = new Random();
        int numero;
        int intentos = 0;
        int numeroGenerado = randomGenerador.nextInt(100) +1;

        System.out.println("Trate de adivinar el numero que se genero aleatoriamentre entre el 1 y 100");

        do {
            intentos++;
            System.out.println("Ingrese el numero: ");
            numero = entrada.nextInt();

            if (numero < numeroGenerado) System.out.println("El numero es mayor");
            else if (numero > numeroGenerado) System.out.println("El numero es menor");

        } while (numeroGenerado != numero);

        System.out.println("Correcto!!");
        System.out.println("Acertar el numero te llevo "+ intentos + " intentos");
    }
}
