package it.imolinfo.javacurse2017.Slide3_2.Esercizi;

import java.util.Scanner;

public class Ins {

    public static void main (String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Ins.num:");
            System.out.println(in.nextInt()/(int)(Math.random()* 4));
        }
        catch(ArithmeticException e){
            System.out.println("impossibile");
        }
    }
}