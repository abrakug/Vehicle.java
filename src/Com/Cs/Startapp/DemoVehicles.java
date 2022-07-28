package Com.Cs.Startapp;

import Com.Cs.model.Bicycle;
import Com.Cs.model.Sailboat;

import javax.swing.*;

public class DemoVehicles {
    public static void main(String[] args){
        Sailboat aBoat= new Sailboat();
        Bicycle aBike =new Bicycle();

        JOptionPane.showMessageDialog(null,
                "\nVehicle description:\n"+aBoat.toString()
                        +"\n"+ aBike.toString());
    }
}
