package practica4_jv2024;

public class Main {
    public static void main(String[] args) {
        // Crear una cuenta de ahorros
        CuentaAhorros cuentaAhorros = new CuentaAhorros(8000, 3.5);
        System.out.println("Cuenta de ahorros inicial:");
        System.out.println(cuentaAhorros);

        // Realizar algunas operaciones en la cuenta de ahorros
        cuentaAhorros.consignar(5000);
        cuentaAhorros.retirar(2000);
        cuentaAhorros.extractoMensual();
        System.out.println("Cuenta de ahorros después de operaciones:");
        System.out.println(cuentaAhorros);

        // Crear una cuenta corriente
        CuentaCorriente cuentaCorriente = new CuentaCorriente(500, 3.5);
        System.out.println("Cuenta corriente inicial:");
        System.out.println(cuentaCorriente);

        // Realizar algunas operaciones en la cuenta corriente
        cuentaCorriente.consignar(1000);
        cuentaCorriente.retirar(800);
        cuentaCorriente.retirar(800); // Prueba de sobregiro
        cuentaCorriente.extractoMensual();
        System.out.println("Cuenta corriente después de operaciones:");
        System.out.println(cuentaCorriente);
    }
}