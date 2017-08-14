
public class Field {

    char[][] field = new char[3][3];

    void initializeField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = '*';
            }
        }
    }

    void printField() {
        System.out.println("0 1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    boolean isFieldFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == '*') return false;
            }
        }
        return true;
    }

    boolean isCellEmpty (int x, int y) {
        if (x < 0 || x > 2 || y < 0 || y > 2) return true;
        if (field[y][x] != '*') return true;
        return false;
    }

    boolean checkWin (char symbol) {
        // verify horizontal
        if (field[0][0] == symbol && field[0][1] == symbol && field[0][2] == symbol) return true;
        if (field[1][0] == symbol && field[1][1] == symbol && field[1][2] == symbol) return true;
        if (field[2][0] == symbol && field[2][1] == symbol && field[2][2] == symbol) return true;
        //verify vertical
        if (field[0][0] == symbol && field[1][0] == symbol && field[2][0] == symbol) return true;
        if (field[0][1] == symbol && field[1][1] == symbol && field[2][1] == symbol) return true;
        if (field[0][2] == symbol && field[1][2] == symbol && field[2][2] == symbol) return true;
        // verify diagonal
        if (field[0][0] == symbol && field[1][1] == symbol && field[2][2] == symbol) return true;
        if (field[2][0] == symbol && field[1][1] == symbol && field[0][2] == symbol) return true;
        return false;

    }
}





