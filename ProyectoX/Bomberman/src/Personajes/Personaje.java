package Personajes;
import javax.swing.JLabel;


import java.util.*;

import Mapa.*;
import Grafica.*;

/**
 * 
 * Clase abstracta Personaje, de ella extender�n Bomberman y los Enemigos.
 *
 */
public abstract class Personaje {

    protected int velocidad;
    protected PersonajeGrafico grafico; 
    protected boolean modoDios;
    protected Celda celda;  
    protected Mapa mapa;
    
    /**
     * 
     * @param m Mapa donde estar�n los personajes
     * @param c Celda donde se iniciar� cada personaje
     */
    protected Personaje(Mapa m, Celda c) {
    	celda=c;
        mapa=m;
        grafico=null;
    }

    /** 
     * 
     * @return Mapa donde se encuentran los personajes
     */
    public Mapa getMapa(){
    	return mapa;
    }
  
    /**
     * 
     * @return Velocidad de cada personaje
     */
    public int getVelocidad() {
        return velocidad;
    }
     
    /**
     * 
     * @return Verdadero si el personaje se encuentra en modo dios, caso contrario devuelve falso
     */
    public boolean getModoDios() {
        return modoDios;
    }

    /**
     * 
     * @return Imagen del personaje
     */
    public JLabel getGrafico(){
    	return grafico.getGrafico();
    }
 
    /**
     * 
     * @return Celda donde se encuentra el personaje al momento de llamar al m�todo
     */
    public Celda getCelda() {
        return celda;
    }
    
    /**
     * 
     * @return Grafica donde se encuentra implementado la parte gr�fica del personaje
     */
    
    public PersonajeGrafico getPGrafico(){
    	return grafico;
    }
    
    /** Setea la nueva celda del personaje dependiendo la direccion a la cual se movera
     * 
     * @param c Nueva celda que tendr� el personaje
     * @param d Direcci�n a la cual se mover� el personaje
     */
    public abstract void setCelda(Celda c,int d); 
    
    /** Setea la nueva celda del personaje.
     * 
     * @param c Nueva celda que tendr� el personaje
     */
    
    public void setCelda(Celda c){
    	celda=c;
    }
        


}