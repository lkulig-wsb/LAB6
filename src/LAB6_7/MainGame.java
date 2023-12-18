package LAB6_7;

import java.io.*;
import java.io.Serializable;

//Przykład wykorzystania interfejsu Cloneable w klasie.
//Dołożenie interfaceu Comparable.
//Dołożenie implementacji interfejsu Serializable.
 class Game implements Cloneable, Comparable<Game>, Serializable {
    //Dane składowe klasy Game.
    // Numer wersji objektu, potrzebny do kontrolowania deserializacji (porównanie wersji objektu i klasy,
    // jeżeli są zgodne, to deserializacja przebiega pomyślnie)
    private static final String serialVersionUID = "VER_1";
    private String name;
    private String genre;
    private int numOfPlayers;
    //Utworzenie konstruktora klasy Game.
    public Game(String name, String genre, int numOfPlayers){
        this.name = name;
        this.genre = genre;
        this.numOfPlayers = numOfPlayers;
    }
    //Utworzenie Getterów klasy Game.
    public String getName(){
        return name;
    }
    public String getGenre() {
        return genre;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }
    //Utworzenie Setterów klasy Game.
    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }
    //Implementacja interfejsu Cloneable do klonowania objektów.
    //Przesłonięcie metody clone() z interface'u Cloneable (zapewnienie własnej implementacji).
    //Klasa Object w JAVie jest klasą po której dziedziczą inne klasy(taka klasa podstawowa).
    //Dostarcza ona podstawowe metody, wspólne dla wszystkich objektów, takie jak: toString(), clone(),
    //hashCode(), equals(), itp.
    //Wyrzucenie CloneNotSupportedException oznacza że klasa domyślnie nie obsługuje klonowania i jest konieczność
    //obsłużenia wyjątku.
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //wywołanie metody clone() z klasy nadrzędnej Object
    }

    //Utworzenie implementacji metody compareTo() z interface'u Comparable.
    //Będzie ona służyła do porównania dwóch objektów na podstawie ich liczby graczy.
    @Override
    public int compareTo(Game otherGame){

        return Integer.compare(this.numOfPlayers, otherGame.numOfPlayers);
    }
}
public class MainGame {
    public static void main(String[] args){
        //Utworzenie obiektu klasy Game.
        Game ogGame = new Game("Gran Turismo 6","Racing Game", 10);

        System.out.println("Test metody clone():");
        System.out.println("--------------------");
        try{
            //Klonowanie objektu Game.
            Game cloneGame = (Game) ogGame.clone();

            //Wypisanie dane oryginalengo obiektu i jego klonu.
            System.out.println("Original Game: " + ogGame.getName() + ", Ganre: " + ogGame.getGenre() +
                    ", Number of Players: " + ogGame.getNumOfPlayers());

            System.out.println("Clone Game: " + cloneGame.getName() + ", Ganre: " + cloneGame.getGenre() +
                    ", Number of Players: " + cloneGame.getNumOfPlayers());

            //Zmiana danych w grze oryginalnej.
            ogGame.setName("Forza Hoorizon 5");

            //Wypisanie dane oryginalengo obiektu i jego klonu po zmianie nazwy w oryginale.
            System.out.println("Original Game: " + ogGame.getName() + ", Ganre: " + ogGame.getGenre() +
                    ", Number of Players: " + ogGame.getNumOfPlayers());

            System.out.println("Clone Game: " + cloneGame.getName() + ", Ganre: " + cloneGame.getGenre() +
                    ", Number of Players: " + cloneGame.getNumOfPlayers());

            //Sklonowanie oryginalengo objektu ogGame do nowego objektu po zmianie nazwy.
            Game otherCloneGame = (Game) ogGame.clone();

            //Wypisanie danych obu objektów, ogGame po zmianie nazwy i otherCloneGame.
            System.out.println("Original Game: " + ogGame.getName() + ", Ganre: " + ogGame.getGenre() +
                    ", Number of Players: " + ogGame.getNumOfPlayers());

            System.out.println("Clone Game: " + otherCloneGame.getName() + ", Ganre: " + otherCloneGame.getGenre() +
                    ", Number of Players: " + otherCloneGame.getNumOfPlayers());

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        System.out.println("\nTest metody compareTo():");
        System.out.println("------------------------");

        //Utworzenie obiektów klasy Game.
        Game warcaby = new Game("Warcaby", "Gra planszowa",2);
        Game tysiac = new Game("Tysiąc", "Karciana",4);

        //Porównujemy gry pod kątem graczy.
        if(warcaby.compareTo(tysiac)<0){
            System.out.println("W " + warcaby.getName() + " gra mniejsza liczba graczy niż w "+
                    tysiac.getName());
        }else if (warcaby.compareTo(tysiac)>0){
            System.out.println("W " + warcaby.getName() + " gra większa liczba graczy niż w "+
                    tysiac.getName());
        }else{
            System.out.println("Zarówno w " + warcaby.getName() + " jak i w " + tysiac.getName() +
                    " gra ta sama ilość graczy");
        }


        Game poker = new Game("Poker","Gra Karciana",4);

        //Serializacja służy do przekształcania objektów na strumień bajtów celem zapisu lub przesłania siecią.
        //Sarializacja objektu.
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("game.ser"))){
            outputStream.writeObject(poker);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        //Deserializacja objektu.
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("game.ser"))){
            Game deserializedGame = (Game) inputStream.readObject();
            System.out.println("Deserialized game: " + deserializedGame);
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
