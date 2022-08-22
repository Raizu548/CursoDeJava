package TrabajosPracticos;

public class N6APIMath {

    public static void main(String[] args){
        int a = 4;
        int b = 2;

        // Funciones trigonometricas
        System.out.println("Seno: "+ Math.sin(a));
        System.out.println("Coseno: " + Math.cos(a));
        System.out.println("Tangente: "+ Math.tan(a));
        System.out.println("Arco tangente: "+ Math.atan(a));
        System.out.println("Arco tangente2: " + Math.atan2(a,b));

        // Funcion exponencial y su inversa
        System.out.println("Funcion exponencial: " + Math.exp(a));
        System.out.println("Inversa: "+ Math.log(a));

        // Constante Pi y e
        System.out.println("Pi: " + Math.PI);
        System.out.println("e: "+ Math.E);
    }
}
