package Ejercicio4;

import javax.swing.*;
import java.util.Scanner;

public class IngresarNumeros {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        // Suma de numero y mostrarlo por una ventana grafica a traves de if anidados
        // JOptionPane nos muestra el mensaje en una ventana emergente.
        int num1, num2, resultado;

        System.out.println("Ingrese un numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese un segundo numero para sumar: ");
        num2 = sc.nextInt();

        resultado = num1 + num2;

        if (resultado == 100) JOptionPane.showMessageDialog(null, "Resultado es 100");
        else if (resultado > 100) JOptionPane.showMessageDialog(null, "Resultado mayor a 100 porque es: "+ resultado);
        else if (resultado <= -0) JOptionPane.showMessageDialog(null, "El resultado es negativo");
        */
        int numeros[] = new int[20];
        int i = 0;
        String dato ="";

        System.out.println("Ingrese un numero o F para salir");
        while (!dato.equals("f")){
            dato = sc.nextLine();
            if (!dato.equals("f")) {
                numeros[i] = Integer.parseInt(dato);
                i++;
            }
        }

        int resultado2 = 0;
        for (int j = 0; j < i; j++){
            resultado2 += numeros[j];
            System.out.print(numeros[j] + " + ");
        }
        System.out.println("resultado de la suma: "+ resultado2);


    }
}
