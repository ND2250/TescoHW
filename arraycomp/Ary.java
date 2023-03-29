package arraycomp;

public class Ary {
    public static void main(String[] args) {
        try {
            int a[] = new int[4];
            a[0] = 100;
            a[1] = 200;
            a[2] = 300;
            a[3] = 400;
            a[4] = 500;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array size is not right");
        }catch (Exception e) {
            System.out.println("Comment must be essential");
        }finally {
            System.out.println("condition must read");
        }


    }
}
