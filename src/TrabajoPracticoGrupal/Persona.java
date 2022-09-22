package TrabajoPracticoGrupal;

public abstract class Persona {
    // Atributos
    public String nombre;
    public String apellido;
    public int legajo;

    // Metodos
    // Le agregamos parametros al metodo de modificarDatos para que quede mejor con la logica implementada
    // Decidimos poner el if para que si es igual a 0 mantenga los valores que tenian
    // Entonces solo cambia los valores que el usuario desea
    public void modificarDatos(String nombre, String apellido, int legajo) {
        if (!nombre.equals("0")) this.nombre = nombre;
        if (!apellido.equals("0")) this.apellido = apellido;
        if (legajo != 0) this.legajo = legajo;
    }
}
