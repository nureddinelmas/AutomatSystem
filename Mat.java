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
public class Mat extends Produkt implements ProduktOchKop {
            Scanner scan = new Scanner(System.in);
    
    public float laddat;
    

    public Mat(int pkod, String name, int kostnad, String beskrivning) {
        super(pkod, name, kostnad, beskrivning);
        this.laddat = laddat;
        ArrayList<Mat> mat = new ArrayList<Mat>();


   
    }

    @Override
    public void Description() {
        ArrayList<Produkt> produkt = new ArrayList<Produkt>();

        int x = scan.nextInt();
        switch(x){
            case 1 -> {
                System.out.println(getKostnad());
            }
            case 2 -> {
                System.out.println(getName());
            }
                
            
            
        }
            

    }

    @Override
    public void Buy() {
   
    }

    @Override
    public void Use() {
   
    }

    }

