/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.dasg.PedidoAPP.service;

/**
 *
 * @author Alumno
 */
public class PedidoService {
    private final double IGV = 0.18;
        
        public double calcularImpuesto(double importe){
            double impuesto;
            impuesto = importe * IGV;
            return impuesto;
        }
        
        public double calcularTotal(double importe){
            double total;
            total = importe + calcularImpuesto(importe);
            return total;
        }
    
}
