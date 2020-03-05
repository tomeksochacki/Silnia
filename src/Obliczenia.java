import java.util.Scanner;

public class Obliczenia {

    public static int silnia(int liczba) {
        int silnia = 1;
        for (int i = 1; i <= liczba; i++) {
            silnia = silnia * i;
        }
        return silnia;
    }

    public static void main(String[] args) {
        System.out.println("Podaj dodatnią liczbę całkowitą");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();


        System.out.println("Silnia z liczby " + a + " wynosi " + silnia(a));

    }
}
