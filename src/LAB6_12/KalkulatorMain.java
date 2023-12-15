package LAB6_12;

import java.util.Objects;

class Kalkulator{

    //Dodawanie int.
    public int dodaj(int a, int b){
        return a + b;
    }
    //Dodawanie double.
    public double dodaj(double a, double b){
        return a + b;
    }
    //Odejmowanie int.
    public int odejmij(int a, int b){
        return a - b;
    }
    //Odejmowanie double.
    public double odejmij(double a, double b){
        return a - b;
    }
    //Mnożenie int.
    public int pomnoz(int a, int b){
        return a * b;
    }
    //Mnożenie double.
    public double pomnoz(double a, double b){
        return a * b;
    }
    //Dzielenie int.
    public int dziel(int a , int b){
        if(b==0){
            System.out.println("Error! Nie można dzielić przez 0");
            return 0;
        }else {
            return a/b;
        }
    }
    //Dzielenie double.
    public double dziel(double a, double b){
        if(b==0){
            System.out.println("Error! Nie można dzielić przez 0.");
            return 0.0;
        }else {
            return a/b;
        }
    }
    //Potęga int.
    public int potega(int pod, int wyk){
        return (int)Math.pow(pod,wyk);
    }
    //Potęga double.
    public double potega(double pod, double wyk){
        return Math.pow(pod,wyk);
    }

    //Metoda wyświetlająca wynik operacji;
    public void wyswietlWynik(String dzialanie, Object wynik){
        System.out.println("Wynik " + dzialanie + " = " + wynik);
    }

}

public class KalkulatorMain {

    public static void main(String[] args){

        //Utworzenie obiektu klasy kalkulator do przetestowania przeciążonych metod działań matematycznych.
        Kalkulator k1 = new Kalkulator();

        //V.2 - definicja zmiennych wyniku i użycie metody wyświetlającej wynik operacji.
        int wynikDodajInt = k1.dodaj(5,12);
        k1.wyswietlWynik("Dodawanie int: ", wynikDodajInt);
        int wynikPotegaInt = k1.potega(3,4);
        k1.wyswietlWynik("Potęga int: ", wynikPotegaInt);
        double wynikOdejmijDouble = k1.odejmij(14.5, 8.7);
        k1.wyswietlWynik("Odejmowanie double: ", wynikOdejmijDouble);
        int wynikMnozenie = k1.pomnoz(3,4);
        k1.wyswietlWynik("Mnożenie int: ", wynikMnozenie);

        /*
        //V.1
        System.out.println("Dodaj Int: " +k1.dodaj(5,3));
        System.out.println("Odejmij Int: "+ k1.odejmij(10,4));
        System.out.println("Dodaj Double:" +k1.dodaj(4.5,13.2));
        System.out.println("Odejmij Double: " + k1.odejmij(44.6,23.5));
        System.out.println("Pomnóż Int: " + k1.pomnoz(3,5));
        System.out.println("Pomnóż Double: " + k1.pomnoz(3.14, 6.54));
        System.out.println("Podziel Int: " + k1.dziel(100,5));
        System.out.println("Podziel Double" + k1.dziel(3.14,2.5));
        //Test dzielenia przez 0.
        System.out.println( + k1.dziel(20,0));
        //Potęga.
        System.out.println("Potęga Int: " + k1.potega(5,3));
        System.out.println("Potęga Double: " + k1.potega(2.0,4.0));*/
    }
}
