package LAB6_2;

import javax.sound.midi.Soundbank;

class Pracownik {
    //Dane składowe klasy bazowej Pracownik.
    private String imie;
    private String nazwisko;
    //Konstruktor.
    public Pracownik(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    //Metoda getInfo().
    public String getInfo(){
        return "Pracownik: " + imie + " " + nazwisko;
    }
    @Override
    public String toString(){
        return  getInfo();
    }

    //Metoda wyplata.
    public void wyplata(double kwota){
        System.out.println("Wypłata dla pracownika: " + imie + " " + nazwisko + ": " +kwota + " PLN podstawy");
    }
}
//Klasa PracownikIT dziedziczy po klasie Pracownik.
class PracownikIT extends Pracownik{
    //Dane składowe klasy PracownikIT.
    private String specjalizacja;

    //Konstruktor klasy PracownikIT.
    public PracownikIT(String imie, String nazwisko, String specjalizacja){
        super(imie, nazwisko);
        this.specjalizacja=specjalizacja;
    }
    //Przeciążenie metody getInfo() z klasy bazowej.
    @Override
    public String getInfo(){
        return super.getInfo() + ", Specjalizacja: " +specjalizacja;
    }

    //Przeciążenie metody wyplata() z klasy bazowej.
    public void wyplata(double kwota, double bonus){
        System.out.println("Wypłata dla pracownika IT: " + super.getInfo() + ": " + kwota + " PLN podstawy + " + bonus + " PLN bonusu." );
    }
}
//Klasa PracownikB2B dziedziczy po klasie Pracownik.
class PracownikB2B extends Pracownik{
    //Dane składowe klasy PracownikB2B.
    private int godziny;
    private double stafka;

    //Konstruktor klasy PracownikB2B.
    public PracownikB2B(String imie, String nazwisko, int godziny, double stafka)
    {
        super(imie, nazwisko);
        this.godziny = godziny;
        this.stafka = stafka;

    }
    //Przeciążenie metody getInfo() z klasy bazowej.
    @Override
    public String getInfo(){
        return super.getInfo() + ", Przepracowane godziny: " + godziny +
                ", Stawka za godzinę: " + stafka + " PLN";
    }
    //Przeciążenie metody wyplata() z klasy bazowej.
    public void wyplata(double stafka, int godziny){
        System.out.println("Wypłata dla pracownika B2B: " + super.getInfo() + ": " + stafka + " /H * " + godziny +
                " godzin = " + (stafka * godziny) + " PLN total" );
    }
}
public class PrzeciazenieKlasa {
    public static void main(String[] args){
        Pracownik pracownik = new Pracownik("Józef","Cieśla");
         PracownikIT pracownikIT = new PracownikIT("Karol", "Waligóra", "inżynier DevOps");
         PracownikB2B pracownikB2B = new PracownikB2B("Karl","Malone",180,30.50);

         System.out.println(pracownik);
        System.out.println(pracownikIT);
        System.out.println(pracownikB2B);
        System.out.println();
        pracownik.wyplata(5000.0);
        pracownikIT.wyplata(7000.0, 1500.0);
        pracownikB2B.wyplata(30.50, 180);
    }
}
