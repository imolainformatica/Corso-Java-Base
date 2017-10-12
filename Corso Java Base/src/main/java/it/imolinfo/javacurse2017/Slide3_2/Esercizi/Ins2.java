package it.imolinfo.javacurse2017.Slide3_2.Esercizi;

import java.util.Scanner;

public class Ins2 {

    public static void main (String[] args) {
        int[] intArray= new int[5];
        int num,pos;
        try (Scanner in=new Scanner(System.in)){

            System.out.println("Inserisci il numero:");
            num=in.nextInt();
            System.out.println("in posizione:");
            pos=in.nextInt();
            intArray[pos]=num;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("fuori dai limiti");
        }
        for(int i=0; i < intArray.length; i++) {
            System.out.println("in posizione " + i + " -> " + intArray[i]);
        }
    }
}
