package arraycomp;

public class tdmaray   {

    public static void main(String[] args) {

        int a [] [] = new int[3][3];
        a[0][0] = 5;
        a[0][1] = 10;
        a[0][2] = 15;

        a[1][0] = 15;
        a[1][1] = 20;
        a[1][2] = 25;

        a[2][0] = 25;
        a[2][1] = 30;
        a[2][2] = 35;



        for (int r = 0; r<a.length;r++){
            for (int c=0;c< a.length;c++){
                System.out.print(a[r][c]+" ");
            }
            System.out.println();

        }




    }
}
