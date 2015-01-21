/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Tomas
 */
public class hello {
    public static void main (String[] args){
        System.out.println("Ingrese su nombre: ");
        Scanner in = new Scanner(System.in);
        String nombre = in.next();
        System.out.println("Greetings "+nombre);
        
    }
}

