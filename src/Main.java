import java.util.Random;

public class Main {

    public static void main(String[] args) {
        boolean result;
        Random rand = new Random();
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);



        System.out.print("Czy x jest wieksze od y?");
        result = x > y;
        System.out.println(result);
        System.out.print("Czy x pomnozone przez 2 jest wieksze od y?");
        result = 2*x > y;
        System.out.println(result);
        System.out.print("Czy y jest mniejsze od sumy  x+3 i jednoczesnie wieksze od x pomniejszonego o 2?");
        result = x+3 > y && y > x-2;
        System.out.println(result);
        System.out.print("Czy iloczyn x i y jest parzysty?");
        result = (x*y%2)==0;
        System.out.println(result);


    }
}
