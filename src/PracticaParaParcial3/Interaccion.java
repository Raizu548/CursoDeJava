package PracticaParaParcial3;

public class Interaccion {

    public static void main(String[] args){
        Personal personal = new Personal();

        Empleado empleado1 = new Empleado("Luis","Ferreyra", 1, 20);
        Empleado empleado2 = new Empleado("a","a", 2, 20);

        personal.addPersona(empleado1);
        personal.addPersona(empleado2);

        personal.listarPersonas();

        personal.eliminarPersona(2);

        personal.listarPersonas();

    }
}
