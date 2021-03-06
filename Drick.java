/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatsystem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 * @author nureddinelmas
 */
public class Drick extends Produkt implements ProduktOchKop {

    public Drick(int pkod, String name, int kostnad, String beskrivning) {
        super(pkod, name, kostnad, beskrivning);
    }

    @Override
    public void Description() {
        System.out.println(name+pkod+kostnad);
    }

    @Override
    public void Buy() {
        System.out.println("det köpas");
    }

    @Override
    public void Use() {
        System.out.println("det användas");
     
    }
    
     
     
     
  

}
