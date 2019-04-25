/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import paquetedos.*;
/**
 *
 * @author royerjmasache
 */
public class SeleccionSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables e importación de paquete
        Scanner entrada = new Scanner(System.in);
        int calificacion = 0;
        int calificacion2 = 0;
        String miMensaje = Operacion.mensaje;
        // Ingreso de datos
        System.out.println("Ingrese la primera calificación");
        calificacion = entrada.nextInt();
        // Estructura condicional
        if(calificacion >= 85){
            System.out.printf("%s %d\n", miMensaje, calificacion);
        }
        // Ingreso de datos
        System.out.println("Ingrese la segunda calificación");
        calificacion2 =  entrada.nextInt();
        // Estructura condicional
        if(calificacion2 >= 85){
            System.out.printf("%s %d", miMensaje, calificacion2);
        }
    }
}
