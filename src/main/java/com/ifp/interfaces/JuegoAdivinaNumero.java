
package com.ifp.interfaces;

import java.util.Scanner;

/**
 *
 * @author David Cavanillas
 */
//Creamos esta clase para el juego de Adivinar el número, pondremos implements diciendo que "hereda" de la clase interface JuegoEjemploInterfaces
public class JuegoAdivinaNumero implements JuegoEjemploInterfaces, JuegoEjemploInterfacesMensaje{
//Definimos  las variables que usaremos: numAdivina, teclado(el scanner) e intentos 
    private int numAdivina;
    private Scanner teclado;
    private int intentos;

//Hago una public JuegoAdivinaNumero para inicializar el scanner   
    public JuegoAdivinaNumero(){
        teclado = new Scanner(System.in);
    }
//Dejamos el método iniciar que tenemos en nuestra clase interface
//Simplemente el numAdivina es igual a 1 ( empezamos desde el 1) y el *100 se escribe para que sea un número random del 1 al 100
//Ponemos el 1 para que empiece en 1 para que no multiplique por 0    
    public void iniciar(){
        numAdivina = 1 + (int) (Math.random() * 100);
    }

//Dejamos ahora el método jugar, definiendo primero la variable numero de tipo int    
    public void jugar(){
        int numero;
//Lo primero que hace el do es introducirte al juego y guarda numero (es el número que metemos por teclado)
  //Si el número es mayor que el numAdivina, te dirá que pruebes con un número más bajo
  //Si el número es menor que el numAdivina, te dirá que pruebes con un número más alto
  //Luego ponemos para que se vayan sumando los intentos
//El bucle se dará mientras el numero sea distinto de numAdivina
        do{
            System.out.println("Adivina un número del 1 al 100"); 
                numero = teclado.nextInt();
                if (numAdivina < numero)
                    System.out.println("Prueba con un número mas bajo");
                else if (numAdivina > numero)
                    System.out.println("Prueba con un número mayor");
                intentos++;
        }while (numero!= numAdivina);
    }
    
//El último método "finalizar" sólo te da un mensaje con el número de intentos que gastaste
    public void finalizar(){
        System.out.println("¡Ganaste! lo conseguiste en " + intentos + " intentos");
    }
    public void saludo(){
        System.out.println("Hola, bienvenido al juego");
    }
    public void despedida(){
        System.out.println("Adios, gracias por jugar");
    }
    
}
