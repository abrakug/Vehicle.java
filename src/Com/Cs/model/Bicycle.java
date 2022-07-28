package Com.Cs.model;

import javax.swing.*;

public class Bicycle extends Vehicle {
    public Bicycle(){
        super("a person", 2);
    }
    @Override
    public void setPrice(){
        String entry;
        final int Max=4000;
        entry= JOptionPane.showInputDialog
                (null,"Enter bicycle price ");
        price=Integer.parseInt(entry);
        if (price>Max)
            price=Max;
    }
    @Override
    public String toString(){
        return ("The bicycle is powered by "+getPowerSource()+
                "; it has "+ getWheels()+
                " wheels and costs $"+getPrice());
    }
}
