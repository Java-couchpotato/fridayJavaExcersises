package string_02_02_22hw;

import org.junit.Test;


import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void arrayReverseTest1(){
        int array1[]={2,5,1,7,5};
        int exp1[]={5,7,1,5,2};

        Main.reverseArray(array1);
       assertTrue(Arrays.equals(array1,exp1));
       Main.reverseArray2(array1);
       assertTrue(Arrays.equals(array1,exp1));
    }
    @Test
    public void arrayReverseTest2(){
        int array1[]={1};
        int exp1[]={1};

        Main.reverseArray(array1);
        assertTrue(Arrays.equals(array1,exp1));
        Main.reverseArray2(array1);
        assertTrue(Arrays.equals(array1,exp1));
    }
    @Test
    public void arrayReverseTest3(){
        int array1[]={1,4};
        int exp1[]={4,1};

        Main.reverseArray(array1);
        assertTrue(Arrays.equals(array1,exp1));
        Main.reverseArray2(array1);
        assertTrue(Arrays.equals(array1,exp1));
    }

}