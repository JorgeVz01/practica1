
package com.ifp.interfaces;

import java.util.Scanner;

/**
 *
 * @author David Cavanillas
 */
public class JuegoDados extends MensajesAbstracta implements JuegoEjemploInterfacesMensaje {
    private int dado1, dado2;
    private String jugador1;
    private String jugador2;
    private Scanner teclado;
    
    public JuegoDados(){
        teclado = new Scanner(System.in);
    }
    
    public void iniciar(){
        System.out.println("¿Cómo se llama el primer jugador?");
            jugador1 = teclado.nextLine();
            
        System.out.println("¿Y el segundo jugador?");
            jugador2 = teclado.nextLine();
    }
    
    public void jugar(){
        dado1 = 1+ (int) (Math.random() * 6);
        dado2 = 1+ (int) (Math.random() * 6);
        
        System.out.println("A " + jugador1 + " le ha salido el valor " + dado1);
        System.out.println("A " + jugador2 + " le ha salido el valor " + dado2);   
    }
    
    public void finalizar(){
        if (dado1 > dado2)
            System.out.println(jugador1 + " ha ganado con un resultado de " + dado1);
        else if (dado2>dado1)
            System.out.println(jugador2 + " ha ganado con un resultado de " + dado2);
        else
            System.out.println("Empataron los dos jugadores con el valor " + dado1);
    }
    

    @Override
    public void despedida() {
        System.out.println("ME DESPIDO DE TI");
    }
    
    
}
