public class Main
{
    public static void main(String[] args)
    {
        int number= 2;
        int remainder=number%2;
        System.out.println(remainder);
        boolean isPrime=true;

        if(number==1)
        {
            System.out.println("not a prime number");
            return;
        }

        if(number<2)
        {
            System.out.println("invalid number");
        }

        for(int i=2;i<number;i++)
        {
            if(number%i==0)
            {
                isPrime=false;
            }
        }
        if(isPrime)
        {
            System.out.println("number is a prime");
        }
        else
        {
            System.out.println("number is not a prime");
        }
    }
}