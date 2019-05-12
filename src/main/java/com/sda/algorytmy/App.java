package com.sda.algorytmy;

import java.util.Arrays;
import java.util.Scanner;

/**
 Zadanie
 Dana jest tablica: a = {4, 1, 6, 1, 1, 4, 3, 3, 1}.
 Proszę zgodnie ze schematem blokowym przeprowadzić zliczanie liczby: 1.
 1) Na kartce rozpisać wszystkie kroki.
 2) Zaimplementować kod
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int [] tab = {4,1,6,1,1,4,3,3,1};
        int zliczanie = 0;

        System.out.println(Arrays.toString(tab));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Liczba, ktora chcesz zliczyc?");

        int wartosc = scanner.nextInt();



        for(int i = 0; i < tab.length; i++){

            if (tab[i] == wartosc){

                zliczanie++;

            }

        }

        System.out.println("Liczba " + wartosc + "wystepuje " + zliczanie + "razy.");

    }

}



