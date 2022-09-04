package ClaseLabAbstracta;

public class Circulo extends Geometria {
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public double perimetro() {
        return Math.PI * 2 * radio;
    }
}
