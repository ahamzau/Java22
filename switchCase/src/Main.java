public class Main
{
    public static void main(String[] args)
    {
        char grade= 'A';

        switch (grade)
        {
            case 'A':
                System.out.println("Helal : gectin");
                break;
            case 'B':
                System.out.println("aferin : gectin");
                break;
            case 'C':
                System.out.println("iyi : gectin");
                break;
            case 'D':
                System.out.println("idare eder : gectin");
                break;
            case 'E':
                System.out.println("kotu, kaldin");
                break;
            default:
                System.out.println("notu duzgun gir");
        }
    }
}