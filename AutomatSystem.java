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
public class AutomatSystem {


    public ArrayList<Dress> dress;
    public ArrayList<Mat> mats;
    public ArrayList<Drick> drinks;
    public ArrayList<Produkt> produkt;
    public float laddat = 0;
    public int x;
    public int antal;
    public float summa = 0;
 
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
       // vi skapar alla Arraylist
        boolean avsluta = true;

        
       
        ArrayList<Produkt> produkt = new ArrayList<>();
     
        ArrayList<Mat> mat = new ArrayList<>();
        ArrayList<Dress> dress = new ArrayList<>();
        ArrayList<Drick> dricks = new ArrayList<>();
        ArrayList<Pengar> pengar = new ArrayList<>();
        
        
        // vi anger alla produkter manuell
        produkt.add(new Produkt(0, "Bröd", 10, "Mat") {});
        produkt.add(new Produkt(1, "Pasta", 15, "Mat") {});       
        produkt.add(new Produkt(2, "Skor", 200, "Kläder"){});
        produkt.add(new Produkt(3,"Tunika", 350, "Kläder"){});
        produkt.add(new Produkt(4, "Cola", 10, "Drick"){});
        produkt.add(new Produkt(5,"Saft", 15, "Drick"){});
        
        pengar.add(new Pengar(0, 0));

       for (Drick i: dricks){
           System.out.println(i.name);
       }
       

        
        
   // Möjliggör att avsluta programmet
       while (avsluta == true){
        Produkt.MatList(produkt);
        Produkt.DrickList(produkt);
        Produkt.DressList(produkt);

        Kopas(produkt,pengar);

        // Kund ska välja att avsluta
        Scanner scan = new Scanner(System.in);
         System.out.print("Vill du fortsätta köpa ( trykc ett ) eller avsluta (tryck null) ? ");
         int v = scan.nextInt();
         avsluta = v == 1;

        } 
           // om kunden vill inte fortsätta då kan kunden få pengar tillbaka-
            System.out.println("TACK ! ");
            System.out.println("Ni får pengar tillbaka --> "+pengar.get(0).laddat);

    }

   // vår class för att köpa nåt
public static void Kopas(ArrayList<Produkt> produkt, ArrayList<Pengar> pengar){
    
         
         Scanner scan = new Scanner(System.in);
 

         // Kund ska ge vilken produkt hen ska välja
         System.out.print("För att köpa produkt ange koden : ");
       
        int x = scan.nextInt();
        // hur många styck vill kunden ha
        System.out.print("Hur många vill du ha : ");
        int antal = scan.nextInt();
        // om kund anger fel knapp ska det kommer ett varn!
        while (x > produkt.size()){
        System.out.println("Snälla ger ett annat nummer ! ");
        System.out.print("För att köpa produkt ange koden : ");
        x = scan.nextInt();
        }
        // det ska visas att vad kunden valt och hur många
        System.out.println("De produkter som du vill köpa -----");
        System.out.println(antal + " st "+"  --> "+produkt.get(x).name+"     "+ produkt.get(x).beskrivning+"      "+ produkt.get(x).kostnad+" kr");
        // kunden ska ange hur mycket ska ladda
        System.out.print("Hur många anger du 'ett mynt' : ");
       float ett = scan.nextFloat();
        System.out.print("Hur många anger du 'fem mynt' : ");
       float fem = scan.nextFloat();
        System.out.print("Hur många anger du 'tio mynt' : ");
       float tio = scan.nextFloat(); 
        System.out.print("Hur många anger du 'tjugo mynt' : ");
       float tjugo = scan.nextFloat();
       // Summan ska beräknas 
      pengar.get(0).setLaddat((ett * 1) + (fem * 5) + (tio * 10) + (tjugo * 20)+pengar.get(0).getSumma());

        System.out.println("Du har laddat  "+pengar.get(0).getLaddat());
        
     if (pengar.get(0).laddat < (produkt.get(x).kostnad * antal)){
                    System.out.println("Det räcker inte pengar tillräckligt !");
                     System.out.println(pengar.get(0).laddat+" <-- Laddat   Summa -->"+pengar.get(0).summa);
                }
                else if (pengar.get(0).laddat >= (produkt.get(x).kostnad * antal)){
                   System.out.println("Nu köpte du   "+ antal+" st "+"("+produkt.get(x).name+")");
                   pengar.get(0).setSumma(pengar.get(0).laddat - produkt.get(x).kostnad * antal);
                   pengar.get(0).setLaddat(pengar.get(0).getSumma());
                 
                    System.out.println("Kvarstående pengar : "+ pengar.get(0).getSumma());
                    
                    System.out.println("  Summa -->"+pengar.get(0).summa);
                   
                 } 

        

  } 





}
