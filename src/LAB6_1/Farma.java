package LAB6_1;
abstract class Animal{
    abstract void dajGlos();
}
public class Farma {
    public static void main(String[] args){
        //Obiekt anonimowy. Dziedziczy po klasie abstrakcyjnej Animal
        Animal kura = new Animal() {
            @Override
            void dajGlos() {
                System.out.println("koko koko");
            }
        };
        //Wywołanie metody obiektu anonimowego.
        kura.dajGlos();
    }
}
