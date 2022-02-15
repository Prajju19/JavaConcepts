package Inheritance;

public class Mobile extends Phones{
    public int charge;
    public Mobile(String status,int givecharge)
    {
        super(status);
        charge = givecharge;
    }
    public void setCharge(int charge1)
    {
        charge = charge1;
    }
    public String toString()
    {
        return (super.toString() + " and the charge is "+ charge);
    }
}
