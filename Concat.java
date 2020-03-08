import org.w3c.dom.ls.LSOutput;

import java.util.Random;

/**
 * Created by Bartłomiej Skorowski on 04.01.2020.
 */
public class Concat {
    public static void main(String[] args) {
        Random random = new Random();
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;
        String s4 = "Prawda";
        String s5 = "Fałsz";

        System.out.println(s3);

        int x = random.nextInt(10);
        int y = random.nextInt(10);
        int sum = x + y;

        System.out.println(x + " + " + y + " = " + sum);

        System.out.println(x + y + " to wynik sumowania");
        System.out.println("Wynik sumowania to " + (x + y)); // inna kolejność dodatkowe nawiasy

        System.out.println("Prawda to w programowaniu wartość " + true);

        System.out.println("Czy x jest większe od zera?" + (x > 0));

        if (x > 0) System.out.println(s4); // własne przemyślenia
        if (x < 0) System.out.println(s5); // własne przemyślenia




    }
}
