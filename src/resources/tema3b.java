package resources;

import java.util.Scanner;

public class StringEndsWithWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.println("Enter the suffix: ");
        String suffix = scanner.nextLine();

        boolean endsWith = mainString.endsWith(suffix);

        if (endsWith) {
            System.out.println("The main string ends with the word.");
        } else {
            System.out.println("The main string does not end with the word.");
        }

        scanner.close();
    }
}

