import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args)
  {
    String Imie;
    String Nazwisko;
    System.out.print("Wczytwyanie danych...\n");
    System.out.print("Podaj Imie: ");
    Scanner odczyt = new Scanner(System.in);
    Imie = odczyt.nextLine();
    System.out.print("Podaj Nazwisko: ");
    Nazwisko = odczyt.nextLine();
    System.out.println("Twoje imie i nazwisko: " +Imie +" " +Nazwisko);
  }
}