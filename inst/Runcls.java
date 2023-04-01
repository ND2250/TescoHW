package inst;

public class Runcls {

    public void nd(int X , int Y){
         X = 23;
         Y = 5000;
        System.out.println(X*Y);
    }

    public static void main(String[] args) {
        // create an object
        Runcls obj = new Runcls();
        obj.nd(23,5000);


        System.out.println();
        Mahadev md = new Mahadev();
        md.expense();
        md.salary();
        md.transport();
        md.maint();
        md.otherexps();

        System.out.println();
        Pavitra pt = new Pavitra();
        pt.expense();
        pt.salary();
        pt.maint();
        pt.transport();
        pt.otherexps();

        System.out.println();
        Rishta rs = new Rishta();
        rs.expense();
        rs.salary();
        rs.maint();
        rs.transport();
        rs.otherexps();

        System.out.println();
        Krishna kr = new Krishna();
        kr.expense();
        kr.salary();
        kr.transport();


    }
}
