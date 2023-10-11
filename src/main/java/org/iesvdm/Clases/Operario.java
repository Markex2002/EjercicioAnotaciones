package org.iesvdm.Clases;

public class Operario extends Empleado{
    //ATRIBUTOS
    public Integer codigoTaller;


    //CONSTRUCTOR
    public Operario(String nombre, String apellidos, String direccion, String dni, Integer telefono) {
        super(nombre, apellidos, direccion, dni, telefono);
    }
    public Operario(String nombre, String apellidos, String direccion, String dni, Integer telefono, Integer codigoTaller) {
        super(nombre, apellidos, direccion, dni, telefono);
        this.codigoTaller = codigoTaller;
    }


    //GETTERS AND SETTERS
    public Integer getCodigoTaller() {
        return codigoTaller;
    }
    public void setCodigoTaller(Integer codigoTaller) {
        this.codigoTaller = codigoTaller;
    }


    //METODOS






}