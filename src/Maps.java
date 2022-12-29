import java.util.Scanner;
public class Maps {
    Scanner scan = new Scanner(System.in);
    public Maps[][] plansza = new Maps[3][3];
    public Maps pole;
    public Maps pion1, pion2, pion3, pion4, pion5, pion6;
    public int pa,pb;
public Maps(){
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
public void drawMaps(){
    System.out.println();
    System.out.print("                   ");
    for(int k=0;k<3;k++){
        System.out.print("B"+k+" ");
    }
        for(int i=0;i<3;i++){
            System.out.println();
            System.out.print("               A"+i+" ");
            for(int j=0;j<3;j++){
                pole = plansza[i][j];
                if((pole==pion1)||(pole==pion2)||(pole==pion3)){
                    System.out.print("[O]");
                }
                if((pole==pion4)||(pole==pion5)||(pole==pion6)){
                    System.out.print("[X]");}
                if(pole==null){
                    System.out.print("[ ]");}
            }
        }
        System.out.println();
    }
public void refeshMap(String a, String b){
    System.out.println();
    System.out.println("------------- Aktualna plansza -------------");
    System.out.print("Player 1: " + a);
    drawMaps();
    System.out.println("Player 1: " + b);
}
public void movePion(){
    System.out.println("Wybierz piona do ruchu.");
    System.out.println("A: ");
    pa = scan.nextInt();
    System.out.println("B: ");
    pb = scan.nextInt();
    pole = plansza[pa][pb];
    delPion();
    System.out.println("Gdzie go umieścić?");
    System.out.println("A: ");
    pa = scan.nextInt();
    System.out.println("B: ");
    pb = scan.nextInt();
    plansza[pa][pb] = pole;
}
public void delPion(){

    plansza[pa][pb] = null;
}
}