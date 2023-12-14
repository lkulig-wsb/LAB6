package LAB6_6;

public class Product {
    private String name;
    private String producer;
    private double prize;

    public Product(String name, String producer, double prize)
    {
        this.name = name;
        this.producer = producer;
        this. prize = prize;
    }

    public void dispProduct(){
        System.out.println("Product name: " + name + ", Producer: " + producer + ", Prize: " + prize + " PLN");
    }

    public static void main(String[] args){

        //Utworzenie obiektu anonimowego.
        //Objektowi anonimowemu nie nadajemy nazwy i nie deklarujemy nazwy klasy.
        // Używany do tworzenia obiektów na bieżąco, kiedy obiekt potrzebny jest jednorazowo
        // żeby wykonać jakąś specyficzną operację
        new Product("Orzechy Nerkowca 1kg", "KOL-POL", 29.79).dispProduct();
    }
}
