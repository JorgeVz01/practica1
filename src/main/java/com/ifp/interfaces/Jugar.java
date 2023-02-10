
package com.ifp.interfaces;

/**
 *
 * @author David Cavanillas
 */
public class Jugar {
//Tenemos esta clase jugar con el main para poder ejecutar el juego
    public static void main(String[] args) {
        JuegoDados juego1 = new JuegoDados();
        juego1.saludo();
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();
        juego1.despedida();
        
//Llamamos a JuegoDados(juego1) y a JuegoAdivinaNumero(juego2) con sus respectivos métodos.
//La estructura para definir esto sería la siguiente:
        //NOMBREDELACLASE NOMBRE1 = NEW NOMBREDELACLASE();
            //NOMBRE1.NOMBREDELMETODODELACLASEINTERFACE();
            //NOMBRE1.NOMBREDELMETODODELACLASEINTERFACE1();
            //NOMBRE1.NOMBREDELMETODODELACLASEINTERFACE2();
            
        JuegoAdivinaNumero juego2 = new JuegoAdivinaNumero();
        juego2.saludo();
        juego2.iniciar();
        juego2.jugar();
        juego2.finalizar();
        juego2.despedida();
    }
    
}
