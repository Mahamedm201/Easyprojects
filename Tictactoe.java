package tictactoe;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("---------");
        Arrays.fill(cellars, " ");
        for (int k = 0; k < cellars.length; k++) {
            if (k % 3 == 0) {
                System.out.printf("| %s %s %s | %n", " ", " ", " ");
            }
        }
        System.out.println("---------");
        prompt();
    }
    static Scanner sc = new Scanner(System.in);
    static int cord1, cord2, count = 0, num = 0;
    static boolean a = false, b = false;
    static String[] cellars = new String[9];
    public static void prompt() {
        while (!a) {
            System.out.print("Enter the coordinates: ");
            if (sc.hasNextInt()) {
                cord1 = sc.nextInt();
                cord2 = sc.nextInt();
                if ((cord1 >= 4 || cord1 < 1) || (cord2 >= 4 || cord2 < 1)) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else {
                    a = true;
                }
            } else if (!sc.hasNextInt()) {
                System.out.println("You should enter numbers!");
                sc.next();
            }
        }
        count++;
        if (cord1 == 1) {
            first();
        } else if (cord1 == 2) {
            second();
        } else if (cord1 == 3) {
            third();
        }
    }
    public static void first() {
        if (cord1 == 1 && cord2 == 1 && cellars[6].equals(" ")) {
            if (!(count % 2 == 0)) {
                cellars[6] = "X";
            } else {
                cellars[6] = "O";
            }
            display();
        } else if (cord1 == 1 && cord2 == 2 && cellars[3].equals(" ")) {
            if (!(count % 2 == 0)) {
                cellars[3] = "X";
            } else {
                cellars[3] = "O";
            }
            display();
        } else if (cord1 == 1 && cord2 == 3 && cellars[0].equals(" ")) {
            if (!(count % 2 == 0)) {
                cellars[0] = "X";
            } else {
                cellars[0] = "O";
            }
            display();
        } else {
            occ();
        }
    }
    public static void second() {
        if (cord1 == 2 && cord2 == 1 && cellars[7].equals(" ")) {
            if (!(count % 2 == 0)) {
                cellars[7] = "X";
            } else {
                cellars[7] = "O";
            }
            display();
        } else if (cord1 == 2 && cord2 == 2 && cellars[4].equals(" ")) {
            if (!(count % 2 == 0)) {
                cellars[4] = "X";
            } else {
                cellars[4] = "O";
            }
            display();
        } else if (cord1 == 2 && cord2 == 3 && cellars[1].equals(" ")) {
            if (!(count % 2 == 0)) {
                cellars[1] = "X";
            } else {
                cellars[1] = "O";
            }
            display();
        } else {
            occ();
        }
    }
    public static void third() {
        if (cord1 == 3 && cord2 == 1 && cellars[8].equals(" ")) {
            if (!(count % 2 == 0)) {
                cellars[8] = "X";
            } else {
                cellars[8] = "O";
            }
            display();
        } else if (cord1 == 3 && cord2 == 2 && cellars[5].equals(" ")) {
            if (!(count % 2 == 0)) {
                cellars[5] = "X";
            } else {
                cellars[5] = "O";
            }
            display();
        } else if (cord1 == 3 && cord2 == 3 && cellars[2].equals(" ")) {
            if (!(count % 2 == 0)) {
                cellars[2] = "X";
            } else {
                cellars[2] = "O";
            }
            display();
        } else {
            occ();
        }
    }
    public static void display() {
        System.out.println("---------");
        for (int k = 0; k < cellars.length; k++) {
            if (k % 3 == 0) {
                System.out.printf("| %s %s %s | %n", cellars[k], cellars[k + 1], cellars[k + 2]);
            }
        }
        System.out.println("---------");
        xa();
        oa();
        xd();
        od();
        XD();
        OD();
        if (cellars[0].equals(" ") || cellars[1].equals(" ") || cellars[2].equals(" ") || cellars[3].equals(" ")
        || cellars[4].equals(" ") || cellars[5].equals(" ") || cellars[6].equals(" ") || cellars[7].equals(" ")
        || cellars[8].equals(" ")) {
            a = false;
            prompt();
        } else {
            System.out.println("Draw");
            System.exit(0);
        }
    }
    public static void occ() {
        System.out.println("This cell is occupied! Choose another one!");
        a = false;
        prompt();
    }
    public static void xa(){
        if (cellars[0].equals("X") && cellars[1].equals("X") && cellars[2].equals("X")) {
            System.out.println("X wins");
            System.exit(0);
        } else if (cellars[3].equals("X") && cellars[4].equals("X") && cellars[5].equals("X")) {
            System.out.println("X wins");
            System.exit(0);
        } else if (cellars[6].equals("X") && cellars[7].equals("X") && cellars[8].equals("X")) {
            System.out.println("X wins");
            System.exit(0);
        }
    }
    public static void oa(){
        if (cellars[0].equals("O") && cellars[1].equals("O") && cellars[2].equals("O")) {
            System.out.println("O wins");
            System.exit(0);
        } else if (cellars[3].equals("O") && cellars[4].equals("O") && cellars[5].equals("O")) {
            System.out.println("O wins");
            System.exit(0);
        } else if (cellars[6].equals("O") && cellars[7].equals("O") && cellars[8].equals("O")) {
            System.out.println("O wins");
            System.exit(0);
        }
    }
    public static void xd(){
        if (cellars[0].equals("X") && cellars[3].equals("X") && cellars[6].equals("X")) {
            System.out.println("X wins");
            System.exit(0);
        } else if (cellars[1].equals("X") && cellars[4].equals("X") && cellars[7].equals("X")) {
            System.out.println("X wins");
            System.exit(0);
        } else if (cellars[2].equals("X") && cellars[5].equals("X") && cellars[8].equals("X")) {
            System.out.println("X wins");
            System.exit(0);
        }
    }
    public static void od(){
        if (cellars[0].equals("O") && cellars[3].equals("O") && cellars[6].equals("O")) {
            System.out.println("O wins");
            System.exit(0);
        } else if (cellars[1].equals("O") && cellars[4].equals("O") && cellars[7].equals("O")) {
            System.out.println("O wins");
            System.exit(0);
        } else if (cellars[2].equals("O") && cellars[5].equals("O") && cellars[8].equals("O")) {
            System.out.println("O wins");
            System.exit(0);
        }
    }
    public static void XD(){
        if (cellars[0].equals("X") && cellars[4].equals("X") && cellars[8].equals("X")) {
            System.out.println("X wins");
            System.exit(0);
        } else if (cellars[2].equals("X") && cellars[4].equals("X") && cellars[6].equals("X")) {
            System.out.println("X wins");
            System.exit(0);
        }
    }
    public static void OD(){
        if (cellars[0].equals("O") && cellars[4].equals("O") && cellars[8].equals("O")) {
            System.out.println("O wins");
            System.exit(0);
        } else if (cellars[2].equals("O") && cellars[4].equals("O") && cellars[6].equals("O")) {
            System.out.println("O wins");
            System.exit(0);
        }
    }
}