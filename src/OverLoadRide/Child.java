package OverLoadRide;

public class Child extends OverRride {
    int a = 50;
    void display()
    {
        System.out.println("This is child class of value" + a);
        System.out.println("This is parent class of value " + super.a);
    }
}
