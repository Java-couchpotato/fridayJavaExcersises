package telran.practice;

import com.sun.tools.javac.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LarrayTest {

    @Test
    public void maxValueOfArray_lastNumIsMax() {
        Larray larray = new Larray();
        int[] array = {10, 2, 7, 16, 48};
        int expected = 48;
        assertEquals(expected, larray.maxValueOfArray(array));
    }

    @Test
    public void maxValueOfArray_firstNumIsMax() {
        Larray larray = new Larray();
        int[] array = {110, 2, 7, 16};
        int expected = 110;
        assertEquals(expected, larray.maxValueOfArray(array));
    }

    @Test
    public void maxValueOfArray_one() {
        Larray larray = new Larray();
        int[] array = {10};
        int expected = 10;
        assertEquals(expected, larray.maxValueOfArray(array));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void maxValueOfArray_exception() {
        int[] intArray = new int[10];

        int i = intArray[20];
    }

}
