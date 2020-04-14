/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author Gabriel
 */
public class CentimetrosPulgadasConversor extends Conversor {

    private static final double UNA_PULGADA = 2.54;

    @Override
    public String getLabelValor1() {
        
        return "Centímetros";
    }
    
    @Override
    public String getLabelValor2() {
        
        return "Pulgadas";
    }
    
    @Override
    public String toString() {
        return "Centimetros a Pulgadas";
    }

    @Override
    public Double convertirValor1Valor2(Double valor1) {      
        return valor1 / UNA_PULGADA;
    }

    @Override
    public Double convertirValor2Valor1(Double valor2) {
        return valor2 * UNA_PULGADA;
    }


    
    
    
}
