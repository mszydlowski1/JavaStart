

public class Calculator {

    double add (double a, double b)
    {
        double wynik = a + b;
        return wynik;
    }

    double subtract (double a, double b)
    {
        double wynik = a - b;
        return wynik;
    }

    double add (double a, double b, double c)
    {
        return add(a, b) +c;
    }

    double subtract (double a, double b, double c)
    {
        return subtract(a, b) -c;
    }

//    double multiply (double a, double b)
//    {
//        double wynik = a * b;
//        return wynik;
//    }
//
//    double divide (double a, double b)
//    {
//        double wynik = a / b;
//        return wynik;
//    }



}
