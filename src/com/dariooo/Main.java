package com.dariooo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Kalkulator który umie dodawać
 */
public class Main {

    public static void main(String[] args) {

        Integer firstNumber;
        Integer secoundNumber;

        // zmienna która przechowuje imię
        String name;

        Scanner scan = new Scanner(System.in);

        System.out.println("Uruchomiłeś Dodawacza");
        System.out.println("Cześć, podaj swoje imię:");
        name = scan.nextLine();
        boolean czyTylkoLitery = name.matches("[a-zA-Z]+");
        if (!czyTylkoLitery) {
            if (name.equals("R2-D2")) {
                System.out.println("Niech moc będzie z Tobą R2!");
            } else {
                System.out.println("Czy jesteś droidem ze Star Wars?!");
            }
        }
        System.out.println("Cześć " + name + ", Twoje imię składa się z " + name.length() + " znaków");
        System.out.println("Podaj pierwszy sładnik");
        firstNumber = getNumberOrExit();

        System.out.println("Podałeś:" + firstNumber);

        System.out.println("Podaj drugi składnik");
        secoundNumber = getNumberOrExit();
        System.out.println("Podałeś:" + secoundNumber);

        System.out.println("Wynik dodawania " + firstNumber + " + " + secoundNumber + " wynosi: " + (firstNumber + secoundNumber));
        System.out.println("Do widzenia " + name);
    }

    public static Integer getNumberOrExit() {
        int iloscProb = 1;

        Integer number = null;
        while (iloscProb < 6 && number == null) {
            Scanner scan = new Scanner(System.in);
            try {
                number = scan.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Miałeś podać liczbę! To jest Twoja " + iloscProb + " próba!");
                iloscProb = iloscProb + 1;
            }
        }
        if (number == null) {
            System.out.println("Nie podałeś liczby, nie bawię się z Tobą, Dowidzenia!");
            System.exit(0);
        }
        return number;
    }
}
