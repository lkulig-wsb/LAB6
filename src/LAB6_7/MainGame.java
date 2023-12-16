package LAB6_7;

//Przykład wykorzystania interfejsu Cloneable w klasie.
 class Game implements Cloneable{
    //Dane składowe klasy Game.
    private String name;
    private String ganre;
    private int numOfPlayers;
    //Utworzenie konstruktora klasy Game.
    public Game(String name, String ganre, int numOfPlayers){
        this.name = name;
        this.ganre = ganre;
        this.numOfPlayers = numOfPlayers;
    }
    //Utworzenie Getterów klasy Game.
    public String getName(){
        return name;
    }
    public String getGanre() {
        return ganre;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }
    //Utworzenie Setterów klasy Game.
    public void setName(String name) {
        this.name = name;
    }

    public void setGanre(String ganre) {
        this.ganre = ganre;
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
}
public class MainGame {
    public static void main(String[] args){
        //Utworzenie obiektu klasy Game.
        Game ogGame = new Game("Gran Turismo 6","Racing Game", 10);

        try{
            //Klonowanie objektu Game.
            Game cloneGame = (Game) ogGame.clone();

            //Wypisanie dane oryginalengo obiektu i jego klonu.
            System.out.println("Original Game: " + ogGame.getName() + ", Ganre: " + ogGame.getGanre() +
                    ", Number of Players: " + ogGame.getNumOfPlayers());

            System.out.println("Clone Game: " + cloneGame.getName() + ", Ganre: " + cloneGame.getGanre() +
                    ", Number of Players: " + cloneGame.getNumOfPlayers());

            //Zmiana danych w grze oryginalnej.
            ogGame.setName("Forza Hoorizon 5");

            //Wypisanie dane oryginalengo obiektu i jego klonu po zmianie nazwy w oryginale.
            System.out.println("Original Game: " + ogGame.getName() + ", Ganre: " + ogGame.getGanre() +
                    ", Number of Players: " + ogGame.getNumOfPlayers());

            System.out.println("Clone Game: " + cloneGame.getName() + ", Ganre: " + cloneGame.getGanre() +
                    ", Number of Players: " + cloneGame.getNumOfPlayers());

            //Sklonowanie oryginalengo objektu ogGame do nowego objektu po zmianie nazwy.
            Game otherCloneGame = (Game) ogGame.clone();

            //Wypisanie danych obu objektów, ogGame po zmianie nazwy i otherCloneGame.
            System.out.println("Original Game: " + ogGame.getName() + ", Ganre: " + ogGame.getGanre() +
                    ", Number of Players: " + ogGame.getNumOfPlayers());

            System.out.println("Clone Game: " + otherCloneGame.getName() + ", Ganre: " + otherCloneGame.getGanre() +
                    ", Number of Players: " + otherCloneGame.getNumOfPlayers());

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }



    }
}
