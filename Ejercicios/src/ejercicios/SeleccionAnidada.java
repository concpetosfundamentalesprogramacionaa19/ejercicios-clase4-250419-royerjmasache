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
public class SeleccionAnidada {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        // Declaración de variables e importanción
        int calificacion = 0;
        String miMensaje = Operacion2.mensaje;
        String miMensaje2 = Operacion2.mensaje2;
        // Ingreso de datos
        System.out.println("Ingrese el valor de la calificación");
        calificacion = entrada.nextInt();
        // Estructura lógica condicional anidada
        if(calificacion >= 90){
            System.out.printf("%s (Excelente) con %d\n ", miMensaje, calificacion);
        } else {
            if(calificacion < 90 && calificacion >=80){
                System.out.printf("%s (Muy buena) con %d\n", miMensaje, calificacion);
            } else {
                if(calificacion < 80 && calificacion >= 50){
                    System.out.printf("%s (Regular) con %d\n", miMensaje, calificacion);
                } else {
                    System.out.printf("%s con %d\n", miMensaje2, calificacion);
                }
            }
        }
    }
}
