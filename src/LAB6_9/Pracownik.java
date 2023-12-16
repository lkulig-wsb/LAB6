package LAB6_9;

//Klasa Pracownik.
public class Pracownik {
    //Dane składowe klasy pracownik.
    private String imie;
    private String nazwisko;
    private String stanowisko;

    //Konstruktor klasy Pracownik.
    public Pracownik(String imie, String nazwisko, String stanowisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
    }
    //Metoda dispInfo();
    public void dispInfo(){
        System.out.println("Imie: " + imie + ", Nazwisko: " + nazwisko + ", Stanowisko: " + stanowisko);
    }
    public static void main(String[] args)
    {
         //Utworzenie obiektu anoniomowego. Jednorazowa instancja pracownika z określonymi danymi.
        //Obiekt anonimowy nie ma przypisanej nazwy. Nie ma deklaracji zmiennej.
        new Pracownik("Józef", "Cieśla", "Administrator Oracle").dispInfo();

    }
}
