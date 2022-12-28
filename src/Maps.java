import java.util.Scanner;
public class Maps {
    Scanner scan = new Scanner(System.in);
    public User[][] plansza = new User[3][3];
    public User pole;
    public String user1, user2;

public Maps(){
}
public void drawMaps(){
    for(int i=0;i<3;i++){
        System.out.println();
        for(int j=0;j<3;j++){
            pole = plansza[i][j];
            if(pole==null){
                System.out.print("[ ]");
            }
        }
    }
}
public void toMaps(String a,String b){
        user1 = user1;
        user2 = user2;
    }
public void setMaps(){

    }
}