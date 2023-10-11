package org.iesvdm.Clases;

import org.iesvdm.Anotaciones.EmpleadoAnot;
import org.iesvdm.Anotaciones.EmpleadosAnot;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

//ANOTACIONES
//Declarando una clase
@EmpleadoAnot( nombre = "Marco", apellidos = "Martin", clase = "Operario")

//Declarando un array de varias clases
@EmpleadosAnot({@EmpleadoAnot(nombre = "Marco", apellidos = "Martin", clase = "Oficial"),
        @EmpleadoAnot(nombre = "Peter", apellidos = "Griffin", clase = "Tecnico")})
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
        EmpleadosAnot empleadosAnotPadre = empresa.getClass().getAnnotation(EmpleadosAnot.class);
        EmpleadoAnot[] empleadoAnotsHijos = empleadosAnotPadre.value();

        for (EmpleadoAnot empleadoAnotsHijo : empleadoAnotsHijos) {
            switch (empleadoAnotsHijo.clase()){
                case "Directivo":
                    System.out.println("Un Directivo");
                    break;
                case "Tecnico":
                    System.out.println("Un Tecnico");
                    break;
                case "Oficial":
                    System.out.println("Un Oficial");
            }
        }
    }
}