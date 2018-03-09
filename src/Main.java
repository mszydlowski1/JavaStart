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
        result = x > y;
        System.out.println(result);
        System.out.print("Czy x jest wieksze od y?");
        result = x > y;
        System.out.println(result);
        System.out.print("Czy x jest wieksze od y?");
        result = x > y;
        System.out.println(result);


    }
}
