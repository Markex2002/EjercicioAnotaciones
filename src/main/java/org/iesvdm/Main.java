package org.iesvdm;

import org.iesvdm.Clases.Empleado;
import org.iesvdm.Clases.Empresa;

public class Main {
    public static void main(String[] args){

        Empresa empresa = new Empresa();
        Empresa.cargadorContexto(empresa);

        for (Empleado empleado : empresa.getEmpleadoList()){
            System.out.println(empleado.toString());
        }
    }
}