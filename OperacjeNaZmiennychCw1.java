import java.util.Random;

/**
 * Created by Bartłomiej Skorowski on 04.01.2020.
 */
public class OperacjeNaZmiennychCw1 {
    public static void main(String[] args) {
        Random r = new Random();

        int x = r.nextInt(11) + 1;
        int y = r.nextInt(11) + 1;

        System.out.println("Wylosowana liczba X to: " + x);
        System.out.println("Wylosowana liczba Y to: " + y);

        boolean result = x > y;
        System.out.println("Czy x jest większe od y? : " + result);

        System.out.println((x * 2) + " > " + y);
        System.out.println("Czy x pomnożone przez 2 jest większe od y?: " + ((x * 2) > y));

        System.out.println(y + " < " + (x + 3));
        System.out.println("Czy y jest mniejsze od sumu x + 3? : " + (y < (x + 3)));

        System.out.println((x * y) % 2 == 0);
        System.out.println("Czy iloczyn liczb x i y jest parzysty? : " + ((x * y) % 2 == 0));

        System.out.println("Inny sposób kodowania");



        result = (x * 2) > y;
        System.out.println("Czy x pomnożone przez 2 jest większe od y?: " + result);

        result = y < (x + 3) && y > (x - 2);
        System.out.println("Czy y jest mniejsze od sumy x + 3 i jednocześnie większe od x pomniejszonego o 2? : " + result);

        result = ((x * y) % 2 == 0);
        System.out.println("Czy iloczyn liczb x i y jest parzysty? : " + result);


    }




}
