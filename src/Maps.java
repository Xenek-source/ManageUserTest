import java.util.Scanner;
public class Maps {
    Scanner scan = new Scanner(System.in);
    public Maps[][] plansza = new Maps[3][3];
    public Maps pole;
    public String user1, user2;
    public Maps pion1, pion2, pion3, pion4, pion5, pion6;

public Maps(){
}
public void userAdd(String a,String b){
        user1 = a;
        user2 = b;
    }
public void dodajPionki1(){
    pion1 = new Maps();
    plansza[0][0] = pion1;
    pion2 = new Maps();
    plansza[0][1] = pion2;
    pion3 = new Maps();
    plansza[0][2] = pion3;
    }
public void dodajPionki2(){
    pion4 = new Maps();
    plansza[2][0] = pion4;
    pion5 = new Maps();
    plansza[2][1] = pion5;
    pion6 = new Maps();
    plansza[2][2] = pion6;
    }
/*public void getPion(){
    System.out.print(plansza[0][0]);
}*/
public void drawMaps(){
    System.out.println();
    System.out.print("                   ");
    for(int k=0;k<3;k++){
        System.out.print("A"+k+" ");
    }
        for(int i=0;i<3;i++){
            System.out.println();
            System.out.print("               A"+i+" ");
            for(int j=0;j<3;j++){
                pole = plansza[i][j];
                if(pole==null){
                    System.out.print("[ ]");
                } else {
                    System.out.print("[x]");
                }
            }
        }
        System.out.println();
    }
}