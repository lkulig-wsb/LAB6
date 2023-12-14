package LAB6_5;

//Definicja interfejsu Zamówienie.
interface Zamowienie {
    void utworzZamowienie();
    void anulujZamowienie();
}
//Klasa ZamowienieInternetowe implementuje interface Zamowienie.
class ZamowienieInternetowe implements Zamowienie{
    private String status;
    public ZamowienieInternetowe(String status){
        this.status=status;
    }
    @Override
    public void utworzZamowienie(){
        System.out.println("Zamówienie Internetowe zostało utworzone.");
    }

    @Override
    public void anulujZamowienie(){
        System.out.println("Zamowienie internetowe zostało anulowane.");
    }
    //Metoda specyficzna wyłącznie dla klasy ZamowienieInternetowe
    public void wyswietlStatus(){
        System.out.println("Status zamówienia internetowego to: " + status);
    }

}

public class RzutowanieKlasyNaInterface {
    public static void main(String[] args){
    //Utworzenie obiektu klasy ZamowienieInternetowe.
        ZamowienieInternetowe zi1 = new ZamowienieInternetowe("Otwarte do Edycji");
        //zi1.utworzZamowienie();
        //zi1.wyswietlStatus();

        //Rzutowanie klasy na interface
        Zamowienie zamowienie2 = (Zamowienie) zi1;

        //Wywołanie metody z interface'u.
        zamowienie2.utworzZamowienie();
        zamowienie2.anulujZamowienie();
        //zamowienie2.wyswietlStatus(); - nie zadziała ponieważ po rzutowaniu na interface możemy używać tylko metod interface'u
        //Użycie metody specyficznej dla klasy nie będzie widoczne dla interface'u, bez rzutowania z powrotem na klasę.
        //zamowienie2.wyswietlStatus(); -

        //Rzutowanie z powrotem na klasę pozwoli na uzyskanie dostępu do metod specyficznych dla klasy.
        ZamowienieInternetowe zi2 = (ZamowienieInternetowe) zamowienie2;
        zi2.wyswietlStatus();




    }
}
