package LAB6_8;
interface  Zamowienie {
    double obliczCene();
    void pokazSzczegoly();
}

class Produkt implements Zamowienie{
    private String nazwaProduktu;
    private double cenaJednostki;
    private int ilosc;

    public Produkt(String nazwaProduktu, double cenaJednostki, int ilosc){
        this.nazwaProduktu = nazwaProduktu;
        this.cenaJednostki = cenaJednostki;
        this.ilosc = ilosc;
    }

    @Override
    public double obliczCene() {
        return cenaJednostki * ilosc;
    }

    @Override
    public void pokazSzczegoly() {
        System.out.println("Produkt");
        System.out.println("--------");
        System.out.println("Nazwa Produktu: " + nazwaProduktu);
        System.out.println("Cena jednostki: " + cenaJednostki);
        System.out.println("Zamówiona ilość: " + ilosc);
        System.out.println("---------------------------------");
        System.out.println("Całkowity koszt zamówienia: " + obliczCene());
    }
}


public class ZamowienieMain {
    public static void main(String[] args){
    Produkt p1 = new Produkt("Unitek USB-C 2.0 black",49.90,5);
    p1.pokazSzczegoly();


    }
}
