package TrabajosPracticos;

import java.util.Random;

public class N11Banco {

    public static void main(String[] args){

    }
}

class CuentaCorriente{
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaCorriente(double saldo, String nombreTitular){
        Random random = new Random();
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = random.nextLong();
    }

    public double getSaldo() {
        return saldo;
    }

    public String getObtenerDatos() {
        return "Nombre del titular: "+nombreTitular+" - Numero de cueta: "+ numeroCuenta;
    }

    public void setSaldoIngreso(double valor){
        this.saldo += valor;
    }

}
