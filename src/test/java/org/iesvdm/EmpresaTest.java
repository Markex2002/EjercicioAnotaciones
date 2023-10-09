package org.iesvdm;//Dependencia del Junit.Jupiter hecho en el pom.Xml!!!!
import org.iesvdm.Clases.Empresa;
import org.junit.jupiter.api.Test;

public class EmpresaTest {

    @Test
    public void testProcesadorContexto(){
        Empresa empresa = new Empresa();

        Empresa.cargadorContexto(empresa);

    }
}