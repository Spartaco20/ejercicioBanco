/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.banco.controller;

import edu.banco.model.ProcesoBanco;
import edu.banco.model.ProcesoCliente;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author HP
 */
@ManagedBean
@SessionScoped
public class TransaccionBanco implements Serializable{

    private ProcesoCliente cliente1 = new ProcesoCliente();
    private ProcesoBanco pb = new ProcesoBanco();
    private ArrayList<ProcesoCliente> listaDepositos = new ArrayList<>();
    
    public TransaccionBanco() {
    }
    
    public void depoBanco(){
        cliente1.depositar();
        cliente1.setAction("Consignación");
        listaDepositos.add(new ProcesoCliente(cliente1.getNombre(), cliente1.getCantidad(), cliente1.getAction(), cliente1.getSaldo(), cliente1.getsaldoTotalBanco()));
    }
    
    public void retiBanco(){
        cliente1.extraer();
        listaDepositos.add(new ProcesoCliente(cliente1.getNombre(), cliente1.getCantidad(), cliente1.getAction(), cliente1.getSaldo(), cliente1.getsaldoTotalBanco()));
    }
    
    public void mostrarSaldoBanco(){
        cliente1.mostrar_saldo_banco();
    }

    
    public ProcesoCliente getCliente1() {
        return cliente1;
    }

    public void setCliente1(ProcesoCliente cliente1) {
        this.cliente1 = cliente1;
    }

    public ArrayList<ProcesoCliente> getListaDepositos() {
        return listaDepositos;
    }

    public void setListaDepositos(ArrayList<ProcesoCliente> listaDepositos) {
        this.listaDepositos = listaDepositos;
    }

    public ProcesoBanco getPb() {
        return pb;
    }

    public void setPb(ProcesoBanco pb) {
        this.pb = pb;
    }
    
}
