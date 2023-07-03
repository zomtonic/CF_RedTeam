package I_VierGewinnt;

import java.util.Scanner;

public class VierGewinntMain {
    public static void main(String[] args) {
        setup();
    }

    public static void setup() {

        System.out.println("Wählen sie eine Spielfeldgröße:");

        VierGewinnt x7 = new VierGewinnt(7, 7);
        VierGewinnt x6 = new VierGewinnt(7, 6);
        System.out.println(x7 + "\n" + x6);

        System.out.println("1 für 7x7, 2 für 7x6, 3 für eigene Größe");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size == 1) {
            VierGewinnt game = new VierGewinnt(7, 7);
        } else if (size == 2) {
            VierGewinnt game = new VierGewinnt(7, 6);
        } else {
            System.out.println("Geben sie die Breite ein");
            int w = sc.nextInt();
            System.out.println("Geben sie die Höhe ein");
            int h = sc.nextInt();
            VierGewinnt game = new VierGewinnt(7, 6);
        }

        System.out.println("Geben sie den Namen von Spieler 1 ein");
        String player = sc.next();

        System.out.println("Geben sie den Namen von Spieler 2 ein");
        String player1 = sc.next();

    }
}
