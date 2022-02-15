package OverLoadRide;

public class OverLoad {
    int a=10;
    int b=20;
    int c=30;
    void add(int x, int y)
    {
        int a=x;
        int b = y;
        int sum,res;
        sum = this.a + this.b;
        res = a + b;
        System.out.println("sum of two instance variables is " +sum);
        System.out.println("sum of two local variable is " +res);

    }
    void add(int x, int y, int z)
    {

        int a=x;
        int b = y;
        int c = z;
        int sum,res;
        sum = this.a + this.b + this.c;
        res = a + b + c;
        System.out.println("sum of three instance variables is " +sum);
        System.out.println("sum of three local variable is " +res);
    }
    public static void main(String args[])
    {
        OverLoad expl = new OverLoad();
        expl.add(40,50);
        expl.add(40,50,60);
    }
}
