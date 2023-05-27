/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author MiriamNahuel
 */
public class Java2Encuentros1Al9CorreccionDeErrores4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> bebidas = new ArrayList(); //creo el arreglo de lista
        bebidas.add("café"); //pongo las cadenas que quiero
        bebidas.add("te");
        Iterator  it = bebidas.iterator(); //creo el iterador sobre la lista
        while(it.hasNext()) { //hasNext evalua si hay cosas en el arreglo --> si hay retorna verdadero y funca el while
            if (it.next().equals("café")){ //con el next itero y con el equals me fijo si esta esa palabra
                it.remove(); //si esta entonces la remuevo
            }
            }
        }

    }
