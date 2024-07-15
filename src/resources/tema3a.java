package resources;


import java.util.Scanner;

public class StringStartsWithPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.println("Enter the prefix: ");
        String prefix = scanner.nextLine();

        boolean startsWith = mainString.startsWith(prefix);

        if (startsWith) {
            System.out.println("The main string starts with the prefix.");
        } else {
            System.out.println("The main string does not start with the prefix.");
        }

        scanner.close();
    }
}

