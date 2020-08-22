public class UkeOppgave1 {
   public static void main(String[] args) {
        int[]a ={8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};
        int min_index = min(a);
        int max_index = max(a);
        System.out.println("Posjoenen til den minste vardien er "+min_index);
        System.out.println("Den minste vardien er "+a[min_index]+"\n");
        System.out.println("Posjoenen til den største vardien er "+max_index);
        System.out.println("Den største vardien er "+a[max_index]);
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


}
