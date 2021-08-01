package homework.homework3;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        //Task 1

        System.out.println("Task1");
        Palindrome palindrome = new Palindrome();
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        palindrome.isPalindrome (scanner.nextLine());

        //Task 2
        System.out.println("Task2");
        RomanToArabic romanToArabic = new RomanToArabic();
        System.out.println("Введите римскую цифру:");
        System.out.println(romanToArabic.convertRomanToArabic(scanner.nextLine()));

        scanner.close();
    }
}
