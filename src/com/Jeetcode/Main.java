package com.Jeetcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int x = 133331; // x = 1221 = 1221, -121 = 121-
// float, double = decimale,  char =  slova, asci tablica
        if (x < 0) {
            System.out.println("Broj je negativan. Nije paliendrom!");
        // ALGORITAM - put koji dovodi do rješenja -> primjer sa čajem!
    }

    ArrayList<Integer> lista = new ArrayList<Integer>();

    while (x > 0) {

   //     System.out.println(x);
   //     System.out.println(x%10);
        lista.add( x % 10); // % modul operacija daje ostatak dijeljenja!
        x = x / 10;
    }

    boolean isPalinedrome = true;
    for(int i = 0; i < lista.size() / 2; i++){
        if(lista.get(i) != lista.get(lista.size() -i -1)){
            isPalinedrome = false;

        }
    }
    if (isPalinedrome == false) System.out.println("Nije paliendrom");
    else System.out.println("Paliendrom je" );
// Zašto dva "==" kod false?
    }
}
