public class FizzBuzz {
    public static void main(String[] args) {
       fizzBuzz();
    }
    public static void fizzBuzz()
    {
        for(int i=1;i<=100;i++)
        {
            int f=0;
            if(i%3==0)
            {
                System.out.print("Fizz");
                f=1;
            }
            if(i%5==0)
            {
                System.out.print("Buzz");
                f=1;
            }
            if(f==0)
                System.out.print(i);
            System.out.println();
        }
}
}
