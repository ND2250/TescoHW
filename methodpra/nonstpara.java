package methodpra;

public class nonstpara {

    void data(int age,int DOB, String name){
        System.out.println("Total details :"+age);
        System.out.println("ecat :"+DOB);
        System.out.println("Name :"+name);
    }

    void fair(double total,int name){
        System.out.println("review :"+total);
        System.out.println("exact :"+name);

    }

    public static void main(String[] args) {
        nonstpara obj = new nonstpara();
        obj.data(34,231278,"Palak");
        obj.fair(88.77,78);

    }
}
