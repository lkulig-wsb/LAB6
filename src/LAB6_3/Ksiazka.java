package LAB6_3;
//Utworzenie klasy Bazowej o nazwie Ksiazka.
 class Ksiazka {

    //Stworzenie metody identyfikacja() w klasie bazowej.
    public void identyfikacja(){
        System.out.println("Jestem Książką!");
    }
    public static void main(String[] args){

        //Utworzenie tablicy typu bazowego
        //i umieszczenie w niej różnych obiektów z klas pochodnych.
        Ksiazka[] ksiazki = new Ksiazka[5];
        ksiazki[0] = new Ksiazka();
        ksiazki[1] = new Kryminal();
        ksiazki[2] = new Bibliografia();
        ksiazki[3] = new Fantastyka();
        ksiazki[4] = new Romans();

        //Wypisanie elementów tablicy (obiektów klas pochodnych z metodą identyfikacja(),
        //przy użyciu pętli for each.
        for(Ksiazka ksiazka : ksiazki)
        {
            ksiazka.identyfikacja();
        }
    }
 }
 //Poniżej klasy pochodne do klasy Ksiazka.
class Kryminal extends Ksiazka{

    @Override
    public void identyfikacja() {
        System.out.println("Jestem Kryminałem!");
    }
}

class Bibliografia extends Ksiazka{
    @Override
    public void identyfikacja() {
        System.out.println("Jestem Bibliografią!");
    }
}
class Fantastyka extends Ksiazka{
    @Override
    public void identyfikacja() {
        System.out.println("Jestem Fantastyką!");
    }
}
class Romans extends Ksiazka{
    @Override
    public void identyfikacja() {
        System.out.println("Jestem Romansem!");
    }
}
