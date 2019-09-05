package tugas_jobsheet8;

import java.util.Scanner;

public class contoh_perulangan_while {
    public static void main(String[] args) {
        //membuat variable dan scanner
        boolean rendi=true;
        int banyak=0;
        String jawab;
        Scanner ren=new Scanner(System.in);
        
        while (rendi){
        System.out.println("Apakah anda ingin keluar?");
        System.out.print("Jawab[ya/tidak]"); 
    jawab=ren.nextLine();
       
        if (jawab.equalsIgnoreCase("ya")){
        rendi=false;
        }
        banyak++;
        }
    
    System.out.println("anda sudah mengulangnya sebanyak" +banyak+ "kali");}
}
