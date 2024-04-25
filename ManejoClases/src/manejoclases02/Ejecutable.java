/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases02;
import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Se crea un objeto
        Hospital hospital = new Hospital();
        /*
        // Se asigna valores particulares al objeto
        hospital.nombre = "Isidro Ayora";
        hospital.numeroCamas = 100;
        hospital.presupuesto = 560340.43;
        
        // Se presenta valores en pantalla*/
        hospital.establecerNombre("pepe");
        System.out.println(hospital.obtenerNombre());
        //System.out.printf("%s - %d - %.2f\n", hospital.nombre,
          //      hospital.numeroCamas, hospital.presupuesto);
        
    }
}
