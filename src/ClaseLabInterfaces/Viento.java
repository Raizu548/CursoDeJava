package ClaseLabInterfaces;

public class Viento extends Instrumento implements Musica, Partitura {

    public Viento(String notas){
        this.notas = notas;
    }

    @Override
    public void tocar(Instrumento instrumento) {
        System.out.println(leer());
    }

    @Override
    public String leer() {
        return notas;
    }
}
