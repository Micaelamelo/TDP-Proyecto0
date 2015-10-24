package Objetos;

import Mapa.*;

/**
 * 
 * Clase l�gica de la Bomba
 *
 */
public class Bomba{


    protected int alcanceBomba;
    protected Mapa mapa;
    protected Celda celda;
   
    /**
     * 
     * @param m Mapa donde se encontrar� la bomba
     * @param alcance Alcance de la bomba 
     * @param c Celda donde se crea la bomba
     */
    public Bomba(Mapa m, int alcance, Celda c) {
       mapa=m;
       alcanceBomba=alcance;
       celda=c;
       mapa.generarExplosion(c, alcance);
    }

   /**
    * 
    * @return Alcance de la explosion de la bomba
    */
    public int getAlcance() {
        return alcanceBomba;
    }
    
    /**
     * 
     * @return Celda donde se cre� la bomba
     */
 
    public Celda getCelda() {
    	return celda;
    }

}