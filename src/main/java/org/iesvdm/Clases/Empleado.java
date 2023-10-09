package org.iesvdm.Clases;

public class Empleado {
    //ATRIBUTOS
    private String nombre;
    private String apellidos;


    //CONSTRUCTOR
    public Empleado(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }


    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }



    //METODOS
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}