/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nureddinelmas
 */
public class Dress extends Produkt implements ProduktOchKop {

    static void HamtaProdukt(ArrayList<Dress> dress) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public Dress(int pkod, String name, int kostnad, String beskrivning) {
        super(pkod, name, kostnad, beskrivning);
    }

    @Override
    public void Description() {

    }

    @Override
    public void Buy() {
        System.out.println("Dress ska köpas");
    }

    @Override
    public void Use() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
        
    
   
}
