package LAB6_11;
//Klasa Bazowa o nazwie Osoba.
class Osoba{
    //Dane składowe klasy bazowej Osoba.
    private String imie;
    private String nazwisko;

    //Konstruktor klasy bazowej Osoba.
    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    //Przesłonięcie metody toString() w klasie Osoba.
    @Override
    public String toString(){
        return "Imie: " + imie + ", Nazwisko: " + nazwisko;
    }
}
//Utworznie podklasy Student.
class Student extends Osoba{
    //Dodanie prywatnego pola rokStudiów.
    private int rokStudiow;

    //Utworznie konstruktora dla podklasy Student.
    public Student(String imie, String nazwisko, int rokStudiow){
        super(imie, nazwisko);
        this.rokStudiow = rokStudiow;
    }
    //Przesłonięcie metody toString() z uwzględnieniem pola rokStudiow.
    @Override
    public String toString(){
        return  super.toString() + ", Rok studiów: " + rokStudiow;
    }

}
public class App {
    public static void main(String[] args){
        //Utworzenie objektów klasy bazowej Osoba i podklasy Student.
        Osoba osoba = new Osoba("Jan","Kowalski");
        Student student = new Student("Jeremiasz","Pędziwiatr",2);

        //Sprawdzenie uzyskania odpowiednich opisów dla
        //poszczególnych obiektów za pomocą przesłoniętej metody toString().

        System.out.println(osoba.toString());
        System.out.println(student.toString());
    }
}
