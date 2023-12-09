package LAB6_1;

public class VehicleMain {
    public static void main(String[] args){

        Vehicle[] vehicles = {new Bicycle(), new Motorcycle(), new Car()};

        //Pętla przechodzi przez tablicę vehicles i wywoła metodę start() dla każdego obiektu.
        for (Vehicle vehicle : vehicles){
            vehicle.start();
        }
        System.out.println("\n----------------");

        System.out.println(vehicles[0].toString()); //wywołanie metody toString() dla obiektu klasy Bicycle.
        System.out.println(vehicles[1].toString()); //wywołanie metody toString() dla obiektu klasy Motorcycle.
        System.out.println(vehicles[2].toString()); //wywołanie metody toString() dla obiektu klasy Car.
        System.out.println("\n****************");
        vehicles[0].stop(); //wywołanie metody stop() dla obiektu klasy Bicycle.
        vehicles[1].stop(); //wywołanie metody stop() dla obiektu klasy Motorcycle.
        vehicles[2].stop(); //wywołanie metody stop() dla obiektu klasy Car.

    }
}
