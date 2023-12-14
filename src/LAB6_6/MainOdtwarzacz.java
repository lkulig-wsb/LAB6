package LAB6_6;

import java.sql.SQLOutput;

interface mp3Player{
    void play();
    void pause();
    void stop();
    void playnext();
    void playprevious();
}

public class MainOdtwarzacz {
    public static void main(String[] args){

        //Klasa anonimowa interface'u mp3Player.
        mp3Player anonymousPlayer = new mp3Player() {

            private String currentTrack;
            @Override
            public void play() {
                System.out.println("Playing " + currentTrack);
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
    }
}
