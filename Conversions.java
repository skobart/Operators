/**
 * Created by Bartłomiej Skorowski on 04.01.2020.
 */
public class Conversions {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.8;
        double c = a;
        int d = (int) b; // konwersja zawężająca wynik 5
        double e = (double) a; // konwersja rozszerzająca - nie potrzeba jej robić gdyż liczby całkowite mieszczą się
        // w double

        System.out.println(d);


    }
}
