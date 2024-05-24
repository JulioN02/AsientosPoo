package asientospoo.logica;

import java.util.Date;

public class Ticket {

//Parametros
    private int numero, fila, asiento;
    private double precio;
    private Date fechaCompra;
    private Date fechaValidez;

    //Constructor vacio
    public Ticket() {
    }

    //Constructor con todos los parametros
    public Ticket(int numero, int fila, int asiento, double precio, Date fechaCompra, Date fechaValidez) {
        this.numero = numero;
        this.fila = fila;
        this.asiento = asiento;
        this.precio = precio;
        this.fechaCompra = fechaCompra;
        this.fechaValidez = fechaValidez;
    }

    //Getter
    public int getNumero() {
        return numero;
    }

    public int getfila() {
        return fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public double getPrecio() {
        return precio;
    }

    public Date getfechaCompra() {
        return fechaCompra;
    }

    public Date getfechaValidez() {
        return fechaValidez;
    }

    //Setter
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setfila(int fila) {
        this.fila = fila;
    }

    public void setAsiento(int Asiento){
        this.asiento = asiento;
    }
    
    public void setPrecio(int Precio){
        this.precio = precio;
    }
    
    public void setfechaCompra(Date fechaCompra){
        this.fechaCompra = fechaCompra;
    }
    
    public void setfechaValidez(Date fechaValidez){
        this.fechaValidez = fechaValidez;
    }

}
