package mirea.it.it.isb113.alexandrov;

import java.util.Scanner;

/**
 * Created by student on 18.03.2015.
 */
public class minLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String minString=null;
        for (int i = 0; i < 10; i++) {
        String string = scanner.nextLine();
            if (i == 0) {
                minString=string;
            }
            if (string.length() < minString.length()) {
                minString=string;
            }
        }
        System.out.println("самая короткая строка: "+minString+", ее длина: "+minString.length());

    }
}
