package resources;

public class temajava1 {public class FizzBuzz {
    public static void main(String[] args) {
        // Iterăm prin numerele de la 1 la 100 inclusiv
        for (int i = 1; i <= 100; i++) {
            // Verificăm dacă numărul este divizibil atât cu 3 cât și cu 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Verificăm dacă numărul este divizibil doar cu 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Verificăm dacă numărul este divizibil doar cu 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // În toate celelalte cazuri, afișăm numărul însuși
            else {
                System.out.println(i);
            }
        }
    }
}

}
