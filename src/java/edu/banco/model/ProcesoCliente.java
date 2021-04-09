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
public class ProcesoCliente {
    
    private String nombre = "";
    private int cantidad = 0;
    private String action = "";
    private int saldo = 0;
    private int saldoTotalBanco = 0;

    public ProcesoCliente() {
    }

    public ProcesoCliente(String nombre, int cantidad, String action, int saldo, int saldoTotalBanco) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.action = action;
        this.saldo = saldo;
        this.saldoTotalBanco = saldoTotalBanco;
    }
    
    public int depositar(){
        this.saldo += this.cantidad;
        return saldo;
    }
    
    public String extraer(){
        if(this.saldo < this.cantidad){
            return this.action = "Transacción Invalida";
        } else {
            this.saldo -= this.cantidad;
            this.action = "Retiro";
            return String.valueOf(this.saldo);
        }
    }
    
    public int mostrar_total(){
        return saldo;
    }
    
    public int mostrar_saldo_banco(){
        this.saldoTotalBanco = saldo;
        return saldoTotalBanco;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getsaldoTotalBanco() {
        return saldoTotalBanco;
    }

    public void setsaldoTotalBanco(int saldoTotalBanco) {
        this.saldoTotalBanco = saldoTotalBanco;
    }
    
}
