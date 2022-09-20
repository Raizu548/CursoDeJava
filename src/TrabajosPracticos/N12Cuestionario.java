package TrabajosPracticos;

public class N12Cuestionario {

    public static void main(String[] args){
        Clase1 obj = new Clase2();
        obj.metodo1();
        Animal animal = new Animal("perro");
        System.out.println(animal.getNombre());
    }
}

class Clase1{

    public void metodo1(){
        System.out.println(datos);
    }

    String datos = "datos";
}

class Clase2 extends Clase1{

    public void metodo1(){
        super.metodo1();
        System.out.println(datos);
    }

    String datos = "muchos datos";
}

class Animal{
    private String nombre;

    public Animal(String nombre){
        nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Perro extends Animal{

    public Perro(String nombre){
        super(nombre);
    }
}