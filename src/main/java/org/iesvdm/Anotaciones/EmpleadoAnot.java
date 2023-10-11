package org.iesvdm.Anotaciones;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(EmpleadosAnot.class)
public @interface EmpleadoAnot {
    String nombre();
    String apellidos();
    String direccion();
    String dni();
    int telefono();
    String clase();

    //Aqui podemos usar defaults, ya que no siempre se usaran estos todos atributos
    int codigoTaller() default 0;
    int codigoDespacho() default 0;
    String categoria() default "";
    String perfil() default "";
}