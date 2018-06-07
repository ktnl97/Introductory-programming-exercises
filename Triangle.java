import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args) 
    {
        singleAsterisk();
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int i=sc.nextInt();
        System.out.println();   
        horizontalAsterisk(i);
    }
    public static void singleAsterisk()
    {
    System.out.println("*");
    }
    public static void horizontalAsterisk(int n)
    {
    String result=new String(new char[n]).replace('\0','*');
    System.out.print(result);
    }
}
