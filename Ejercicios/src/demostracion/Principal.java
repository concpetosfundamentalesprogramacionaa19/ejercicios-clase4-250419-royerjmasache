/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;

import java.util.Scanner;

/**
 *
 * @author royerjmasache
 */
public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        // Declaración de variables
        float tarifa = 3;
        float mensaje = 0;
        float valor = 0;
        float valor2 = 0;
        float valor3 = 0;
        float mensaje1 = 0;
        // Ingreso de datos
        System.out.println("Ingrese la cantidad de mensajes enviados por mes");
        mensaje = entrada.nextInt();
        // Estructura lógica condicional anidada
        if(mensaje <= 40){
            // Operación
            valor = (float) (tarifa + (tarifa * 0.12));
            // Presentación de datos
            System.out.printf("El valor mensual de la tarifa es de %.2f\n",
                    valor);
        } else {
            if(mensaje > 40 && mensaje <= 200){
                mensaje = (float) ((mensaje - 40)* 0.05);
                valor = (float) ((mensaje + tarifa));
                valor = (float) (valor + (valor * 0.12));
                System.out.printf("El valor mensual de la tarifa es de %.2f\n"
                , valor);
            } else {
                if(mensaje > 200){
                    mensaje1 = (mensaje - 200);
                    valor2 = (float) (mensaje1 * 0.10);
                    valor3 = (float) ((mensaje - mensaje1 - 40) * 0.05);
                    valor = (float) (tarifa + valor2 + valor3);
                    valor = (float) (valor + (valor * 0.12));
                    System.out.printf("El valor mensual de la tarifa es de: "
                            + "%.2f\n", valor);
                }
            }
        }
    }   
}
