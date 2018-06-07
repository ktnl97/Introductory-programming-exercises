import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args) 
    {
        singleAsterisk();
        Scanner sc=new Scanner(System.in);
        System.out.print("For horizontal line n=");
        int i=sc.nextInt();
        System.out.println();   
        horizontalAsterisk(i);
        System.out.print("For vertical line n=");
        i=sc.nextInt();
        System.out.println();   
        verticalAsterisk(i);
        System.out.print("For right triangle n=");
        i=sc.nextInt();
        System.out.println();   
        rightTriangle(i);
    }
    public static void singleAsterisk()
    {
    System.out.println("*");
    }
    public static void horizontalAsterisk(int n)
    {
    String result=new String(new char[n]).replace('\0','*');
    System.out.println(result);
    }
    public static void verticalAsterisk(int n)
    {
        for(int i=0;i<n;i++)
            System.out.println("*");
    }
    public static void rightTriangle(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
