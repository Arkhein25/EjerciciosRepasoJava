package poo.persona;

public class CuentaBancaria {
    double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double montoDeposito) {
        saldo += montoDeposito;
        System.out.println("Realizaste un depósito de: " + montoDeposito);
    }

    public double retirar(double montoRetiro) {
        if (montoRetiro <= saldo) {
            saldo -= montoRetiro;
            System.out.println("Realizarte un retiro de: " + montoRetiro);
            return saldo;
        } else {
            System.out.println("No tienes saldo suficiente para realizar este retiro");
        }
        return saldo;
    }

    public void saldoActual() {
        System.out.println("Tu saldo actual es: " + saldo);
    }
}
