package TAEHomeworks.Homework1;

public class CuentaBancaria {
    // 1. Atributos (Variables de la clase)
    // Pista: Necesitas uno para el nombre del titular (texto) y otro para el saldo
    // (dinero, puede ser tipo double).
    private String titular;
    private double saldo;

    // 2. Constructor
    // Pista: Debe recibir el nombre del titular al momento de crear la cuenta. El
    // saldo debe inicializarse en 0 por defecto.
    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    // 3. Métodos
    // Pista: Necesitas métodos para depositar dinero (recibe un double y suma al
    // saldo), retirar dinero (recibe un double, resta del saldo y debe validar
    // que haya fondos suficientes) y mostrar saldo (imprime el saldo actual).
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor a 0.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
