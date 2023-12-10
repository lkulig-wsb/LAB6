interface JakisInterface{
    void jakasMetoda();
}
public class Anonimowy {
    public static void main(String[] args){

        //Utworzenie obiektu anonimowego implementującego interface.
        JakisInterface jakisObiekt = new JakisInterface() {
            @Override
            public void jakasMetoda() {
                System.out.println("Implementacja metody jakasMetoda().");
            }
        };
        //Wywołanie metody z obiektu anonimowego.
        jakisObiekt.jakasMetoda();
    }
}
