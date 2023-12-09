package LAB6_1;

public class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Car started.");
    }
    @Override
    public void stop(){
        System.out.println("Car stopped!");
    }
    @Override
    public String toString(){
        return "This is a car {o-o]";
    }
}
