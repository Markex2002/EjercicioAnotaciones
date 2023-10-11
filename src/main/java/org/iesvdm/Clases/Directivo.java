package org.iesvdm.Clases;

public class Directivo extends Empleado{
    //ATRIBUTOS
    public Integer codigoDespacho;


    //CONSTRUCTOR
    public Directivo(String nombre, String apellidos, String direccion, String dni, Integer telefono) {
        super(nombre, apellidos, direccion, dni, telefono);
    }

    public Directivo(String nombre, String apellidos, String direccion, String dni, Integer telefono, Integer codigoDespacho) {
        super(nombre, apellidos, direccion, dni, telefono);
        this.codigoDespacho = codigoDespacho;
    }


    //GETTERS AND SETTERS
    public Integer getCodigoDespacho() {
        return codigoDespacho;
    }
    public void setCodigoDespacho(Integer codigoDespacho) {
        this.codigoDespacho = codigoDespacho;
    }



    //METODOS




}