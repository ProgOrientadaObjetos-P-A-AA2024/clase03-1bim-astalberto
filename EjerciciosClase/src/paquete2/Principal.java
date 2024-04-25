/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/

        InstitucionEducativa i1 = new InstitucionEducativa();
        String nombre = "Unidad Educativa Fiscomisional 'Juan XXIII'";
        String tipo = "Fiscomisional";
        int nAlumnos = 200;
        int nDocentes = 10;
        int nSedes = 2;

        i1.establecerNombre(nombre);
        i1.establecerTipoInstitucion(tipo);
        i1.establecerNumeroAlumnos(nAlumnos);
        i1.establecerNumeroDocentes(nDocentes);
        i1.establecerNumeroSedes(nSedes);

        System.out.printf("Nombre: %s\nTipo Institucion: %s\nNumero Alumnos: %d\nNumero Docentes: %d\nNumero de Sedes: %d\n",
                i1.obtenerNombre(),
                i1.obtenerTipoInstitucion(),
                i1.obtenerNumeroAlumnos(),
                i1.obtenerNumeroDocentes(),
                i1.obtenerNumeroSedes());
    }
}
