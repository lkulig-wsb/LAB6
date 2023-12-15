package LAB6_8;
//Utworzenie interfejsu o nazwie Zamowienie.
interface  Zamowienie {
    //Utworzenie metod obliczCene() oraz pokazSzczegoly().
    double obliczCene();
    void pokazSzczegoly();
}
//Utworzenie klasy Produkt, która implementuje interface Zamowienie.
class Produkt implements Zamowienie{
    //Dane składowe klasy Produkt.
    private String nazwaProduktu;
    private double cenaJednostki;
    private int ilosc;
    //Konstruktor klasy Produkt.
    public Produkt(String nazwaProduktu, double cenaJednostki, int ilosc){
        this.nazwaProduktu = nazwaProduktu;
        this.cenaJednostki = cenaJednostki;
        this.ilosc = ilosc;
    }
    //Przesłonięcie metody obliczCene() z interfaceu Zamowienie.
    //Dostarczenie własnej implementacji obliczenia ceny dla produktu.
    @Override
    public double obliczCene() {
        return cenaJednostki * ilosc;
    }
    //Przesłonięcie metody pokazSzczegoly() z interfaceu Zamowienie.
    //Dostarczenie własnej implementacji dla metody pokazSzczegoly().
    //Tutaj jest to wyświetlenie szczegółów produktu.
    @Override
    public void pokazSzczegoly() {
        System.out.println("Produkt");
        System.out.println("--------");
        System.out.println("Nazwa Produktu: " + nazwaProduktu);
        System.out.println("Cena jednostki: " + cenaJednostki + " PLN");
        System.out.println("Zamówiona ilość: " + ilosc + " szt");
        System.out.println("---------------------------------");
        System.out.println("Całkowity koszt zamówienia: " + obliczCene() + " PLN");
    }
}
//Utworzenie klasy Usluga, która implementuje interface Zamowienie.
class Usluga implements Zamowienie{
    //Dane składowe klasy Usluga.
    private String nazwaUslugi;
    private double stawkaGodzina;
    private int iloscGodzin;
    private double kosztDojazdu;
    //Konstruktor klasy Usluga.
    public Usluga(String nazwaUslugi, double stawkaGodzina, int iloscGodzin, double kosztDojazdu){
        this.nazwaUslugi = nazwaUslugi;
        this.stawkaGodzina = stawkaGodzina;
        this.iloscGodzin = iloscGodzin;
        this.kosztDojazdu = kosztDojazdu;
    }
    //Przesłonięcie metody obliczCene() z interfaceu Zamowienie.
    //Dostarczenie własnej implementacji obliczenia ceny dla usługi.
    @Override
    public double obliczCene() {
        return (stawkaGodzina * iloscGodzin) + kosztDojazdu;
    }
    //Przesłonięcie metody pokazSzczegoly() z interfaceu Zamowienie.
    //Dostarczenie własnej implementacji dla metody pokazSzczegoly().
    //Tutaj jest to wyświetlenie szczegółów usługi.
    @Override
    public void pokazSzczegoly() {
        System.out.println("Usługa");
        System.out.println("-------");
        System.out.println("Nazwa usługi: " + nazwaUslugi);
        System.out.println("Stawka za godzinę: " + stawkaGodzina + " PLN");
        System.out.println("Ilosć godzin: " + iloscGodzin + " h");
        System.out.println("Koszt dojazdu: " + kosztDojazdu + " PLN");
        System.out.println("---------------------------------");
        System.out.println("Do zapłaty " + obliczCene() + " PLN");
    }
}
public class ZamowienieMain {
    public static void main(String[] args){
    //Utworzenie objektów klas Produkt i Usluga, a następnie wyświetlenie ich szczegółów.
    Produkt p1 = new Produkt("Unitek USB-C 2.0 black",49.90,5);
    p1.pokazSzczegoly();
        System.out.println();
    Usluga u1 = new Usluga("Konfiguracja sieci domowej",80.50,5, 120.0);
    u1.pokazSzczegoly();
    }
}
