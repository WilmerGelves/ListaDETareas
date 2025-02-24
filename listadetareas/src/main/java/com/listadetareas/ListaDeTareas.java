package com.listadetareas;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaDeTareas {
    public static void listaTareas() {
        try {
            //Variables y colección
            Scanner sc = new Scanner(System.in);
            Set<String> tareas = new LinkedHashSet<>();
            String tarea;
            int opcion;

            System.out.print("\n1.Ingresar tarea\n2.Salir\n ->");
            opcion = sc.nextInt();

            while (opcion <1 || opcion >2) { //validación con while

                System.out.println("Ingrese una opción valida\n" + "1.Ingresar tarea.\n" + "2.Salir");
                opcion = sc.nextInt();
            }

            
            while (opcion == 1) { //Condicional que permite el ingreso de multiples tareas.

                sc.nextLine(); //Formateo del buffer de entrada.
                System.out.print("Ingrese la tarea -> ");
                tarea = sc.nextLine().toLowerCase().trim();
                tareas.add(tarea);
                
                System.out.println("\n1.Ingresar tarea\n2. Salir y Mostrar Tareas.");
                opcion = sc.nextInt();
                while (opcion <1 || opcion >2) {
                    System.out.println("Ingrese una opción valida" + "\n1.Ingresar tarea.\n" + "2.Salir y Mostrar Tareas.");
                    opcion = sc.nextInt();
                }
            }
            if (opcion == 2) {
                if (tareas.size() == 0) {
                    System.out.println("No hay tareas registradas.");
                }else{
                    String mensaje = """
                                        ========================
                                        =         TAREAS       =
                                        ========================
                                    """;

                    //Recorrido  de las tareas 
                    System.out.println(mensaje);
                    for (String compromiso : tareas) {
                        System.out.println( "\t-> " + compromiso);
                    }
                }
            } 
            sc.close();
        } catch (Exception e) {
            System.out.println("Valor no válido,intente nuevamente.");
            listaTareas();
        }
        
    }
}
