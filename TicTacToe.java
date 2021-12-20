/*
* Java 1. Homework #4
*
* @author Igor Kargapolov
* @version 20.12.2021
*/
import java.util.Scanner;
import java.util.Random;
class TicTacToe {
    
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Scanner sc;
    Random random;
    public static void main (String[] args) {
        TicTacToe ttt = new TicTacToe();
        ttt.game();
    }
    TicTacToe() {
        table = new char[3][3];
        sc = new Scanner(System.in);
        random = new Random();
    }
    void game() {
        initTable();
        while (true) {
            turnHuman();
            printTable();
            if (isWin(SIGN_X)) {
                System.out.println("CONGRATZ!");
                break;
            }
            if (isTableFull()) {
                System.out.println("It's draw, my friend");
                break;
            }
            System.out.println("Enemy turn.");
            turnAi();
            printTable();
            if (isWin(SIGN_O)) {
                System.out.println("SO BAD!");
                break;
            }
            if (isTableFull()) {
                System.out.println("It's draw, my friend");
                break;
            }
        }
    }
    void initTable() {
        for (int i = 0; i < table.length; i++ ){
            for(int j = 0; j < table.length; j++){
                table[i][j] = SIGN_EMPTY;
            }
        }
    }
    void printTable() {
        for (int y = 0; y < table.length; y++ ){
            for(int x = 0; x < table.length; x++){
                System.out.print(table[y][x] + " ");
            }
        System.out.println();
        }
    }
    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter y and x (1..3): ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = SIGN_X;
    }
    void turnAi() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = SIGN_O;
    }
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y> 2) {
            return false;
        }
        return table[x][y] == SIGN_EMPTY;
    }
    boolean isWin(char ch) {
        boolean leftDiag = true;
        boolean rightDiag = true;
        for (int i = 0; i < 3; i++) {
            if (table[0][i] == ch && table[1][i] == ch && table[2][i] == ch) return true;
            if (table[i][0] == ch && table[i][1] == ch && table[i][2] == ch) return true;
            for (int j = 0; j < 3; j++) {
                leftDiag = leftDiag & (table[j][j] == ch);
                rightDiag = rightDiag & (table[j][2 - j] == ch);
            }
        }
        return (leftDiag || rightDiag);
    }
    boolean isTableFull() {
        for (int y = 0; y < table.length; y++){
            for(int x = 0; x < table.length; x++){
                if (table[x][y] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}