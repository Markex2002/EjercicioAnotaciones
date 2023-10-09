package org.iesvdm.Clases;

import org.iesvdm.Anotaciones.Empleado;
import org.iesvdm.Anotaciones.Empleados;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

//ANOTACIONES
//Declarando una clase
@Empleado( nombre = "Marco", apellidos = "Martin")

//Declarando un array de varias clases
@Empleados({@Empleado(nombre = "Marco", apellidos = "Martin"),
        @Empleado(nombre = "Peter", apellidos = "Griffin")})
//Tambien sirve
//@Empleados( value = {@org.iesvdm.Clases.Empleado(nombre = "Marco", apellidos = "Martin"),
//        @org.iesvdm.Clases.Empleado(nombre = "Peter", apellidos = "Griffin")})


public class Empresa {
    //ATRIBUTOS
    private Set<Empleado> empleadoList = new HashSet<>();

    //CONSTRUCTOR
    public Empresa(){
    }

    //GETTERS AND SETTERS
    public Set<Empleado> getEmpleadoList() {
        return empleadoList;
    }
    public void setEmpleadoList(Set<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }



    //METODOS
    public static void cargadorContexto(Empresa empresa){
        empresa.getClass().getAnnotation(Empleados.class);
        Annotation[] anotaciones = empresa.getClass().getAnnotations();

        for (Annotation annotation : anotaciones){
            if (annotation instanceof Empleado){
                System.out.println(annotation);
                String nombre = ((Empleado) annotation).nombre();
                String apellidos = ((Empleado) annotation).apellidos();

                Empleado empleado = new Empleado(nombre, apellidos);
                empleadoList.add(empleado);

            }
        }
    }
}