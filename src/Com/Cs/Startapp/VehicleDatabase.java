package Com.Cs.Startapp;

import Com.Cs.model.Bicycle;
import Com.Cs.model.Sailboat;
import Com.Cs.model.Vehicle;

import javax.swing.*;

public class VehicleDatabase {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];
        int x;

        for (x = 0; x < vehicles.length;++x){
            String userEntry;
            int vehicleType;
            userEntry= JOptionPane.showInputDialog(null,"" +
                    "Please select the type of\n "+
                    "vehicle you want to enter:\n1-Sailboat\n"+
                    "2-Bicycle");
            vehicleType=Integer.parseInt(userEntry);
            if(vehicleType==1)
                vehicles[x]=new Sailboat();
            else
                vehicles[x]=new Bicycle();
        }
    }
}
