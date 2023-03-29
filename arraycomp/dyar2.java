package arraycomp;

public class dyar2 {

    public static void main(String[] args) {

        int a[][] = new int[3][3];

        a[0][0] = 2;
        a[0][1] = 4;
        a[0][2] = 6;

        a[1][0] = 6;
        a[1][1] = 8;
        a[1][2] = 10;

        a[2][0] = 10;
        a[2][1] = 12;
        a[2][2] = 14;

        for (int r = 0; r< a.length;r++) {
            for (int c = 0; c < a.length; c++) {
                System.out.print(a[r][c] + " ");
            }
            System.out.println();

        }


    }
}
