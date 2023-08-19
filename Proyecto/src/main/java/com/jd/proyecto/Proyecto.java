/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jd.proyecto;

import Mundo.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juand
 */
public class Proyecto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean activo = true;
        ArrayList<Alumno> misAlumnos = new ArrayList<Alumno>();
        
        do {            
           System.out.println("------------------- Menu de opciones -------------------");
           System.out.println("1. Insertar alumno");
           System.out.println("2. Eliminar alumno");
           System.out.println("3. Modificar alumno");
           System.out.println("4. Consultar alumno");
           System.out.println("5. terminar Programa");
           System.out.println("---------------------------------------------------------");
           
           int opcion = sc.nextInt();
            switch (opcion) {
                case 1 ->{
                    System.out.println("Bienvenid@ a registro de nuevo alumno");
                    System.out.println("Introduce cedula del almunno");
                    int cedula = sc.nextInt();
                    System.out.println("Introduce nombre del almunno");
                    String nombre = sc.next();
                    System.out.println("Introduce apellido del almunno");
                    String apellido = sc.next();
                    System.out.println("Introduce semestre del almunno");
                    int semestre = sc.nextInt();
                    System.out.println("Introduce correo del almunno");
                    String correo = sc.next();
                    System.out.println("Introduce celular del almunno");
                    int celular = sc.nextInt();
                    
                    Alumno a = new Alumno();
                    a.setCedula(cedula);
                    a.setNombre(nombre);
                    a.setApellido(apellido);
                    a.setSemestre(semestre);
                    a.setCorreo(correo);
                    a.setCelular(celular);
                    
                    misAlumnos.add(a);
                    
                }
                case 2 -> System.out.println("Opcion Dos ");
                case 3 -> System.out.println("Opcion Tres ");
                case 4 -> System.out.println("Opcion Cuatro ");
                case 5 ->{
                    System.out.println("Opcion Cinco ");
                    activo = false;
                }
                    
                default -> {
                    
                }
            }
           
        } while (activo);
        
        
    }
}
