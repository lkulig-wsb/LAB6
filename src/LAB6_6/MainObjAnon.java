package LAB6_6;
//Utworzenie interface'u.
interface Zadanie {
    void wykonaj();
}

public class MainObjAnon {
    public static void main(String[] args){

        //Używamy obiektu anonimowego dla interfaceu Zadanie.
        //Objekt anonimowy implementuje interface Zadanie i wykonuje jednorazową implementację metody wykonaj().
        //Objekt anonimowy umożliwia implementację interfaceu bez tworzenia klasy.
        //Objekt anonimowy umożliwia rozbudowe implementacji interface'u (dostosowanie do aktualnych potrzeb).

        //Utworzenie objektu anonimowego dla interfaceu Zadanie.
        Zadanie odliczanieObj = new Zadanie() {
            @Override
            public void wykonaj() {
                System.out.println("Rozpoczynam odliczanie.");
                //Odliczanie
                for(int i = 10; i > 0; i--){
                    System.out.println(i + " sec" );
                    try{
                        Thread.sleep(1000);//opóźnienie (co sekundę)
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("\nStart!!!");
            }
        };
        //Wywołanie metody start przy pomocy obiektu anonimowego.
        odliczanieObj.wykonaj();
    }
}
