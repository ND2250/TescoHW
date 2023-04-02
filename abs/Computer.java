package abs;

import com.sun.corba.se.impl.encoding.CDROutputObject;

public abstract class Computer  {

    public abstract void hardware();

    public abstract void drivers();

    public void device(){
        System.out.println("Compset up");
    }
}
