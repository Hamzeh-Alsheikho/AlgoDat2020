import java.lang.reflect.Array;
import java.util.*;

public class UkeOppgave1 {
   public static void main(String[] args) {
        int[]a ={8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};
        int min_index = min(a);
        int max_index = max(a);
        int[] minimaks = minimaks(a);
        int min2 = min2(a);
        for (int i = 0; i < minimaks.length; i++){
            System.out.println("Det nye arryet b er "+minimaks[i]);}
        System.out.println(fak(10));
        System.out.println("Posjoenen til den minste vardien er "+min_index);
        System.out.println("Den minste vardien er "+a[min_index]+"\n");
        System.out.println("Posjoenen til den største vardien er "+max_index);
        System.out.println("Den største vardien er "+a[max_index]);
       System.out.println(" Min to er "+min2);
        Tabell tabell = new Tabell();
       System.out.println(Arrays.toString(a));
   }
   // Fin den miste verdien og posisjonen
    static int min(int[]a){
       //initialize med første element
        int min_value = a[0];
        int min_indix= 0;
        //loop over restende elementer og sjekk om vi finner ett mindre tall.
        for (int i = 1; i< a.length; ++i){
            int value = a[i];
            //sjekk om verdier er mindre enn det vi har sett tideligre.
            if (value < min_value){
                min_value = value;
                min_indix = i;
            }
        }
        //Returen index til minste verdi.
        return min_indix;
    }
    // Fin den stærste verdien og posisjonen
    static int max(int[]a){
        int max_value = a[0];
        int max_indix= 0;
        for (int i = 1; i< a.length; ++i){
            int value = a[i];
            if (value >= max_value){
                max_value = value;
                max_indix = i;
            }
        }
        return max_indix;
    }
    //1.1.4

    public static int maks(int[] a)   // versjon 2 av maks-metoden
    {
        int m = 0;               // indeks til største verdi                //1
        int maksverdi = a[0];    // største verdi                           //2

        for (int i = 1; i < a.length; i++)                                  //1+n+(n-1)
            if (a[i] > maksverdi)                                           // 2(n-1)
        {
            maksverdi = a[i];     // største verdi oppdateres               //3x
            m = i;                // indeks til største verdi oppdateres
        }
        return m;   // returnerer indeks/posisjonen til største verdi       //1

    } // maks . 1+2+1+n+(n-1)+2(n-1)+3x+1 = 4+n+n-1+2n-2+3x+1
                // 4n+4-1-2+1+3x
                //4n +2+3x =
    // i)10, 5, 7, 2, 9, 1, 3, 8, 4, 6   x = 0, n = 10 4 * 10 + 2 + 3 * 0 = 42
    // ii) 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 og  x = 9, n = 10 40 * 10 + 2+ 3 * 9 = 69
    // iii) 1, 3, 2, 7, 5, 9, 6, 8, 10, 4  x = 4, n = 10  4 * 10 + 2 + 3 * 4 = 54

//1.1.5
    public static int [] minimaks (int []a){
        int mi = 0, miverdi = a[0];
        int ma = 0, maverdi = a[0];
        int verdi = 0;
        for (int i = 1; i< a.length; i++){
            if (verdi > maverdi) {
                maverdi = verdi; ma = i;
            }else if (verdi< miverdi){
                miverdi = verdi; mi = i;
            }
        }
        return new int[]{ma,mi};
    }
    //1.1.6
    public static long fak(int n)
    {
        if (n < 0)
            throw new IllegalArgumentException("n < 0");
        long fak = 1;
        for (int i = 2; i <= n; i++) fak *= i;
        return fak;
    }


    // uke 2

    public static int min2(int[] a, int fra, int til)
    {
        if (fra < 0 || til > a.length || fra >= til)
            throw new IllegalArgumentException("Illegalt intervall!");

        int m = fra;// indeks til minste verdi i a[fra:til>
        int minverdi = a[fra];   // minste verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
            if (a[i] < minverdi) {
            m = i;               // indeks til minste verdi oppdateres
            minverdi = a[m];     // minste verdi oppdateres
        }

        return m;  // posisjonen til minste verdi i a[fra:til>
    }
    public static int min2(int[] a)  // bruker hele tabellen
    {
        return min2(a,0,a.length);     // kaller metoden over
    }

}
