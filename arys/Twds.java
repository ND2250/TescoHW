package arys;

public class Twds {
    public static void main(String[] args) {
        int A [][] = new int[3][3];
        A[0][0] = 100;
        A[0][1] = 200;
        A[0][2] = 300;

        A[1][0] = 300;
        A[1][1] = 400;
        A[1][2] = 500;

        A[2][0] = 500;
        A[2][1] = 600;
        A[2][2] = 700;

        for (int r = 0; r<A.length;r++){
            for (int c = 0; c<A.length;c++){
            System.out.print(A[r][c] + " ");
            }
        System.out.println();


        }
    }
}
