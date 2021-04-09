/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.banco.model;

/**
 *
 * @author HP
 */
public class ProcesoBanco {

    private ProcesoCliente cliente1 = new ProcesoCliente();
    //private ProcesoCliente cliente2 = new ProcesoCliente();
    //private ProcesoCliente cliente3 = new ProcesoCliente();
    private int saldoTotal = 0;
    
    public ProcesoBanco() {
    }
    
    public void operar(){
        cliente1.depositar();
        //cliente2.depositar();
        //cliente2.extraer();
        //cliente3.depositar();
        //cliente3.extraer();
    }
    
    public void operar1(){
        cliente1.extraer();
    }
    
    public int deposito_total(){
        this.saldoTotal = cliente1.mostrar_total();
        return saldoTotal;
    }

    
    public ProcesoCliente getCliente1() {
        return cliente1;
    }

    public void setCliente1(ProcesoCliente cliente1) {
        this.cliente1 = cliente1;
    }
/*
    public ProcesoCliente getCliente2() {
        return cliente2;
    }

    public void setCliente2(ProcesoCliente cliente2) {
        this.cliente2 = cliente2;
    }

    public ProcesoCliente getCliente3() {
        return cliente3;
    }

    public void setCliente3(ProcesoCliente cliente3) {
        this.cliente3 = cliente3;
    }
*/
    public int getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(int saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
    
}
