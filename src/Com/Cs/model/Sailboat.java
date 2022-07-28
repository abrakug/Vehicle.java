package Com.Cs.model;

import javax.swing.*;

public class Sailboat extends Vehicle{
  private int length;

  public Sailboat(){
      super("wind",0);
      setLenght();
  }
  public void setLenght(){
      String entry;
      entry= JOptionPane.showInputDialog(null,"Enter sailboat length in feet ");
      length=Integer.parseInt(entry);
  }
  public int getLength(){
      return length;
  }
  @Override
    public void setPrice(){
      String entry;
      final int Max=100000;
      entry=JOptionPane.showInputDialog(null,"Enter sailboat price ");
      price=Integer.parseInt(entry);
      if (price>Max)
          price=Max;

  }
  @Override
    public String toString(){
      return ("The "+ getLength()+
              " foot sailboat is powered by "+
              getPowerSource()+"; it has "+
              getWheels()+" wheels and cost $"+ getPrice());
  }
}
