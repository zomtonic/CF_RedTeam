package I_VierGewinnt;

public class VierGewinnt {
    private int arr[][];
    private int width;
    private int height;
    private int turn = (int) Math.round(Math.random());

    public VierGewinnt(int width, int height) {
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
                    s = s + "O ";
                }
            }
            s = s + "\n";
        }
        return s;
    }

    public void turn() {
        if (this.turn == 0) {
            this.turn = 1;
        } else {
            this.turn = 0;
        }
    }

    public void place(int row) {
        int pos = -1;
        if (row < arr[0].length && row >= 0)
            pos = arr[0][row];

        if (pos == 0) {
            arr[0][row] = this.turn;
            for (int w = 0; w < arr.length - 1; w++) {
                pos = arr[w + 1][row];
                if (pos == 0) {
                    pos = arr[w][row];
                    arr[w][row] = 0;
                    arr[w + 1][row] = turn + 1;
                }
            }
        }
        turn();
    }
}