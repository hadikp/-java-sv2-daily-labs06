package day02;

public class NumbersMain {
    public static void main(String[] args) {
        Numbers perfectNumbers = new Numbers();

        System.out.println(perfectNumbers.isPerfectNumber(6)); //true
        System.out.println(perfectNumbers.isPerfectNumber(8128)); //true
        System.out.println(perfectNumbers.isPerfectNumber(7246)); //false
        System.out.println(perfectNumbers.isPerfectNumber(9)); //false
    }

}
