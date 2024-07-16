package switchexercitii;

/**
 * sa introducem un numar
 * sa se introduca un string
 */
public class Exercitiu2 {
    public static void main(String[] args) {
        String rez = zodiac(5);
        System.out.println(rez);
    }

    public static String zodiac(int luna) {
        switch (luna) {
            case 1:
            case 12:
                return "capricorn";
            case 2:
            case 8:
            case 9:
                return "fecioara";
            case 3:
                return "taur";
            case 4:
                return "pesti";
            case 5:
                return "varsator";
            default:
                return "luna incorecta";


        }
    }
}