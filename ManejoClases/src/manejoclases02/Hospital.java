/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases02;


public class Hospital {
    private String nombre;
    private int numeroCamas;
    private double presupuesto;
    public void establecerNombre(String newName){
        nombre=newName;
    }
    public String obtenerNombre(){
    return nombre;
    }
}
