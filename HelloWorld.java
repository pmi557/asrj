import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args)
  {
    String Imie;
    System.out.print("Wczytwyanie danych...Podaj Imie: ");
    Scanner odczyt = new Scanner(System.in);
    Imie = odczyt.nextLine();
    System.out.print("Twoje imie to: " +Imie);
  }
}