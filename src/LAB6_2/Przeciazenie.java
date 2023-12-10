package LAB6_2;
public class Przeciazenie {

    static double obliczPole(double a){
        return a * a;
    }

    static double obliczPole(int dlugosc, int szerokosc){
        return dlugosc * szerokosc;
    }

    static double obliczPole(double podstawa, double wysokosc){
        return (podstawa * wysokosc)/2;
    }

    public static void main(String[] args){

        double poleKwadratu = obliczPole(5.0);
        double poleProstokata = obliczPole(5,8);
        double poleTrojkata = obliczPole(6.0,4.0);

        System.out.println("Pole Kwadratu: " + poleKwadratu);
        System.out.println("Pole Prostokąta: " + poleProstokata);
        System.out.println("Pole Trójkąta: " + poleTrojkata);

    }

}
