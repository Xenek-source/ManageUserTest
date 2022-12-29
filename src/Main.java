//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      //  Scanner scan = new Scanner(System.in);
        ManageUser account = new ManageUser();
        Maps plansza = new Maps();
        account.addUser();
            String player1 = account.getUser1();
            String player2 = account.getUser2();
        plansza.dodajPionki1();
        plansza.dodajPionki2();
        plansza.refeshMap(player1, player2);
    }
}