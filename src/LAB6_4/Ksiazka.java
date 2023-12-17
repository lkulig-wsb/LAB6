package LAB6_4;

import java.util.*;

//Klasa implementuje interface Comparalbe do porównywania obiektów.
class Ksiazka implements Comparable<Ksiazka>{
    //Dane składowe klasy Książka.
    private String tytul;
    private String autor;
    private int rokWydania;
    private String gatunek;
    //Konstruktor klasy Książka.
    public Ksiazka(String tytul, String autor, int rokWydania, String gatunek)
    {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.gatunek = gatunek;
    }
    //Gettery
    public String getTytul(){return tytul;}

    public String getAutor() {
        return autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public String getGatunek() {
        return gatunek;
    }
    //Przesłonięcie metody toString(). Klasa toString() pochodzi z klasy Object.
    // Wszystkie klasy dziedziczą z klasy Object. Jeśli nie przesłonimy metody toSring(),
    //to odziedziczymy domyślną implementację z klasy Object, czyli ciąg znaków z nazwą klasy objektu
    //oraz jesgo adres w pamięci. Poniżej dostarczamy implementację dla klasy Ksiazka.

    @Override
    public String toString(){
        return "Książka: " + tytul + ", Autor: " + autor + ", Rok Wydania:"
                + rokWydania + ", Gatunek: " + gatunek;
    }
    //Przesłonięcie metody compareTo(), która porównuje objekty na podstawie roku wydania.
    //Metoda pochodzi z interfejsu Comparable. Metoda porównuje bieżący objekt z objektem przekazanym jako argument.
    //Metoda zwraca liczbę całkowitą, która określa czy objekt jest mniejszy, większy lub równy objektowi przekazanemu.
    @Override
    public int compareTo(Ksiazka other){
        return Integer.compare(this.rokWydania, other.rokWydania);
    }
    //Utworzenie metody equals() do porównywania zawartości objektów.
    //Przesłonięcie metody gdyż pochodzi z klasy Object. Domyślna implementacja porównuje referencję objektów.
    //Przesłonięcie umożliwia porównanie zawartości objektów, a dokładnie pól rokWydania, tytul, autor i gatunek.
    @Override
    public boolean equals(Object obj){
        if(this == obj){ //porównanie referencji objektów (bieżący do przekazanego)
            return true;//jeżeli objekty są równe dalsze porównania są niekonieczne (optymalizacja)
        }
        if(obj==null||getClass() != obj.getClass()){ //czy objekt przekazany niej jest nullem/instancją tej samej klasy
            return false;
        }
        Ksiazka other = (Ksiazka) obj; // Przekształcenie przek. obj. na objekt klasy Ksiazka.
        //Porównanie pól objektu bieżącego (this) z polami objektu przekazanego jako argument.
        return rokWydania == other.rokWydania &&
                Objects.equals(tytul,other.tytul)&&
                Objects.equals(autor,other.autor)&&
                Objects.equals(gatunek,other.gatunek);
    }

    //Implementacja interfejsu Comparator do porównania objektów na podstawie rokuWydania, gatunku i autora:
    class ComparatorRokWydania implements Comparator<Ksiazka>{
        @Override
        public int compare(Ksiazka k1, Ksiazka k2){
            return Integer.compare(k1.getRokWydania(),k2.getRokWydania());
        }
    }

    class ComparatorGatunek implements Comparator<Ksiazka>{
        @Override
        public int compare(Ksiazka k1, Ksiazka k2){
            return k1.getGatunek().compareTo(k2.getGatunek());
        }
    }

    class ComparatorAutor implements  Comparator<Ksiazka>{
        @Override
        public int compare(Ksiazka k1, Ksiazka k2){
            return k1.getAutor().compareTo(k2.getAutor());
        }
    }


    public static void main(String[] args){

        //Utworzenie obiektów klasy książka.
        Ksiazka k1 = new Ksiazka("Wiedźmin","Andrzej Sapkowski",1990,"Fantasy");
        Ksiazka k2 = new Ksiazka("Wiedźmin","Andrzej Sapkowski",1990,"Fantasy");
        Ksiazka k3 = k2;
        Ksiazka k4 = new Ksiazka("Moby Dick","Herman Melville",1851,"Powieść");
        Ksiazka k5 = new Ksiazka("Skaza","Magdalena Tulli",2006,"Fabularna");
        Ksiazka k6 = new Ksiazka("Lala","Jacek Dehnel",2006,"Fabularna");
        //Wyświetlenie zawartości obiektów.
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        System.out.println(k4);


        //Porównanie referencj:
        //Za pomocą operatora "==" porównamy referencje (czy wskazują na to samo miejsce w pamięci) obiektów klasy.
        System.out.println();
        System.out.println("Porównanie referencji.");
        System.out.println("----------------------");
        System.out.println(k1==k2);
        System.out.println(k3==k2);
        //Porównanie zawartości obiektów:
        //Użycie metody equals do porównania zawartości obiektów a nie ich referencji.
        System.out.println();
        System.out.println("Porównanie zawartości obiektów - equals().");
        System.out.println("------------------------------------------");
        System.out.println(k1.equals(k2));
        System.out.println(k2.equals(k3));
        System.out.println(k2.equals(k4));
        //Porównanie przez interface Comparable.
        System.out.println();
        System.out.println("Porównanie obiektów przy pomocy interface'u Comparable");
        System.out.println("------------------------------------------------------");
        int wynik = k5.compareTo(k6);
        if(wynik < 0) {
            System.out.println(k5.getTytul() + " została wydana wcześniej niż " + k6.getTytul());
        }else if (wynik >0){
            System.out.println(k5.getTytul() + " została wydana póżniej niż " + k6.getTytul());
        }else {
            System.out.println(k5.getTytul() + " i " + k6.getTytul() + " zostały wydane w tym samym roku, czyli " + k5.getRokWydania() );
        }
        //Przyklad 2
        int wynik2 = k1.compareTo(k4);
        if(wynik2 < 0) {
            System.out.println(k1.getTytul() + " została wydana wcześniej niż " + k4.getTytul());
        }else if (wynik2 >0){
            System.out.println(k1.getTytul() + " została wydana póżniej niż " + k4.getTytul());
        }else {
            System.out.println(k1.getTytul() + " i " + k4.getTytul() + " zostały wydane w tym samym roku, czyli " + k4.getRokWydania() );
        }
        System.out.println();
        //Comparator
        //Użycie ComparatorGatunek do porównania obiektów i posortowania po gatunku.
        System.out.println("Comparator do sortowania obiektów.");
        System.out.println("----------------------------------");
        //Utworznie ArrayList<>
        List<Ksiazka> ksiazki = new ArrayList<>();
        //Dodanie obiektów do Listy.
        ksiazki.add(k1);
        ksiazki.add(k4);
        ksiazki.add(k5);
        ksiazki.add(k6);
        //Wyświetlenie listy przed sortowaniem.
        System.out.println("Przed sortowaniem:");
        for(Ksiazka ksiazka : ksiazki){
            System.out.println(ksiazka);
        }
        //Użycie Comparatora do porównania i posortowania obiektów pod kątem gatunku.
        Comparator<Ksiazka> gatunekComparator = Comparator.comparing(Ksiazka::getGatunek);
        Collections.sort(ksiazki, gatunekComparator);
        //Wyświetlenie listy posortowanej po gatunku
        System.out.println("Po sortowaniu:");
        for(Ksiazka ksiazka : ksiazki){
            System.out.println(ksiazka);
        }
    }
}
