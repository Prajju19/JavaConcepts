package IfElse;

import java.util.Scanner;

public class Pgm {
    public static void main(String args[])
{
    int i,cnt1=0,cnt2=0,cnt3=0,cnt4=0;
    int a[] ;
    a = new int[20];
    Scanner sc = new Scanner(System.in);
    for(i=0;i<20;i++)
    {
        a[i]= sc.nextInt();
    }
    for (i=0;i<20;i++) {
        if (a[i] > 0) {
            ++cnt1;
        }
    }
    for (i=0;i<20;i++) {
        if (a[i] < 0) {
            ++cnt2;
        }
    }
    for (i=0;i<20;i++) {
        if (a[i] / 2 == 0) {
            ++cnt3;
        }
    }
    for (i=0;i<20;i++) {
        if (a[i] / 2 != 0) {
            ++cnt4;
        }
    }

    System.out.println(cnt1+" "+cnt2+" " +cnt3 +" " +cnt4);

}
}
