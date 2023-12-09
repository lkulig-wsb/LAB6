package LAB6_1;

public class Bicycle extends Vehicle {
    @Override
    public void start(){
        System.out.println("Bicycle started.");
    }
    @Override
    public void stop(){
        System.out.println("Bicycle stopped!");
    }
    @Override
    public String toString(){
        return "This is a Bicycle o-o|";
    }

}
