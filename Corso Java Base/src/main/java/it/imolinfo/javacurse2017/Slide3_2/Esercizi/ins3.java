package it.imolinfo.javacurse2017.Slide3_2.Esercizi;

/**
 * Created by francesca on 13/04/17.
 */
import java.io.*;
class ins3 {
    public static void main (String[] args) throws IOException{
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader s= new BufferedReader(input);

        String st;
        int r=0,i=0;
        System.out.print("ins.num:");
        st=s.readLine().trim();

        try{
            r=Integer.parseInt(st);
        }catch(NumberFormatException e){
            if(st.charAt(0)=='j'){
                try{
                    i=Integer.parseInt(st.substring(1, st.length()));          }
                catch(NumberFormatException w){          System.out.println("impossibile"); }
            }else System.out.println("impossibile");
        }//fine try-catch
        if(r!=0)System.out.println("Numero Reale:"+r);
        if(i!=0)System.out.println("Numero Immaginario:"+i);
    }//fine main
}//fine class



