package day04;

import java.util.Scanner;

public class HangmanMain {



    public static void main(String[] args) {
        new HangmanMain().run();
    }

    Scanner sc = new Scanner(System.in);
    BusinessModel businessModel = new BusinessModel("almafa",  8);

    private void run() {
        do {
            printStatus();
            String guess = inputGuess();
            boolean success = businessModel.takeGuess(guess);
            if (success) {
                System.out.println("Jó");
            } else {
                System.out.println("Rossz");
            }

        } while (!businessModel.won() && businessModel.hasMoreChance());

        printResult(businessModel.won());
    }

    private void printResult(boolean won) {
        if (won) {
            System.out.println("Nyertél! Ügyes vagy!");
        } else {
            System.out.println("Vesztettél! Ne keseredj el, majd legközelebb!");
        }
    }

    private void printStatus () {
        System.out.println("Itt tartasz: " + businessModel.getWordFound());
        System.out.println("Ennyi tipped van még: " + businessModel.getChances());
    }

    private String inputGuess () {
        System.out.println("Mi a következő tipped?");
        String guess = sc.nextLine();
        return guess;
    }
}
