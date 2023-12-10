//Klasa Bazowa.
class Zwierze{
    void dajGlos(){
        System.out.println("Zwierze wydaje dźwięk!");
    }
}
//Klasa pochodna.
class Pies extends Zwierze{
    //Przesłonięcie metody dajGłos() z Klasy Zwierze.
    //Przesłonięciem umożliwiamy klasie i subklasie na dostarczenie swojej implementacji
    //dla metody która jest dziedziczona od klasy nadrzędnej.
    @Override //Przesłonięcie
    void dajGlos(){
        System.out.println("Hau hau!");
    }
}
//Kolejna klasa pochodna.
class Kot extends Zwierze{
   @Override //Przesłonięcie
    void dajGlos(){
        System.out.println("Miau miau!");
    }
}
//Kolejna klasa pochodna.
class Krowa extends Zwierze{
    @Override
    void dajGlos(){
        System.out.println("Muu muu!");
    }
}


public class Przyklad {
    public static void main(String[] args){
        System.out.println("***********************");
        //Polimorfizm - użycie obiektów różnych klas.
        Zwierze z1 = new Pies();
        Zwierze z2 = new Kot();
        Zwierze z3 = new Krowa();
        //Polimorficzne wywołanie metody dajGlos().
        z1.dajGlos();
        z2.dajGlos();
        z3.dajGlos();
        //Różne implementacje metody dajGlos() w zależności od obiektu.
        Pies p1 = new Pies();
        p1.dajGlos();

        //Użycie referencji do klasy nadrzędnej.
        Zwierze z4 = new Pies();
        z4.dajGlos();

    }
}
