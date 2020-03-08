import java.sql.SQLOutput;

/**
 * Created by Bartłomiej Skorowski on 03.01.2020.
 */
public class CompareOperators {
    public static void main(String[] args) {
        int x =1;
        int y =10;

        System.out.println("Czy X jest większy od Y?");
        boolean isXGraterThenY = x > y;
        System.out.println(isXGraterThenY);

        boolean xEqualsY = x != y; // Czy x jest różny od Y - tak
        System.out.println("Czy X jest różny od Y?");
        System.out.println(xEqualsY);
        System.out.println(!xEqualsY);






    }
}
