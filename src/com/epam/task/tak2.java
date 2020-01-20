package com.epam.task;

import java.util.Scanner;

class tak2 {
    public static String uniqueCharacters(String test){
        String temp = "";
        for (int i = 0; i < test.length(); i++){
            char current = test.charAt(i);
            if (temp.indexOf(current) < 0){
                temp = temp + current;
            } else {
                temp = temp.replace(String.valueOf(current), "");
            }
        }

        System.out.println(temp + " ");
        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        String str= uniqueCharacters( test);
    }
}
