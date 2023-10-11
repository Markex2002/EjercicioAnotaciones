package org.iesvdm.Clases;

public class Tecnico extends Operario{
    //ATRIBUTOS
    public String perfil;


    //CONSTRUCTOR
    public Tecnico(String nombre, String apellidos, String direccion, String dni, Integer telefono) {
        super(nombre, apellidos, direccion, dni, telefono);
    }
    public Tecnico(String nombre, String apellidos, String direccion, String dni, Integer telefono, Integer codigoTaller) {
        super(nombre, apellidos, direccion, dni, telefono, codigoTaller);
    }
    public Tecnico(String nombre, String apellidos, String direccion, String dni, Integer telefono, Integer codigoTaller, String perfil) {
        super(nombre, apellidos, direccion, dni, telefono, codigoTaller);
        this.perfil = perfil;
    }


    //GETTERS AND SETTERS
    public String getPerfil() {
        return perfil;
    }
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }


    //METODOS




}