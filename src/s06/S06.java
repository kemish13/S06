/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s06;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ejercicio S06");
        System.out.println("");
        
        //producto 01
        String nombre01 = "";
       int cantidad01 = 0;
       double precio01 = 0;
       
       
        //producto 02
       String nombre02 = "";
       int cantidad02 = 0;
       double precio02 = 0;
       
       //producto 03
       String nombre03 = "";
       int cantidad03 = 0;
       double precio03 = 0;
       
       //declarando e inicializando las variables tipo scanner
       Scanner sc = new Scanner(System.in);
       
       
       
       /*
       * producto01
       */
       //producto01 -> nombre
       System.out.println("Ingrese \"nombre\"producto01: ");
       nombre01 = sc.next();
       //producto01 -> cantidad
       System.out.println("Ingrese \"cantidad\"producto01: ");
       cantidad01 = sc.nextInt();
       //producto01 -> precio
       System.out.println("Ingrese \"precio\"producto01: ");
       precio01 = sc.nextDouble();
       
       
       
       /*
       * producto02
       */
       //producto02 -> nombre
       System.out.println("Ingrese \"nombre\"producto02: ");
       nombre02 = sc.next();
       //producto02 -> cantidad
       System.out.println("Ingrese \"cantidad\"producto02: ");
       cantidad02 = sc.nextInt();
       //producto02 -> precio
       System.out.println("Ingrese \"precio\"producto02: ");
       precio02 = sc.nextDouble();
       
       
       
       
       /*
       * producto03
       */
       //producto03 -> nombre
       System.out.println("Ingrese \"nombre\"producto03: ");
       nombre03 = sc.next();
       //producto03 -> cantidad
       System.out.println("Ingrese \"cantidad\"producto03: ");
       cantidad03 = sc.nextInt();
       //producto03 -> precio
       System.out.println("Ingrese \"precio\"producto03: ");
       precio03 = sc.nextDouble();
       

       //subtotal
       double subtotal =0;
       subtotal += cantidad01 + precio01;
       subtotal += cantidad02 + precio02;
       subtotal += cantidad03 + precio03;
       
       //impuesto
       double impuesto = subtotal * 0.18;
       
       //total
       double total = subtotal + impuesto;
       
     System.out.println("El total es:" +total);
       
               
    }
    
}
