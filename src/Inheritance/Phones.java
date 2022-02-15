package Inheritance;

public class Phones {
    public String status;


    public Phones(String status)
    {
        this.status = status;

    }
    public void applyjob(int a)
    {
        if (a==0)
        {
            status = "off";
        }
        else
        {
            status = "on";
        }

    }
    public String toString()
    {
        return ("phone is " + status);
    }
}
