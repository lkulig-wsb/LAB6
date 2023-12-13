package LAB6_3;

 class Ksiazka {

    public void identyfikacja(){
        System.out.println("Jestem Książką!");
    }
    public static void main(String[] args){
        Ksiazka[] ksiazki = new Ksiazka[5];
        ksiazki[0] = new Ksiazka();
        ksiazki[1] = new Kryminal();
        ksiazki[2] = new Bibliografia();
        ksiazki[3] = new Fantastyka();
        ksiazki[4] = new Romans();

        for(Ksiazka ksiazka : ksiazki)
        {
            ksiazka.identyfikacja();
        }
    }
 }
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
