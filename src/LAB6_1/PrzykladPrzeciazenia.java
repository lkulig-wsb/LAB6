package LAB6_1;
//Ilustracja koncepcji przeciążenia metod w Javie.

public class PrzykladPrzeciazenia {

    //Przeciążenie metody sum.
    static int sum(int a, int b){
        return a + b;
    }
    static double sum(double a, double b){
        return a + b;
    }
    static String sum(String a, String b){
        return a + b;
    }
    public static void main(String[] args){
    //Przykład użycia przeciążoncy metod
        int wynikInt = sum(5,3);
        double wynikDouble = sum(5.7,16.9);
        String wynikString = sum("Łeło Łeło"," Bagiety Jado!");
        System.out.println("Suma liczb całkowitych: " + wynikInt);
        System.out.println("Suma liczb zmiennoprzecinkowych: " + wynikDouble);
        System.out.println("Suma Stringów: " + wynikString);

        //Trzy wersje metody sum, które róznią się typem parametrów(int, double i String).
        //Przeciążenie metody umożliwia użycie tej samej nazwy metody dla różnych typów danych. Kod
        //jest bardziej elastyczny.

    }
}
