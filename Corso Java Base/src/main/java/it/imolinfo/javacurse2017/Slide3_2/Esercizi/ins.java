package it.imolinfo.javacurse2017.Slide3_2.Esercizi;

/**
 * Created by francesca on 13/04/17.
 */
import java.util.Scanner;
class ins {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in); System.out.print("ins.num:");
        try{
            System.out.println(in.nextInt()/(int)(Math.random()* 4));
        }
        catch(ArithmeticException e){
            System.out.println("impossibile");
        }//fine try-catch
    }//fine main
}//fine class