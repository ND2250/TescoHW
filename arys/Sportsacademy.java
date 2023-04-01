package arys;

import java.util.ArrayList;

public class Sportsacademy {

    void association(){
        ArrayList net = new ArrayList();
        net.add("All details");
        net.add("Players details");
        net.add("Budget");
        net.add(565);

        System.out.println(net.get(2));
        System.out.println(net.size());
        System.out.println(net.remove(2));
        System.out.println(net.get(1));
        System.out.println(net);

    }

    public static void main(String[] args) {
        Sportsacademy data = new Sportsacademy();
        data.association();
    }



}
