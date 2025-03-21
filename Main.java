package cuentas;

/**
 * La clase Main ejecuta la operativa de la cuenta bancaria.
 */
public class Main {

    /**
     * Método principal que invoca el método operativa_cuenta.
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        operativa_cuenta(2500f);
    }

    /**
     * Realiza operaciones en una cuenta.
     * @param cantidad Parámetro adicional (de tipo float) para futuras operaciones.
     */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
