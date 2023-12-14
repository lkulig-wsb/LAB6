package LAB6_6;

interface JakisInterface{
    void jakasMtoda();
}
public class MainAnonimowy1 {
    public static void main(String[] args){
        JakisInterface jednorazowyObj = new JakisInterface() {
            @Override
            public void jakasMtoda() {
                System.out.println("Będę użyty jednorazow!");
            }

        };
        //Wywołanie metody z obiektu anonimowego
        jednorazowyObj.jakasMtoda();
    }

}
