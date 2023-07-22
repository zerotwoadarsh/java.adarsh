package Zmisc;
public class pattern {
    public static void main(String[] args) {
        int n = 4;
        diamond(n);
    }

    static void diamond(int n) {
        int row, col, totalcolinrow, space, noofspaces;

        for (row = 1; row <= (2 * n - 1); ++row) {

            totalcolinrow = row > n ? 2 * n - row : row;
            noofspaces = n - totalcolinrow ;

            for (space = 1; space <= noofspaces; ++space) {
                System.out.print(" ");
            }

            for (col = 1; col <= totalcolinrow; ++col) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }

    static void square(int n) {
        for (int row = 1; row <= n; ++row) {
            char c = 'a';
            // int a=97;
            for (int col = 1; col <= n; ++col) {
                System.out.print(c);
                ++c;
            }
            System.out.println();
        }
    }

    static void triangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; ++col)
                System.out.print(" ");
            for (int col = 1; col <= 2 * n - 2 * row + 1; ++col)
                System.out.print("*");
            System.out.println();
        }
    }
}
