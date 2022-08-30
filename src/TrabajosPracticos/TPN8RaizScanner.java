package TrabajosPracticos;

import java.util.Scanner;

public class TPN8RaizScanner {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero para calcular su raiz cuadrada");
        numero = entrada.nextInt();

        System.out.println("La raiz cuadrada de "+ numero + " es = "+ Math.sqrt(numero));
    }
}
