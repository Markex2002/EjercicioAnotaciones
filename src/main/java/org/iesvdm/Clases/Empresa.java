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
    private Set<org.iesvdm.Clases.Empleado> empleadoList = new HashSet<>();

    //CONSTRUCTOR
    public Empresa(){
    }

    //GETTERS AND SETTERS
    public Set<org.iesvdm.Clases.Empleado> getEmpleadoList() {
        return empleadoList;
    }
    public void setEmpleadoList(Set<org.iesvdm.Clases.Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }



    //METODOS
    public static void cargadorContexto(Empresa empresa){
        empresa.getClass().getAnnotation(Empleados.class);
        Annotation[] anotaciones = empresa.getClass().getAnnotations();

        for (Annotation annotation : anotaciones){
            if (annotation instanceof Empleados){
                System.out.println(annotation);

                Empleado[] empleadosAnotArr = ((Empleados) annotation).value();
                for ()

                String nombre = ((Empleado) annotation).nombre();
                String apellidos = ((Empleado) annotation).apellidos();

                empresa.getEmpleadoList().add(new org.iesvdm.Clases.Empleado(nombre, apellidos));

            }
        }
    }
}