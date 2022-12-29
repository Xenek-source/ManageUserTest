import java.util.Scanner;
public class ManageUser {
    Scanner scan = new Scanner(System.in);
    public String[] userTab = new String[2];
    public User user1, user2;

    public ManageUser() {
    }
    public void addUser(){
        System.out.print("Podaj nazwę User1: "); String name1 = scan.nextLine();
        System.out.print("Podaj nazwę User2: "); String name2 = scan.nextLine();
        user1 = new User(name1);
        user2 = new User(name2);
        userTab[0] = user1.getUser();
        userTab[1] = user2.getUser();
    }
    public String getUser1(){
        return userTab[0];
    }
    public String getUser2(){
        return userTab[1];
    }
}
