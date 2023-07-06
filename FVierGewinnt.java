package k_VierGewinnt;

public class FVierGewinnt {
    private boolean win = false;
    private int arr[][];
    private int width;
    private int height;
    private int turn = (int) Math.round(Math.random());
    private String players[] = new String[2];

    public FVierGewinnt(int width, int height, String player, String player1) {
        this.players[0] = player;
        this.players[1] = player1;
        this.width = width;
        this.height = height;
        this.arr = new int[height][width];
        this.init();
    }

    public FVierGewinnt(int width, int height) {
        this.width = width;
        this.height = height;
        this.arr = new int[height][width];
        this.init();
    }

    public void init() {
        for (int h = 0; h < arr.length; h++) {
            for (int w = 0; w < arr[h].length; w++) {
                this.arr[h][w] = 0;
            }
        }
    }

    public String toString() {
        String s = "";
        for (int h = 0; h < arr.length; h++) {
            for (int w = 0; w < arr[h].length; w++) {
                int val = this.arr[h][w];
                if (val == 0) {
                    s = s + ". ";
                } else if (val == 1) {
                    s = s + "x ";
                } else {
                    s = s + "o ";
                }
            }
            s = s + "\n";
        }
        s = players[0] != null ? s + "Spieler am Zug: " + players[turn] : s;
        if (win) {
            turn();
            s = s + "\n " + "Spieler " + players[turn] + " hat gewonnen";
        }
        return s;
    }

    public void turn() {
        turn = turn == 1 ? 0 : 1;
    }

    public String getturn() {
        return players[turn];
    }

    public void place(int row) {
        int pos = -1;
        /*
         * if (row < 0) {
         * pos = arr[0][0];
         * row = 0;
         * }
         * 
         * if (row > width - 1) {
         * pos = arr[0][width - 1];
         * row = width - 1;
         * }
         */
        row = row < 0 ? 0 : row;
        row = row > width - 1 ? width - 1 : row;
        pos = arr[0][row];
        int w = 0;
        if (pos == 0) {
            arr[0][row] = this.turn;
            for (w = 0; w < arr.length - 1; w++) {
                pos = arr[w + 1][row];
                if (pos == 0) {
                    pos = arr[w][row];
                    arr[w][row] = 0;
                    arr[w + 1][row] = turn + 1;
                } else {
                    break;
                }
            }
        }
        win = win(w, row);
        turn();
    }

    public boolean win() {
        return win;
    }

    private boolean win(int y, int x) {
        System.out.println("Cunt" + y + " " + x);
        int pos = arr[y][x];
        if (y < height - 3 && arr[y + 1][x] == pos) {
            System.out.println("checking down");
            return (check(y, x, +1, 0));
        }
        if (x > 2 && arr[y][x - 1] == pos) {
            System.out.println("checking left: " + players[turn]);
            return (check(y, x, 0, -1));
        }
        if (x < width - 3 && arr[y][x + 1] == pos) {
            System.out.println("checking right");
            return (check(y, x, 0, +1));
        }
        if (y < height - 3 && x > 2 && arr[y + 1][x - 1] == pos) {
            System.out.println("checking diagonal left");
            return (check(y, x, +1, -1));
        }
        if (y < height - 3 && x < width - 1 && arr[y + 1][x + 1] == pos) {
            System.out.println("checking diagonal right");
            return (check(y, x, +1, +1));
        }
        return false;
    }

    private boolean check(int y, int x, int ydir, int xdir) {
        int count = 1;
        do {
            y += ydir;
            x += xdir;
            int val = arr[y][x];
            if (val == turn + 1) {
                count++;
                System.out.println("checking x:" + x + " y:" + y + ". y+" + ydir + " x+" + xdir);
            } else {
                return count < 4 ? false : true;
            }
        } while (count < 4);
        return count < 4 ? false : true;
    }
}