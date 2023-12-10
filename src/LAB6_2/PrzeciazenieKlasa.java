package LAB6_2;

import javax.sound.midi.Soundbank;

class Pracownik {
    private String imie;
    private String nazwisko;

    public Pracownik(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getInfo(){
        return "Pracownik " + imie + " " + nazwisko;
    }
    @Override
    public String toString(){
        return  getInfo();
    }

    public void wyplata(double kwota){
        System.out.println("Wypłata dla pracownika " + imie + " " + nazwisko + ": " +kwota + " PLN");
    }
}
class PracownikIT extends Pracownik{
    private String specjalizacja;

    public PracownikIT(String imie, String nazwisko, String specjalizacja){
        super(imie, nazwisko);
        this.specjalizacja=specjalizacja;
    }
    //Przeciążenie metody getInfo() z klasy bazowej.
    @Override
    public String getInfo(){
        return super.getInfo() + ", Specjalizacja: " +specjalizacja;
    }

    //Przeciążenie metody wyplata() z klasy bazowej
    public void wyplata(double kwota, double bonus){
        System.out.println("Wypłata dla pracownika IT " + super.getInfo() + ": " + kwota + " PLN + " + bonus + " PLN bonusu." );
    }
}
public class PrzeciazenieKlasa {
    public static void main(String[] args){
        Pracownik pracownik = new Pracownik("Józef","Cieśla");
         PracownikIT pracownikIT = new PracownikIT("Karol", "Waligóra", "inżynier DevOps");

         System.out.println(pracownik);
        System.out.println(pracownikIT);
        System.out.println();
        pracownik.wyplata(5000.0);
        pracownikIT.wyplata(7000.0, 1500.0);


    }
}
