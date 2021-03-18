package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Se dă o lista cu n elemente, numere naturale.
    // 1.Determinați diferența în valoare absolută dintre:
    // a.numărul de valori pare din lista si numărul de valori impare din lista.
    //(diferenta dintre totatul numerelor pare si impare)

    public static void Sir1(){
        Scanner readerTastatura = new Scanner(System.in);
        System.out.println("Insert the number counter for the test ");
        List<Integer> elemente = new ArrayList<>();

        Integer n = readerTastatura.nextInt();
        System.out.println("You entered " + n);
        for(int i = 0; i<n ; i++){
            System.out.println("Insert nr. " + i);
            try {
                elemente.add(readerTastatura.nextInt());
            } catch (Exception e) {
                System.out.println("Only numbers allowed");
            }
        }
        //Se poate folosi si fara citire de la tastatura dar se renunta la scanner.
        /*elemente.add(10);
        elemente.add(12);
        elemente.add(111);
        elemente.add(54);
        elemente.add(121);
        elemente.add(987);
        elemente.add(312654);
        elemente.add(8974);*/

        int  totalPare = 0, totalImpare = 0;
        for (int i = 0; i< elemente.size(); i++)
            if (elemente.get(i)%2 == 0)
                totalPare ++;
            else
                totalImpare ++;

        System.out.println("TotalPare - TotalImpare = "+ Math.abs(totalPare - totalImpare));
    }

    public static void main(String[] args) {
        Sir1();

    }
}
