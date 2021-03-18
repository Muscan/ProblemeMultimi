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
    // Se citește un vector(Lista) cu n elemente, numere naturale.
    // Să se afișeze elementele din vector(Lista)
    // care sunt multipli ai ultimului element.
    // Un numar din lista impartit la ultimul nr. are rezultatul intreg(18/9 =2).
    // Catul impartirii unui numar la ultimul numar are rezultatul zero(18%9=0)
    public static void Sir2(){
        //Initializare scanner pentru citire de la tastatura
        Scanner readerTastatura = new Scanner(System.in);
        System.out.println("Insert the number counter for the test 2 ");
        //Initializare lista numere intregi
        List<Integer> elemente = new ArrayList<>();
        //citim nr. de elemente pe care vrem sa le adaugam in lista
        Integer n = readerTastatura.nextInt();
        System.out.println("You entered " + n);
        //Citire n numere intregi de la tastatura
        for(int i = 0; i<n ; i++){
            System.out.println("Insert nr. " + i);
            try {
                //adaugare nr. citit in lista
                elemente.add(readerTastatura.nextInt());
            } catch (Exception e) {
                System.out.println("Only numbers allowed");
            }
        }
        List<Integer> rezultat = new ArrayList<>();

        //parcurgere lista
        for(int i = 0; i<n-1; i++){
            //verificare conditie linile 49-50
            if (elemente.get(i)%elemente.get(n-1)==0)
            //Daca e indeplinita conditia, se afiseaza numarul
            rezultat.add(elemente.get(i));
        }
        System.out.println("Elementele multiple ultimului element sunt: " + rezultat.toString());
    }
    public static void main(String[] args) {
        //Sir1();
        Sir2();

    }
}
