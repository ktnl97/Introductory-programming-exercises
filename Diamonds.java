import java.util.Scanner;
public class Diamonds 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        System.out.println();
        isoscelesTriangle(n);
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
}
