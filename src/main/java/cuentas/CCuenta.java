package cuentas;


/**
 * Clase para gestionar el saldo de una cuenta bancaria.
 * 
 * @author Climent Cànaves
 * @version 1.0
 */
public class CCuenta {
    
    /** Nombre del cliente de la cuenta. */
    private String nombre;
    /** Número de la cuenta. */
    private String cuenta;
    /** Saldo actual de la cuenta. */
    private double saldo;
    /** Tipo de interés que se le aplica. */
    private double tipoInterés;

    /**
     * Constructor básico de la clase.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de la classe que inicializa los datos de una cuenta.
     * @param nom - Nombre del cliente de la cuenta.
     * @param cue - Número de la cuenta.
     * @param sal - Saldo actual de la cuenta.
     * @param tipo - Tipo de interés que se le aplica.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Establece el nombre del Cliente.
     * @return Nombre del cliente de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Recupera el nombre del Cliente.
     * @param nombre Nombre del cliente de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece para el número de la cuenta
     * @return Número de la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Recupera el número de cuenta.
     * @param cuenta Número de la cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Establece el saldo actual de la cuenta.
     * @return Saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Recupera el saldo de la cuenta.
     * @param saldo Saldo actual de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Establece el tipo de interés que se aplica a la cuenta.
     * @return Tipo de interés que se le aplica.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Recupera el tipo de interés que se aplica a la cuenta.
     * @param tipoInterés Tipo de interés que se le aplica.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Consulta el estado del saldo de la cuenta.
     * @return El saldo actual de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa en el saldo de la cuenta una cantidad pasada por paràmetro.
     * @param cantidad La cantidad a ingresar en la cuenta.
     * @throws Exception No se pueden hacer ingresos de cantidades negativas.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Retira una cantidad pasada por parametro de dinero del saldo actual de la cuenta.
     * @param cantidad La cantidad a retirar de la cuenta.
     * @throws Exception No se pueden retirar cantidades negativas ni una cantidad
     * No se puede retirar una cantidad superior al saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
