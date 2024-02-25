package cuentas;

/**
 * Clase para probar el funcionamiento de la clase Cuenta.
 * 
 * @author Climent Cànaves
 * @version 1.0
 */
public class Main {

    /**
     * Ejecución principal de la aplicación.
     * @param args Parametros de la aplicación pasados en consola.
     */
    public static void main(String[] args) {
        operativa_cuenta(2500);
    }

    /**
     * Diversas acciones obre una cuenta bancaria para probar su funcionalidad.
     * @param cantidad Saldo inicial de la cuenta de prueba.
     */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",cantidad,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

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
