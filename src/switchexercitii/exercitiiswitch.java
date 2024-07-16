package switchexercitii;

/**
 * sa se returneze cate cald este
 * in functie de anotimp
 * vara: cald
 * iarna:rece
 * primavara:caldut
 * toamna:racorica
 */

public class exercitiiswitch {
    public static void main(String[] args) {
        String rez = anotimp("vara");
        System.out.println(rez);
    }


    public static String anotimp(String perioada) {
        switch (perioada) {
            case "vara":
                return "cald";
            case "iarna":
                return "rece";
            case "primavara":
                return "caldut";
            case "toamna":
                return "racorica";
            default:
                return "anotimp null";
        }
    }
}
