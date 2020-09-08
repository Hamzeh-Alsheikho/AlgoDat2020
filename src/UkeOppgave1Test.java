import static org.junit.jupiter.api.Assertions.*;

class UkeOppgave1Test {

    @org.junit.jupiter.api.Test
    void min() {
        int[]a ={8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};
        int minimum = UkeOppgave1.min(a);
        assertEquals(6, minimum);
        assertEquals(1, a[minimum]);
        // Test for alle 4 tall permitatjoner
        // Test corner cases
      /*  int []a4={1, 2, 3, 4};
        int expected[]={
                1,1,1,1,1
        };
        for (int i = 0; i< a4.length; i++){
            assertEquals(expected[i],UkeOppgave1.min(a4));

        }

       */
        int[]b ={1,4,17,10,6,20,8};
        assertEquals(0, UkeOppgave1.min(b));
        int[]c ={8,4,17,10,6,20,1};
        assertEquals(6, UkeOppgave1.min(c));
        }



}