package com.company;
import java.util.*;
import javax.swing.JOptionPane;
import java.lang.*;
// FELIPE GUADALUPE RODRIGUEZ RAMIREZ
// 2795588
// ACTIVIDAD 6. JAVA
// 24 SEPTIEMBRE 2020
public class Main {

    public static void main(String[] args) {
	// INICIO

        //Declaración de variables
       Scanner InputUsuario = new Scanner(System.in);
       double sum=0;
       int grade[] = new int[5];
       double average;
       String name;
        int idS;



        //Mensajes del sistema
        System.out.println("¡Bienvenido! En este programa obtendras tu promedio y tu calificación general. ");
        System.out.println("Favor de ingresar tu nombre: ");
        name = InputUsuario.next();
        System.out.println("Favor de ingresar tu matrícula: ");
        idS = InputUsuario.nextInt();

        System.out.println("Hola, " + name + " " + "con matricula " + idS + ", bienvenido.");
        System.out.println("Por favor ingresa la calificación de las siguientes materias:");

        //Calificaciones
        System.out.println("Español: ");
        grade[0] = InputUsuario.nextInt();
        System.out.println("Inglés: ");
        grade[1] = InputUsuario.nextInt();
        System.out.println("Matemáticas: ");
        grade[2] = InputUsuario.nextInt();
        System.out.println("Ciencias naturales: ");
        grade[3] = InputUsuario.nextInt();
        System.out.println("Geografía: ");
        grade[4] = InputUsuario.nextInt();


        //Promedio
        for(int i = 0; i < grade.length; i++){
            sum += grade[i];
        }
        average=(sum / grade.length);
        System.out.println(name + " tienes un promedio de: " + average);

        //Rango
        if (average>=0&&average<=50){
            System.out.println(name + " tienes una calificación de: F");
        }
        if (average>=51&&average<=60){
            System.out.println(name + " tienes una calificación de: E");
        }
        if (average>=61&&average<=70){
            System.out.println(name + " tienes una calificación de: D");
        }
        if (average>=71&&average<=80){
            System.out.println(name + " tienes una calificación de: C");
        }
        if (average>=81&&average<=90){
            System.out.println(name + " tienes una calificación de: B");
        }
        if (average>=91&&average<=100){
            System.out.println(name + " tienes una calificación de: B");
        }
        //FIN
    }
}
