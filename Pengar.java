/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatsystem;

import java.util.Scanner;

/**
 *
 * @author nureddinelmas
 */
    public class Pengar {
    public float laddat;
    public float summa;
    Scanner scan = new Scanner(System.in);
    
    public Pengar(float laddat, float summa) {

        this.laddat = laddat;
        this.summa = summa;
    }

    public float getLaddat() {
        return laddat;
    }

    public float getSumma() {
        return summa;
    }

    public void setLaddat(float laddat) {
        this.laddat = laddat;
    }

    public void setSumma(float summa) {
        this.summa = summa;
    }
    public void ParaEkle(){
       
    
    }
    
    public void SatinAl(){
        
    }
}
