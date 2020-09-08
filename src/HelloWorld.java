import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Teller til ti");
        for (int i = 1; i<= 10; i++){
            System.out.println(i);
        }   System.out.println("Teller til tyve");
        for (int i = 11; i<= 20; i++){
            System.out.println(i);
        }


        String a = merge("ABC","DEFGH");
        String b = merge( "IJKLMN","OPQ");
        System.out.println(merge(a, b));


    }
    public static String merge (String a, String b){
        int k = Math.min(a.length(), b.length());  // lengden på den korteste
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < k; i++)
        {
            s.append(a.charAt(i)).append(b.charAt(i));
        }

        s.append(a.substring(k)).append(b.substring(k));

        return s.toString();

    }

    public static int forskjellige2(int[] a)
    {
        if (a.length <= 1) return a.length;

        int[] b = new int[a.length-1];  // hjelpetabell

        int i = 1, k = 1, j = 0;
        while (i < a.length)
            if (a[i] != a[i-1]) a[k++] = a[i++];
            else b[j++] = a[i++];

        System.arraycopy(b, 0, a, k, j);
        return k;
    }
}
