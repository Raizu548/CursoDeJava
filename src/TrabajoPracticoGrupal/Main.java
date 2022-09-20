package TrabajoPracticoGrupal;


public class Main {

    public static void main(String[] args){

        Profesor profesor = new Profesor("Facundo", "Ufer", 2, 2);
        Profesor profesor2 = new Profesor("Facundo", "Matoff", 4, 2);
        Materia materia = new Materia("Laboratorio2",profesor);

        materia.agregarEstudiante(new Estudiante("Luis","Ferreyra",1));
        materia.agregarEstudiante(new Estudiante("Facu","Ferro",3));

        System.out.println(materia.verCantidad());
        System.out.println(materia.listarContenido());
        materia.eliminarEstudiante(3);
        materia.modificarTitular(profesor2);

        System.out.println(materia.listarContenido());
        System.out.println(materia.verCantidad());
    }

}
