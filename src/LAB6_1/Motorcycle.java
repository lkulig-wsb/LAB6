package LAB6_1;

public class Motorcycle extends Vehicle{
    @Override
    public void start(){
        System.out.println("Motorcycle started.");
    }
    @Override
    public void stop(){
        System.out.println("Motorcycle stopped!");
    }
    @Override
    public String toString(){
        return "This is a Motorcycle <o-o>";
    }
}
