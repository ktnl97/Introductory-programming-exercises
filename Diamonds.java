import java.util.Scanner;
public class Diamonds 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("For Isosceles n=");
        int n=sc.nextInt();
        System.out.println();
        isoscelesTriangle(n);
        System.out.print("For Diamond n=");
        n=sc.nextInt();
        System.out.println();
        diamond(n);
        System.out.print("For Diamond with Name n=");
        n=sc.nextInt();
        System.out.println();
        diamondWithName(n);
    }
    public static void isoscelesTriangle(int n)
    {
    int i,j,k;
        for(i=0;i<n;i++)
        {
            for(k=0;k<n-1-i;k++)
                System.out.print(" ");
            for(j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }        
    }
    public static void diamond(int n)
    {
    int i,j,k;
        for(i=0;i<2*n-1;i++)
        {
            for(k=0;k<Math.abs(n-1-i);k++)
                System.out.print(" ");
            for(j=0;j<2*(n-k)-1;j++)// 2(n-1) - 2(k+1) -> total entries -total spaces
                System.out.print("*");
            System.out.println();
        }
    }
    public static void diamondWithName(int n)
    {
    int i,j,k;
     for(i=0;i<2*n-1;i++)
        {
            for(k=0;k<Math.abs(n-1-i);k++)
                System.out.print(" ");
            if(k==0)
                System.out.print("NITHYA");
            else
            for(j=0;j<2*(n-k)-1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
