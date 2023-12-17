package LAB6_2;
public class Przeciazenie {

   //Pcieciążenie metody do obliczania pola różnych figur geometrycznych.
   //Metody zawierają różne listy parametrów.

    //Metoda oblicza pole kwadratu.
    static double obliczPole(double a){
        return a * a;
    }

    //Metoda oblicza pole prostokąta.
    static double obliczPole(int dlugosc, int szerokosc){
        return dlugosc * szerokosc;
    }

    //Metoda oblicza pole trójkąta.
    static double obliczPole(double podstawa, double wysokosc){
        return (podstawa * wysokosc)/2;
    }

    public static void main(String[] args){

        //Wywołanie metody obliczPole() z różnymi parametrami i
        //przypisanie ich do odpowiednich zmiennych określających wynik metody dla odpowiedniej figury.
        double poleKwadratu = obliczPole(5.0);
        double poleProstokata = obliczPole(5,8);
        double poleTrojkata = obliczPole(6.0,4.0);

        //Wypisanie wyników, czyli pola odpowiedniej figury.
        System.out.println("Pole Kwadratu: " + poleKwadratu);
        System.out.println("Pole Prostokąta: " + poleProstokata);
        System.out.println("Pole Trójkąta: " + poleTrojkata);
    }
}
