package ClaseLabInterfaces;

public class Cuerda extends Instrumento implements Musica, Partitura {

    public Cuerda(String notas){
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
