package Arrays;

public class SumClass {
    public int sum(int a[],int b[])
    {
        int sum[] ={0,0,0,0};
        int i = 0;

        for(i=0;i<4;i++)
        {
            sum[i]= a[i]+b[i];

            System.out.println(sum[i]);

        }


        System.out.println(sum);
        return sum[3];

    }
}
