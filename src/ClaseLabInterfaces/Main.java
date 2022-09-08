package ClaseLabInterfaces;

public class Main {

    public static void main(String[] args){
        Viento flauta = new Viento("la do re mi fa sol");
        Cuerda guitarra = new Cuerda("do do re fa");

        flauta.tocar(flauta);
    }



}
