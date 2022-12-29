//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      //  Scanner scan = new Scanner(System.in);
        ManageUser account = new ManageUser();
        Maps plansza = new Maps();
        account.addUser();
        plansza.dodajPionki1();
        plansza.dodajPionki2();
        System.out.println();
        System.out.println("------------- Aktualna plansza -------------");
        account.getUser1();
        plansza.drawMaps();
        account.getUser2();
    }
}