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
    abstract public class Produkt {
    public int pkod;
    public String name;
    public int kostnad;
    public String beskrivning;
    public float laddat;
    public float summa;


    public Produkt(int pkod, String name, int kostnad, String beskrivning) {
        this.pkod = pkod;
        this.name = name;
        this.kostnad = kostnad;
        this.beskrivning = beskrivning;

        
        
    }

    public int getPkod() {
        return pkod;
    }

    public String getName() {
        return name;
    }

    public int getKostnad() {
        return kostnad;
    }

    public String getBeskrivning() {
        return beskrivning;
    }
         // Vi ska göra lista alla produkter
public static void MakeList (ArrayList<Produkt> produkt){
    System.out.println("--------------------------------------------------------");
    System.out.println("---------------------PRODUKTER--------------------------");
    System.out.println("--------------------------------------------------------");

         for (Produkt i: produkt){
              System.out.println(i.pkod+ "  --> "+i.name+" ----- "+ i.beskrivning+" ----- "+ i.kostnad+" kr");
 
         }
}
     // Vi ska göra lista alla mat
public static void MatList (ArrayList<Produkt> produkt){
        
    System.out.println("--------------------------------------------------");
    System.out.println("---------------------MAT--------------------------");

    for (Produkt i: produkt){

        if ("Mat".equals(i.beskrivning)) {
     
                System.out.println(i.pkod+ "  --> "+i.name+" ----- "+ i.beskrivning+" ----- "+ i.kostnad+" kr");
        }
    }
}
     // Vi ska göra lista alla kläder
     public static void DressList (ArrayList<Produkt> produkt){
    System.out.println("-----------------------------------------------------");
    System.out.println("---------------------KLÄDER--------------------------");

    for (Produkt i: produkt){
        if ("Kläder".equals(i.beskrivning)) {
    
                System.out.println(i.pkod+ "  --> "+i.name+" ----- "+ i.beskrivning+" ----- "+ i.kostnad+" kr");
        }
    }
 

}
          // Vi ska göra lista alla drickar
 public static void DrickList(ArrayList<Produkt> produkt){
    
    System.out.println("---------------------------------------------------");
    System.out.println("---------------------DRICK-------------------------");
    
    for (Produkt i: produkt){
        if ("Drick".equals(i.beskrivning)) {
    
                System.out.println(i.pkod+ "  --> "+i.name+" ----- "+ i.beskrivning+" ----- "+ i.kostnad+" kr");
        }
    }    
}
 

    
 
 


