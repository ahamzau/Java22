public class Main
{
    public static void main(String[] args)
    {
        String[][] sehirler=new String[3][3];

        sehirler[0][0]="Van";
        sehirler[0][1]="AfyonKarahisar";
        sehirler[0][2]="Kırklareli";
        sehirler[1][0]="Karaman";
        sehirler[1][1]="Istanbul";
        sehirler[1][2]="Van";
        sehirler[2][0]="Izmir";
        sehirler[2][1]="Zaman gosterecek";
        sehirler[2][2]="Umarim guzel bir yerdeyimdir";

        for(int i=0;i<=2;i++)
        {
            System.out.println("------------------");
            for(int j=0; j<=2;j++)
            {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}