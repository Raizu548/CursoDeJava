package TrabajosPracticos;

import java.util.Random;

public class N11Banco {

    public static void main(String[] args){
        CuentaCorriente cuenta1, cuenta2;
        cuenta1 = new CuentaCorriente(3000,"Luis");
        cuenta2 = new CuentaCorriente(0, "Mauri");

        cuenta1.realizarTransferencia(cuenta2, 2500);

        System.out.println(cuenta1.getObtenerDatos());
        System.out.println(cuenta2.getObtenerDatos());
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
        this.numeroCuenta = Math.abs(random.nextLong());
    }

    public double getSaldo() {
        return saldo;
    }

    public String getObtenerDatos() {
        return "Nombre del titular: "+nombreTitular+" - Numero de cueta: "+ numeroCuenta + " - Saldo: $" + saldo;
    }

    public void setSaldoIngreso(double valor){
        this.saldo += valor;
    }

    public void setSaldoReintegro(double valor){this.saldo -= valor;}

    public void realizarTransferencia(CuentaCorriente cuenta, double valor){
        this.setSaldoReintegro(valor);
        cuenta.setSaldoIngreso(valor);
    }

}
