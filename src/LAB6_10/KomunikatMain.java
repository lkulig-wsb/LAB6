package LAB6_10;
//Utworznie interface'u z metodą wyswietl().
interface Komunikat{
    void wyswietl(String wiadomosc);
}
public class KomunikatMain {
    public static void main(String[] args){
        //Utworzenie obiektu anonimowego który implemenuje interface Komunikat.
        Komunikat komunikat = new Komunikat(){
            @Override
            public void wyswietl (String wiadomosc){
                System.out.println("<< Komunikt: " + wiadomosc + " >>");
            }
        };
        //Wyświetlenie kilku różnych komunikatów za pomocą utworzonego wcześniej obiektu anonimowego:
        komunikat.wyswietl("Cześć, Jak się masz?");
        komunikat.wyswietl("Hello, How are you?");
        komunikat.wyswietl("Hola, como estas?");
        komunikat.wyswietl("Ahoj, jak se mas?");
        komunikat.wyswietl("Bok, kako si?");
    }
}
