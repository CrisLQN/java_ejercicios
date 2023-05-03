
package integrador;

import Entidad.Estudiante;
import Servicio.EstudianteServicio;
import java.util.Arrays;

/**
 *
 * @author cris-
 */
public class Integrador {

   
    public static void main(String[] args) {
        EstudianteServicio escuelaServ=new EstudianteServicio();
        Estudiante escuelaUno=escuelaServ.crearEscuela();
        System.out.println(escuelaUno.toString());
        System.out.println(escuelaServ.sacarPromedio(escuelaUno));
    }
    
}
