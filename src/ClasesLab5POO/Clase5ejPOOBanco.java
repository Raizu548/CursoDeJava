package ClasesLab5POO;

import java.util.Arrays;

public class Clase5ejPOOBanco {

    public static void main(String[] args){
        Cliente clientes[] = {
                new Cliente(1,"Pedro",1000)
        };
    }

}

class Banco{
    Cliente[] coleccionClientes;

    public Banco(Cliente coleccionClientes []){
        this.coleccionClientes = coleccionClientes;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "coleccionClientes=" + Arrays.toString(coleccionClientes) +
                '}';
    }
}

class Cliente{
    private int numCliente;
    private String nombre;
    private int saldo;

    public Cliente(int numCliente, String nombre, int saldo){
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void set_saldo(int saldo){
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numCliente=" + numCliente +
                ", nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

class Caja{

    public void depositar(Cliente cliente, int monto){
        cliente.set_saldo(cliente.getSaldo() + monto);
    }

    public void extraer(Cliente cliente, int monto){
        cliente.set_saldo(cliente.getSaldo() - monto);
    }
}