package it.imolinfo.javacurse2017.Slide3_2.Esercizi;

/**
 * Created by francesca on 13/04/17.
 */
import java.util.Scanner;
class ins2 {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int i,num,pos;
        int T[] = new int[5];
        System.out.print("ins.num:");
        num=in.nextInt();
        System.out.print("ins.pos:");
        pos=in.nextInt();
        try{
            T[pos]=num;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("fuori dai limiti");
        }//fine try-catch
        for(i=0;i < T.length;i++)System.out.println(i+"]"+T[i]);
    }//fine main
}//fine class
