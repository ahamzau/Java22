public class Main
{
    public static void main(String[] args)
    {
        //for
        for(int i=1; i<=10; i++)
        {
            System.out.println(i);
        }
        System.out.println("End of for loop");

        //While
        int i=1;
        while(i<10)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("end of while loop");

        //Do-While
        int j=1;
        do
        {
            System.out.println(j);
            j+=2;
        }
        while (j<10);
        System.out.println("end of do_while lopp");
    }
}