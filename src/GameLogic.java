import java.util.Random;
import java.util.Scanner;

public class GameLogic {

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    Field f = new Field();

     void humanMove() {
        int x, y;
        do {
            System.out.println("Enter x and y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (f.isCellEmpty(x, y));
            f.field[y][x] = 'X';
        }

    void computerMove() {
        int x, y;
        do {
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        }
        while (f.isCellEmpty(x, y));
            f.field[y][x] = 'O';
        }

    void start() {
        f.initializeField();
        f.printField();
        while (true) {
            humanMove();
            f.printField();
            if (f.checkWin('X')) {
                System.out.println("Human won");
                break;
            }
            if (f.isFieldFull()) break;
            computerMove();
            f.printField();
            if (f.checkWin('O')) {
                System.out.println("Computer won");
                break;
            }
            if (f.isFieldFull()) break;
        }
        System.out.println("Game over");
    }
}
