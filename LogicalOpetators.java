/**
 * Created by Bartłomiej Skorowski on 03.01.2020.
 */
public class LogicalOpetators {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("Czy X jest mniejsze od 0 lub Y jest większe od 0?");
        System.out.println(x < 0);
        System.out.println(y > 0);
        System.out.println(x < 0 || y > 0);

        y -= 20;
        System.out.println(x < 0 || y > 0);


        y += 20;
        System.out.println("Czy X jest mniejsze od 0 i (jednocześnie) Y jest większe od 0?");
        System.out.println(x < 0 && y > 0);
        System.out.println(x > 0 && y > 0);
        System.out.println(y);


    }
}
