package it.imolinfo.javacurse2017.Slide3_2.Esercizi;

import java.io.*;

public class Ins3 {
    
    public static void main (String[] args) throws IOException{
       
        String string = "";

        try (BufferedReader s = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Inserisci un numero");
            string = s.readLine().trim();
            int reale = Integer.parseInt(string);
            System.out.println("Numero Reale:" + reale);
        } catch (NumberFormatException e) {
            if(string.charAt(0) == 'j'){
                try{
                    int immaginario = Integer.parseInt(string.substring(1, string.length()));
                    System.out.println("Numero Immaginario:" + immaginario);
                }
                catch(NumberFormatException w){
                    System.out.println("impossibile"); }
            }else System.out.println("impossibile");
        }
    }
}


