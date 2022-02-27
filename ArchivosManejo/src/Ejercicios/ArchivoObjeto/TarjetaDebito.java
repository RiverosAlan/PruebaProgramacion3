package Ejercicios.ArchivoObjeto;

import java.io.Serializable;

public class TarjetaDebito implements Serializable{
    //identificador
    static final long serialVersionUID=42L;
    private int nroTarjeta;
    private int nroCuenta;
    private double saldo;
    private String estado;
    //metodo
    public void mostrarTarjeta(){
        System.out.println("Nro Tarjeta :"+this.nroTarjeta);
        System.out.println("Nro de Cuenta :"+this.nroCuenta);
        System.out.println("Saldo :"+this.saldo);
        System.out.println("Estado :"+this.estado);
    }
    //getter and setter
    public int getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(int nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
