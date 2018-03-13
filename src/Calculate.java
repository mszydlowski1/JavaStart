import java.util.Random;

public class Calculate {

    public static void main(String[] args) {
        double a = 2.44;
        double b = 3.33;

        Calculator calc = new Calculator();
        double wynik = calc.add(a,b);
        System.out.println("wynik dodawania to  " + wynik);

        wynik = calc.subtract(a,b);
        System.out.println("wynik odejmowania to  " + wynik);

        wynik = calc.multiply(a,b);
        System.out.println("wynik mnozenia to  " + wynik);

        wynik = calc.divide(a,b);
        System.out.println("wynik dzielenia to  " + wynik);
    }
}
