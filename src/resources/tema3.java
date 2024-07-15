package resources;

public class tema3
import java.util.Scanner;

public class StringContainsSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.println("Enter the substring: ");
        String substring = scanner.nextLine();

        boolean contains = mainString.contains(substring);

        if (contains) {
            System.out.println("The main string contains the substring.");
        } else {
            System.out.println("The main string does not contain the substring.");
        }

        scanner.close();
    }
}


