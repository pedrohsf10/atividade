/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancotrimestra;

/**
 *
 * @author pedro_000
 */
public class BalancoTrimestra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int gastosJaneiro = 150000;
        int gastosFevereiro = 230000;
        int gastosMarco = 170000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println("os gastos foram = " +gastosTrimestre);
        
        
    }
    
}
