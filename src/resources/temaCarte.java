package resources;

public class temaCarte
import java.util.ArrayList;
import java.util.List;

// Clasa abstractă temaCarte
abstract class Carte {
    private String titlu;
    private String autor;

    public Carte(String titlu, String autor) {
        this.titlu = titlu;
        this.autor = autor;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public abstract void afisareDetalii();
}

// Clasa CarteFizica
class CarteFizica extends Carte {
    private int numarPagini;

    public CarteFizica(String titlu, String autor, int numarPagini) {
        super(titlu, autor);
        this.numarPagini = numarPagini;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Carte Fizica: " + getTitlu() + " de " + getAutor() + " - " + numarPagini + " pagini.");
    }
}

// Clasa CarteElectronica
class CarteElectronica extends Carte {
    private double dimensiuneFisier;

    public CarteElectronica(String titlu, String autor, double dimensiuneFisier) {
        super(titlu, autor);
        this.dimensiuneFisier = dimensiuneFisier;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Carte Electronica: " + getTitlu() + " de " + getAutor() + " - " + dimensiuneFisier + " MB.");
    }
}

// Clasa Biblioteca
class Biblioteca {
    private List <Carte> carti;

    public Biblioteca() {
        this.carti = new ArrayList<>();
    }

    public void adaugaCarte(Carte carte) {
        carti.add(carte);
    }

    public void afisareDetaliiToateCartile() {
        for (Carte carte : carti) {
            carte.afisareDetalii();
        }
    }
}

// Clasa Main
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Carte carteFizica1 = new CarteFizica("Titlu Carte Fizica 1", "Autor 1", 300);
        Carte carteFizica2 = new CarteFizica("Titlu Carte Fizica 2", "Autor 2", 250);
        Carte carteElectronica1 = new CarteElectronica("Titlu Carte Electronica 1", "Autor 3", 1.5);
        Carte carteElectronica2 = new CarteElectronica("Titlu Carte Electronica 2", "Autor 4", 2.0);

        biblioteca.adaugaCarte(carteFizica1);
        biblioteca.adaugaCarte(carteFizica2);
        biblioteca.adaugaCarte(carteElectronica1);
        biblioteca.adaugaCarte(carteElectronica2);

        biblioteca.afisareDetaliiToateCartile();
    }
}

