/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package hospitaal;

/**
 *
 * @author david
 */


public class Hospitaal {

    public static void main(String[] args) {
        int a=0;
       Cuentacobro cuenta=new Cuentacobro(a++);
       cuenta.GenerarCuenta();
       cuenta.Escribir_Archivo();
        
          
    }
}
