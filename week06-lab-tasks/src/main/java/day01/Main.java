package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PositiveNumberContainer pnc = new PositiveNumberContainer();
        System.out.println("Kérek egy számot!");
        double number = 1;
        while (number > 0) {
            number = sc.nextDouble();
            pnc.numberAdd(number);
        }
        System.out.println(pnc.getDoubleNumber());

    }
}
