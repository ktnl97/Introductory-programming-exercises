import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Prime Factors of n=");
        int n = sc.nextInt();
        List<Integer> resultList=generate(n);
        System.out.println(resultList);
    }
    private static List<Integer> generate(int n)
    {
        List<Integer> list=new ArrayList<>();
        while(n%2==0)
        {
            list.add(2);
            n=n/2;
        }
        for(int i=3;i<=Math.sqrt(n);i++)
        {
            while(n%i==0)
            {
                list.add(i);
                n=n/i;
            }
        }
        if(n>2)
            list.add(n);
        return list;
    }
}
