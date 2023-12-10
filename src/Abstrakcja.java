abstract class Figura{
    //Dane składowe.
    protected String kolor;
    //Konstruktor.
    public Figura(String kolor){
        this.kolor = kolor;
    }
    //Metoda abstrakcyjna bez implementacji.
    abstract double obliczPole();
    //Metoda z implementacją.
    void wyswietlInfo(){
        System.out.println("Ta figura ma kolor " + kolor);
    }
}
//Klasa dziedzicząca po Figurze.
class Kwadrat extends Figura{
    //Pole specyficzne dla kwadratu
    private double bok;
    //Konstruktor
    public Kwadrat(String kolor, double bok){
        super(kolor);
        this.bok = bok;
    }
    //Implementacja metody abstrakcyjnej.

    double obliczPole() {
        return bok * bok;
    }
}
public class Abstrakcja {
    public static void main(String[] args){

    //Utworzenie obiektu klasy Kwadrat.
        Kwadrat k1 = new Kwadrat("Zielony", 4.0);
     //Wywołanie metody abstrakcyjnej i metodę z implementacją.
    k1.wyswietlInfo();
        System.out.println("Pole kwadratu: " + k1.obliczPole());
    }

}
