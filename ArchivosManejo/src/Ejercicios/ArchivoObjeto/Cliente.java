package Ejercicios.ArchivoObjeto;

import java.io.Serializable;

public class Cliente implements Serializable{
    //identificador
    static final long serialVersionUID=43L;
    //atributos
    private String nombre;
    private String paterno;
    private String Materno;
    private int cedula;
    //agregacion
    private TarjetaDebito tarjeta;
    //metodo
    public void mostrarCliente(){
        System.out.println("Nombre completo :"+this.nombre+" "+this.paterno+" "+this.Materno);
        System.out.println("Nro cedula :"+this.cedula);
        if(tarjeta != null){
            tarjeta.mostrarTarjeta();
        }
    }
    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return Materno;
    }

    public void setMaterno(String Materno) {
        this.Materno = Materno;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public TarjetaDebito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDebito tarjeta) {
        this.tarjeta = tarjeta;
    }
    
}
