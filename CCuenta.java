package cuentas;

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta() {    
    }

    /**
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.	
     * @param sal Saldo de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInteres = tipo;
    }

    /**
     * @return saldo Saldo de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * @param cantidad Cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * @param cantidad Cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad es negativa o si no hay saldo suficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (saldo < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * @return el nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta el número de cuenta a establecer.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return el saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo el saldo a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return el tipo de interés de la cuenta.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres el tipo de interés a establecer.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}