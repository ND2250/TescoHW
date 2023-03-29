package Inhrt;

public class Runclasssteel {

    static int kairvi (int x, int y){
        return x*y;
    }

    public static void main(String[] args) {

        int total = kairvi(67,45000);
        System.out.println(total);


        System.out.println("Work as per vision parant class");
        Anjani an = new Anjani();
        an.furnace();
        an.crediters();
        an.debters();
        an.rolling();

        System.out.println("Child class");
        Vicor vc = new Vicor();
        vc.crediters();
        vc.debters();
        vc.furnace();
        vc.rolling();

        System.out.println("Child class");
        Viveksteel vs = new Viveksteel();
        vs.crediters();
        vs.furnace();
        vs.debters();
        vs.rolling();

        System.out.println("child class");
        Vsmeta vk = new Vsmeta();
        vk.crediters();
        vk.furnace();
        vk.debters();
        vk.rolling();

        System.out.println("Krishna");
        Krishna kk = new Krishna();
        kk.crediters();
        kk.debters();



    }
}
