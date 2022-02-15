package looping;

import java.util.Scanner;

public class Arry {
    public static void main(String args[])
    {
        int i =0;
        int k=0;
        int arr[] = new int[20];
        int ary[] = {1,2,3,4,5};
        int lens = 5;
        System.out.println("enter 1 for creat or enter 2 for disply or enter 3 for delete or enter 4 for update");
        Scanner obj = new Scanner(System.in);
        k = obj.nextInt();
        switch (k)
        {
            case 1: {
                System.out.println("enter no of elements");
                Scanner a = new Scanner(System.in);
                int len = a.nextInt();

                for (i = 0; i < len; i++) {
                    arr[i] = a.nextInt();
                }
                break;
            }
            case 2:{
                System.out.println("enter 1 for create and display for new one or enter 2 for display old");
                Scanner s1 = new Scanner(System.in);
                int s = s1.nextInt();
                switch (s) {
                    case 1: {
                        System.out.println("enter no of elements");
                        Scanner e = new Scanner(System.in);
                        int lent = e.nextInt();

                        for (i = 0; i < lent; i++) {
                            arr[i] = e.nextInt();
                        }

                        for (i = 0; i < lent; i++)
                            System.out.println("array is "+arr[i]);
                        break;
                    }
                    case 2: {
                        for (i = 0; i < lens; i++)
                            System.out.println("array is "+ary[i]);
                        break;
                    }
                    default:
                        System.out.println("invalid input");

                }
                break;
            }
            case 3: {
                System.out.println("enter no to be deleted");
                Scanner sc = new Scanner(System.in);
                int b = sc.nextInt();
                for (i = 0; i < lens; i++) {
                    if (ary[i] == b) {
                        ary[i]=0;

                    }
                }
                System.out.println("array after delete");
                for (i = 0; i < lens; i++)
                    System.out.println(ary[i]);
                break;
            }
            case 4: {
                System.out.println("enter the number to be modified");
                Scanner sc1 = new Scanner(System.in);
                int c = sc1.nextInt();
                System.out.println("enter the vaule to modify");
                Scanner sc2 = new Scanner(System.in);
                int d = sc2.nextInt();
                for (i = 0; i < lens; i++) {
                    if (ary[i] == c) {
                        ary[i] = d;
                    }
                }
                System.out.println("array after modification");
                for (i = 0; i < lens; i++)
                    System.out.println(ary[i]);
                break;
            }
            default:
                System.out.println("invalid input");






        }


    }
}
