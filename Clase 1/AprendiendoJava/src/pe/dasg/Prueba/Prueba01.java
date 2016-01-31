
package pe.dasg.Prueba;
import pe.dasg.model.Trabajador;

/**
 *
 * @author Alumno
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trabajador trabajador;
        trabajador = new Trabajador();
        System.out.println("Salario: " + trabajador.obtenerSalario(2));
        
    }
    
}
