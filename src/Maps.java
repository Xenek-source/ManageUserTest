import java.util.Scanner;
public class Maps {
    Scanner scan = new Scanner(System.in);
    public Maps[][] plansza = new Maps[3][3];
    public Maps pole;
    public Maps pion1, pion2, pion3, pion4, pion5, pion6;
    public int sa, sb, pa,pb, pa2, pb2;
    public String player1, player2;
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
            for (sa = 0; sa < plansza.length; sa++) {
                System.out.println();
                System.out.print("               A" + sa + " ");
                for (sb = 0; sb < plansza.length; sb++) {
                    pole = plansza[sa][sb];
                    if ((pole == pion1) || (pole == pion2) || (pole == pion3)) {
                        System.out.print("[O]");
                    }
                    if ((pole == pion4) || (pole == pion5) || (pole == pion6)) {
                        System.out.print("[X]");
                    }
                    if (pole == null) {
                        System.out.print("[ ]");
                    }
                }
            }
        System.out.println();
    }
public void refeshMap(String a, String b){
    System.out.println();
    System.out.println("------------- Aktualna plansza -------------");
    System.out.println();
    player1 = a;
    System.out.println("             Player 1: " + player1 + " [O]");
    drawMaps();
    System.out.println();
    player2 = b;
    System.out.println("             Player 2: " + player2 + " [X]");
    System.out.println("------------- ---------------- -------------");
}
public void movePionPlayer1() {
    System.out.println("Tura: " + player1 + "\nWybierz piona do ruchu.");
    System.out.print("A: ");
    pa = scan.nextInt();
    System.out.print("B: ");
    pb = scan.nextInt();
    if ((pa < plansza.length) && (pb < plansza.length)) {
        if (plansza[pa][pb] == null) {
            System.out.println();
            System.out.println("------------- ---------------- -------------");
            System.out.println("            ###B????d. Puste pole.");
            movePionPlayer1();
        } else {
                pole = plansza[pa][pb];
            if ((pole == pion1)||(pole == pion2)||(pole == pion3)) {
                System.out.println("Gdzie go umie??ci???");
                System.out.print("A: ");
                pa2 = scan.nextInt();
                System.out.print("B: ");
                pb2 = scan.nextInt();
                if ((pa2 < plansza.length) && (pb2 < plansza.length)) {
                    if (plansza[pa2][pb2] == null) {
                        if (((pa == pa2 + 1) || (pa == pa2 - 1) || (pa == pa2)) && ((pb == pb2 + 1) || (pb == pb2 - 1) || (pb == pb2))) {
                            plansza[pa2][pb2] = pole;
                            delPion();
                        } else {
                            System.out.println();
                            System.out.println("------------- ---------------- -------------");
                            System.out.println("            ###B????d. Za daleko.");
                            movePionPlayer1();
                        }
                    }
                    //////
                    else {
                        System.out.println();
                        System.out.println("------------- ---------------- -------------");
                        System.out.println("            ###B????d. Zaj??te pole.");
                        movePionPlayer1();
                    }
                } else {
                    System.out.println();
                    System.out.println("------------- ---------------- -------------");
                    System.out.println("        ###B????d. Wykraczasz za plansze.");
                    movePionPlayer1();
                }
            } else {
                System.out.println();
                System.out.println("------------- ---------------- -------------");
                System.out.println("      ###B????d. To nie Tw??j pionek!");
                movePionPlayer1();
            }
        }
        System.out.println();
        refeshMap(player1, player2);
        System.out.println();
        System.out.println("        ###Tura "+ player2);
        movePionPlayer2();
    }
    else {
        System.out.println();
        System.out.println("------------- ---------------- -------------");
        System.out.println("        ###B????d. Wykraczasz za plansze.");
        movePionPlayer1();
    }
}
public void movePionPlayer2() {
    System.out.println("Tura: " + player2 + "\nWybierz piona do ruchu.");
        System.out.print("A: ");
        pa = scan.nextInt();
        System.out.print("B: ");
        pb = scan.nextInt();
        if ((pa < plansza.length) && (pb < plansza.length)) {
            if (plansza[pa][pb] == null) {
                System.out.println();
                System.out.println("------------- ---------------- -------------");
                System.out.println("            ###B????d. Puste pole.");
                movePionPlayer2();
            } else {
                pole = plansza[pa][pb];
                if ((pole == pion4)||(pole == pion5)||(pole == pion6)) {
                    System.out.println("Gdzie go umie??ci???");
                    System.out.print("A: ");
                    pa2 = scan.nextInt();
                    System.out.print("B: ");
                    pb2 = scan.nextInt();
                    if ((pa2 < plansza.length) && (pb2 < plansza.length)) {
                        if (plansza[pa2][pb2] == null) {
                            if (((pa == pa2 + 1) || (pa == pa2 - 1) || (pa == pa2)) && ((pb == pb2 + 1) || (pb == pb2 - 1) || (pb == pb2))) {
                                plansza[pa2][pb2] = pole;
                                delPion();
                            } else {
                                System.out.println();
                                System.out.println("------------- ---------------- -------------");
                                System.out.println("            ###B????d. Za daleko.");
                                movePionPlayer2();
                            }
                        } else {
                            System.out.println();
                            System.out.println("------------- ---------------- -------------");
                            System.out.println("            ###B????d. Zaj??te pole.");
                            movePionPlayer2();
                        }
                    } else {
                        System.out.println();
                        System.out.println("------------- ---------------- -------------");
                        System.out.println("        ###B????d. Wykraczasz za plansze.");
                        movePionPlayer2();
                    }
                } else {
                    System.out.println();
                    System.out.println("------------- ---------------- -------------");
                    System.out.println("      ###B????d. To nie Tw??j pionek!");
                    movePionPlayer2();
                }
            }
            System.out.println();
            refeshMap(player1, player2);
            System.out.println("        ###Tura "+ player1);
            movePionPlayer1();
        }
        else {
            System.out.println();
            System.out.println("------------- ---------------- -------------");
            System.out.println("        ###B????d. Wykraczasz za plansze.");
            movePionPlayer2();
        }
    }
public void delPion(){

    plansza[pa][pb] = null;
}
}