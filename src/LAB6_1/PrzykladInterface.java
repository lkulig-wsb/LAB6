package LAB6_1;

interface Client{
    //Metoda pobierająca nazwę klienta
    String getName();
    //Metoda pobierająca adres klienta.
    String getAddress();
    //Metoda pobierająca rabat.
    double getDiscount();
    //Metoda wyświetlająca info o kliencie.
    void dispInfo();
}
//Klasa która implementuje interface Client.
class LocalClient implements Client{
    private String name;
    private String address;
    private double discount;
    //Konstruktor.
    public LocalClient(String name, String address, double discount){
        this.name=name;
        this.address=address;
        this.discount=discount;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String getAddress(){
        return address;
    }
    @Override
    public double getDiscount(){
        return discount;
    }
    @Override
    public void dispInfo(){
        System.out.println("Local Klient Info:");
        System.out.println("------------------");
        System.out.println("Name:" + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Discount: " + getDiscount() + "%");
    }
}
class BusinessClient implements Client{
    private String companyName;
    private String companyAddress;
    private double discount;

    public BusinessClient (String companyName, String companyAddress, double discount){
        this.companyName=companyName;
        this.companyAddress=companyAddress;
        this.discount=discount;
    }
    @Override
    public String getName(){
        return companyName;
    }
    @Override
    public String getAddress(){
        return companyAddress;
    }
    @Override
    public double getDiscount(){
        return discount;
    }
    @Override
    public void dispInfo(){
        System.out.println("Business Klient Info:");
        System.out.println("------------------");
        System.out.println("Company Name:" + getName());
        System.out.println("Company Address: " + getAddress());
        System.out.println("Discount: " + getDiscount() + "%");
    }

}

public class PrzykladInterface {
    public static void main(String[] args){
        Client lk1 = new LocalClient("Jan Kowalski","Falkowska 13",15.0);
        Client bk1 = new BusinessClient("Hammers LTD","Munster Road 122",45);

        lk1.dispInfo();
        System.out.println();
        bk1.dispInfo();
    }
}
