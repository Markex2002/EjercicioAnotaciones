package org.iesvdm.Clases;

import org.iesvdm.Anotaciones.EmpleadoAnot;
import org.iesvdm.Anotaciones.EmpleadosAnot;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

//ANOTACIONES
//Declarando una clase
//@EmpleadoAnot( nombre = "Marco", apellidos = "Martin", clase = "Operario")

//Declarando un array de varias clases
@EmpleadosAnot({@EmpleadoAnot(nombre = "Marco", apellidos = "Martin", direccion = "Calle SanHamburgo", dni = "7911239S", telefono = 123456789, clase = "Directivo", codigoDespacho = 99),
        @EmpleadoAnot(nombre = "Peter", apellidos = "Griffing", direccion = "Calle Almeja", dni = "13425476P", telefono = 123123241, clase = "Oficial", codigoTaller = 1, categoria = "Alta"),
        @EmpleadoAnot(nombre = "Mario", apellidos = "Mario", direccion = "Calle Champiñon", dni = "62458781Q", telefono = 345365354, clase = "Tecnico", codigoTaller = 1, perfil = "Manitas")})
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
    //Metodo que cojera los datos insertados en las anotaciones y creara clases a partir de estos
    public static void cargadorContexto(Empresa empresa){
        //Cojemos la anotacion Empleados que contiene varios empleados y la guardamos en un Array de Empleado
        EmpleadosAnot empleadosAnotPadre = empresa.getClass().getAnnotation(EmpleadosAnot.class);
        EmpleadoAnot[] empleadoAnotsHijos = empleadosAnotPadre.value();

        for (EmpleadoAnot empleadoAnotsHijo : empleadoAnotsHijos) {
            switch (empleadoAnotsHijo.clase()){
                case "Directivo":
                    //Cojemos los datos guardados en la anotacion
                    String nombre = empleadoAnotsHijo.nombre();
                    String apellidos = empleadoAnotsHijo.apellidos();
                    String direccion = empleadoAnotsHijo.direccion();
                    String dni = empleadoAnotsHijo.dni();
                    Integer telefono = empleadoAnotsHijo.telefono();
                    Integer codigoDespacho = empleadoAnotsHijo.codigoDespacho();

                    //Usamos los parametros para crear la clase correspondiente
                    Directivo directivo = new Directivo(nombre,apellidos,direccion,dni,telefono,codigoDespacho);

                    //Insertamos al directivo en la lista
                    empresa.getEmpleadoList().add(directivo);
                    System.out.println("Directivo Insertado");
                    break;

                case "Tecnico":
                    //Cojemos los datos guardados en la anotacion
                    nombre = empleadoAnotsHijo.nombre();
                    apellidos = empleadoAnotsHijo.apellidos();
                    direccion = empleadoAnotsHijo.direccion();
                    dni = empleadoAnotsHijo.dni();
                    telefono = empleadoAnotsHijo.telefono();
                    Integer codigoTaller = empleadoAnotsHijo.codigoTaller();
                    String perfil = empleadoAnotsHijo.perfil();

                    //Usamos los parametros para crear la clase correspondiente
                    Tecnico tecnico = new Tecnico(nombre,apellidos,direccion,dni,telefono,codigoTaller, perfil);

                    //Insertamos al Tecnico en la lista
                    empresa.getEmpleadoList().add(tecnico);
                    System.out.println("Tecnico Insertado");
                    break;

                case "Oficial":
                    //Cojemos los datos guardados en la anotacion
                    nombre = empleadoAnotsHijo.nombre();
                    apellidos = empleadoAnotsHijo.apellidos();
                    direccion = empleadoAnotsHijo.direccion();
                    dni = empleadoAnotsHijo.dni();
                    telefono = empleadoAnotsHijo.telefono();
                    codigoTaller = empleadoAnotsHijo.codigoTaller();
                    String categoria = empleadoAnotsHijo.categoria();

                    //Usamos los parametros para crear la clase correspondiente
                    Oficial oficial = new Oficial(nombre,apellidos,direccion,dni,telefono,codigoTaller, categoria);

                    //Insertamos al Tecnico en la lista
                    empresa.getEmpleadoList().add(oficial);
                    System.out.println("Oficial Insertado");
                    break;
            }
        }
    }
}