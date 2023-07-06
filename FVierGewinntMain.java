package k_VierGewinnt;

import java.util.Scanner;

public class FVierGewinntMain {

    private static int w;
    private static int h;
    private static String player;
    private static String player1;

    public static void main(String[] args) {
        setup();
    }

    private static void setup() {

        System.out.println("Wählen sie eine Spielfeldgröße:");

        FVierGewinnt x7 = new FVierGewinnt(7, 7);
        FVierGewinnt x6 = new FVierGewinnt(7, 6);
        System.out.println(x7 + "\n" + x6);

        System.out.println("1 für 7x7, 2 für 7x6, 3 für eigene Größe");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size == 1) {
            w = 7;
            h = 7;
        } else if (size == 2) {
            w = 7;
            h = 6;
        } else {

            System.out.println("Geben sie die Höhe ein");
            h = sc.nextInt();
            System.out.println("Geben sie die Breite ein");
            w = sc.nextInt();
        }

        System.out.println("Geben sie den Namen von Spieler 1 ein");
        player = sc.next();

        System.out.println("Geben sie den Namen von Spieler 2 ein");
        player1 = sc.next();

        FVierGewinnt game = new FVierGewinnt(w, h, player, player1);
        System.out.println(game);

        int p = 0;

        do {
            System.out.println("Eine Zahl von 0 bis " + (w - 1) + " :");
            p = sc.nextInt();
            game.place(p);
            System.out.println(game);
        } while (!game.win());
        sc.close();
    }
}
