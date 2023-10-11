package org.iesvdm.Clases;

public class Oficial extends Operario{
    //ATRIBUTOS
    public String categoria;


    //CONSTRUCTORES
    public Oficial(String nombre, String apellidos, String direccion, String dni, Integer telefono) {
        super(nombre, apellidos, direccion, dni, telefono);
    }
    public Oficial(String nombre, String apellidos, String direccion, String dni, Integer telefono, Integer codigoTaller) {
        super(nombre, apellidos, direccion, dni, telefono, codigoTaller);
    }
    public Oficial(String nombre, String apellidos, String direccion, String dni, Integer telefono, Integer codigoTaller, String categoria) {
        super(nombre, apellidos, direccion, dni, telefono, codigoTaller);
        this.categoria = categoria;
    }


    //GETTERS AND SETTERS
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    //METODOS



}