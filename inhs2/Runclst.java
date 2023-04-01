package inhs2;

public class Runclst {

    void group(int x , int y){

        System.out.println(x*y);
    }

    public static void main(String[] args) {


        // create an object

        Runclst rn = new Runclst();
        rn.group(12,5600);


        System.out.println();
        Steel st = new Steel();
        st.rm();
        st.crs();
        st.net();
        st.growth();

        System.out.println();
        Bar br = new Bar();
        br.crs();
        br.net();
        br.growth();
        br.rm();


        System.out.println();
        Ingots in = new Ingots();
        in.crs();
        in.net();
        in.growth();
        in.rm();

        System.out.println();
        Alloysteel al = new Alloysteel();
        al.crs();
        al.rm();

    }
}
