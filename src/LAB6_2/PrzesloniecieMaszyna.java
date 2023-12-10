package LAB6_2;
abstract class Maszyna{
    abstract void uruchomienie();

    void zatrzymanie(){
        System.out.println("Zatrzymanie maszyny");
    }
}
class Blender extends Maszyna{
    @Override
    void uruchomienie(){
        System.out.println("Blender został uruchomiony.");
    }
    void miksowanie(){
        System.out.println("Blender miksuje!");
    }
}
class Kuchenka extends Maszyna{
    @Override
    void uruchomienie(){
        System.out.println("Kuchenka została uruchomiona.");
    }
    void pieczenie(){
        System.out.println("Kuchenka piecze.");
    }
}

public class PrzesloniecieMaszyna {
    public static void main(String[] args){
        Blender b = new Blender();
        Kuchenka k = new Kuchenka();

        b.uruchomienie(); //Wywołanie przesłoniętej metody z klasy Blender.
        k.uruchomienie(); //Wywołanie przesłoniętej metody z klasy Kuchenka.
        System.out.println();
        b.miksowanie(); //Wywołanie specyficznej metody dla klasy Blender.
        k.pieczenie(); //Wywołanie specyficznej metody dla klasy Kuchenka.
        System.out.println();
        b.zatrzymanie(); //Wywołanie dzidziczonej metody z klasy bazowej Maszyna.
        k.zatrzymanie(); //Wywołanie dzidziczonej metody z klasy bazowej Maszyna.

    }
}
