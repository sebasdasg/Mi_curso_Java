
package pe.dasg.model;

/**
 *
 * @author Alumno
 */
public class Trabajador {
    /*
    *este metodo retorna el salario de un trabajador
    *segun su categoria
    *Retorna el salario segun su categoria
    */
    public double obtenerSalario(int categoria){
        double salario =0.0;
        switch(categoria){
            case 1:
                salario = 1500.0;
                break;
            case 2:
                salario = 3500.0;
                break;
            case 3:
                salario = 6500.0;
                break;
                
        }
        
        return salario;
    }
    
}
