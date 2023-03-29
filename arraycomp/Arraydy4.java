package arraycomp;

public class Arraydy4   {

    public static void main(String[] args) {
        int a[][] = new int[2][2];

        a[0][0] = 20;
        a[0][1] = 22;

        a[1][0] = 24;
        a[1][1] = 26;


        for (int r = 0;r<a.length;r++){
            for(int c = 0;c<a.length;c++){
                System.out.print(a[r][c]+ " ");

            }
            System.out.println();
        }

    }
}
