package org.iesvdm.Anotaciones;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(EmpleadosAnot.class)
public @interface EmpleadoAnot {
    String nombre();
    String apellidos();
    //Quitar Defaults una vez terminado
    String direccion() default "";
    String dni() default "";
    int telefono() default 0;
    String clase();


    //Aqui podemos mantener los defaults
    int codigoTaller() default 0;
    int codigoDespacho() default 0;
    String categoria() default "";
    String perfil() default "";



}