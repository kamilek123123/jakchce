import java.util.Scanner;

public class zadanie12 {
    public static void main(String[] args) {
        float kilometry;
        System.out.println("Podaj liczbe przejechanych kilometrow : ");
        Scanner dane = new Scanner(System.in);
        kilometry = dane.nextInt();

        float paliwo;
        System.out.println("Podaj liczbe zuzytego paliwa : ");
        paliwo = dane.nextInt();

        double kmlitr = kilometry/paliwo;
        System.out.println("Liczba km przejechanych na litrze wynosi : " + kmlitr);
    }
}