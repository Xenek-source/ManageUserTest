//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      //  Scanner scan = new Scanner(System.in);
        ManageUser account = new ManageUser();
        Maps plansza = new Maps();
        account.addUser();
        plansza.toMaps(account.getUser1(),account.getUser2());
        plansza.drawMaps();

    }
}