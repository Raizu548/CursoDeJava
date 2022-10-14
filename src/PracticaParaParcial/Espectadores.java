package PracticaParaParcial;

public class Espectadores extends Persona {
    // Atributos
    private char fila;
    private int silla;

    // Constructor
    public Espectadores(String nombre, double dni, char fila, int silla) {
        super(nombre, dni);
        this.fila = fila;
        this.silla = silla;
    }

    // Getter and Setters
    public void setCambiarAsiento(char fila, int silla){
        this.silla = silla;
        this.fila = fila;
    }

    public String getButaca(){
        return fila + "" +silla;
    }

    // Metodos del padre
    @Override
    public String getNameClase() {
        return "Espectadores";
    }

    @Override
    public String toString() {
        return "Espectadores{" +
                "fila=" + fila +
                ", silla=" + silla +
                ", nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }
}
