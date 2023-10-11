package org.iesvdm.Clases;

public class Empleado {
    //ATRIBUTOS
    private String nombre;
    private String apellidos;
    private String direccion;
    private String dni;
    private Integer telefono;


    //CONSTRUCTOR
    public Empleado(String nombre, String apellidos, String direccion, String dni, Integer telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;
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
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Integer getTelefono() {
        return telefono;
    }
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }


    //METODOS
    @Override
    public boolean equals(Object obj) {
        Empleado e1 = (Empleado) obj;

        //Si el Dni coincide, se trata de la misma persona
        return this.dni.equalsIgnoreCase(e1.getDni());
    }

    @Override
    public String toString() {
        String resultado = "";
        resultado += "nombre: " + nombre + ", apellidos: " + apellidos + ", Posicion: " + getClass().toString();

        return resultado;
    }
}