package ClaseLabAbstracta;

public class Main {

    public static void main(String[] args){

        Circulo circulo = new Circulo(2);
        Triangulo triangulo = new Triangulo(2,3);

        System.out.println("Circulo - Area: " + circulo.area() + " - Perimetro: " + circulo.perimetro());
        System.out.println("Triangulo - Area: "+ triangulo.area() + " - Perimetro: " + triangulo.perimetro());
    }
}
