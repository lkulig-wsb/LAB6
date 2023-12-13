package LAB6_9;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private String stanowisko;

    public Pracownik(String imie, String nazwisko, String stanowisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
    }


    public static void main(String[] args)
    {
        Pracownik pracownik = new Pracownik("Józef", "Cieśla", "Administrator Oracle");

        System.out.println("Imię: " + pracownik.imie);
        System.out.println("Nazwisko: " + pracownik.nazwisko);
        System.out.println("Stanowisko: " + pracownik.stanowisko);

    }

}
