
package prácticaunidad3;


/**
 *Clase que representa una cuenta bancaria corriente de un usuario
 * @author aaaaa
 */

public class CCuenta {


    // Propiedades de la Clase Cuenta
    
     private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *Constructor sin argumentos
     */

    public CCuenta ()
    {
    }
    

    /** Constructor con parámetro para iniciar todas las propiedades de la clase
     *
     * @param nom parametro que indica el nombre del usuario.
     * @param cue parametro que indica el numero de cuenta bancaria.
     * @param sal parametro que indica el saldo de la cuenta del usuario.
     * @param tipo parametro que indica el tipo.
     */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }

    /**Método para asignar el nombre del titular de la cuenta
     *
     * @param nom parametro que indica el nombre.
     */
    public void setNombre(String nom)
    {
        nombre=nom;
    }
    /**
     *Método que me devuelve el nombre del titular
     * @return devuelve un nombre del usuario.
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Método que me devuelve el saldo disponible en cada momento
     * @return devuelve el saldo disponible.
     */
     public double getEstado ()
    {
        return getSaldo();
    }

    /**Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     *
     * @param cantidad parametro que indica la cantidad de dinero que va a ingresar.
     * @throws Exception nos indica como excepcion que no se debe ingresar cantidades negativas.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     *Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     * @param cantidad: parametro que indica la cantidad que va a retirar
     * @throws Exception
     */

    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getEstado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     *Método que me devuelve el número de cuenta
     * @return devuelve el numero de la cuenta bancaria.
     */
    public String getCuenta ()
    {
        return cuenta;
    }
    /*
     * Metodo que habla sobre las facturas que se deben pagar y cantidad que 
     * debe pagar.
     */

    /**Metodo que habla sobre las facturas que se deben pagar y cantidad que 
     * debe pagar.
     * @param tipo parametro que indica el tipo de factura.
     * @param cantidad parametro que indica la cantidad que hay que pagar.
     */

     public void cobroFactura(String tipo, double cantidad){
         switch(tipo){
             
             case "alquiler":
                 if (cantidad>0 && cantidad<=400)
                     this.setSaldo(this.getSaldo() - cantidad);
                 break;
             case "luz":
                 if(cantidad<=200)
                     this.setSaldo(this.getSaldo() - cantidad);
                 break;
             case "agua":
                 if(cantidad>0 && cantidad<=200)
                     this.setSaldo(this.getSaldo() - cantidad);
                 break;
             case "seguro":
                 if(cantidad>0 && cantidad<=125)
                     this.setSaldo(this.getSaldo() - cantidad);
         }   
     } 

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
     
}
