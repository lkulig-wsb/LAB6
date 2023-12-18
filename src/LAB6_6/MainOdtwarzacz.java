package LAB6_6;
//Utworzenie interfejsu mp3Player.
//Interfejs zawiera kilka metod dotyczących operacji na odtwarzaczu mp3.
interface mp3Player{
    void play();
    void pause();
    void stop();
    void playnext();
    void playprevious();
}
//Utworznie klasy MainOdtwarzacz która zawiera metodę "main".
public class MainOdtwarzacz {
    public static void main(String[] args){
        //Klasa anonimowa interface'u mp3Player.

        //Utworzenie objektu klasy anonimowej. Klasa implementuje interfejs mp3Player.
        mp3Player anonymousPlayer = new mp3Player() {

        //Klasa anonimowa to taka która definiowana jest bezpośrednio w miejsu użycia (nie nadajemy jej nazwy).

            //Utworzenie danych składowy klasy anonimowej + inicjalizacja ich wartości.
            private String currentTrack = "Killing In the Name";
            private String artist = "Rage Against the Machine";
           //Dostarczenie własnej implementacji dla metod() implementowanych z interfejsu mp3Player.
            @Override
            public void play() {
                System.out.println("< Playing: " + " Song - " + currentTrack
                        + ", Artist - " + artist + " >");
            }
            @Override
            public void pause() {
                System.out.println("Player paused.");
            }
            @Override
            public void stop() {
                System.out.println("Player stopped!");
            }
            @Override
            public void playnext() {
                System.out.println("Switching to next track!");
            }
            @Override
            public void playprevious() {
                System.out.println("Switching to previous track!");
            }
        };
        //Wywołanie metod z klasy anonimowej

        anonymousPlayer.play();
        anonymousPlayer.pause();
        anonymousPlayer.playnext();
    }
}
