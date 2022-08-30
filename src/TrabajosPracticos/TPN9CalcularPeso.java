package TrabajosPracticos;

import java.util.Scanner;

public class TPN9CalcularPeso {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double altura;
        char genero;

        System.out.println("Este programa permite calcular su peso ideal.");
        System.out.println("Ingrese su altura en cm");
        altura = entrada.nextDouble();

        do {
            System.out.println("ingrese su genero\nm - Mujer\nh - Hombre");
            genero = entrada.next().charAt(0);
        } while (genero != 'm' && genero != 'h');

        if (genero == 'm') System.out.println("Su peso ideal es: " + (altura - 120));
        else System.out.println("Su peso ideal es: " + (altura - 110));

    }
}
