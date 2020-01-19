package com.epam.task;
import java.util.Scanner;
public class task1 {
    public static String change(int number) {
        String res =Integer.toString(number, 2);
        System.out.print(res);
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String str= change( number);
    }
}


