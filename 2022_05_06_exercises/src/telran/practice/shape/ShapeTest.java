package telran.practice.shape;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void test_getSquare_Circle_Normal() {
        Shape s1 = new Circle(5);
        assertEquals((int) (5 * 5 * Math.PI), s1.getSquare());
    }

    @Test
    void test_getSquare_Circle_Zero() {
        Shape s1 = new Circle(0);
        assertEquals(0, s1.getSquare());
    }

    @Test
    void test_getSquare_Circle_Negative() {
        Shape s1 = new Circle(-5);
        assertEquals(-1, s1.getSquare());
    }

    @Test
    void test_getSquare_Square_Normal() {
        Shape s1 = new Square(5);
        assertEquals(25, s1.getSquare());
    }

    @Test
    void test_getSquare_Square_Zero() {
        Shape s1 = new Square(0);
        assertEquals(0, s1.getSquare());
    }

    @Test
    void test_getSquare_Rectangle_Normal() {
        Shape s1 = new Rectangle(2, 5);
        assertEquals(10, s1.getSquare());
    }

    @Test
    void test_getSquare_Rectangle_Zero() {
        Shape s1 = new Rectangle(0, 0);
        assertEquals(0, s1.getSquare());
    }


    @Test
    void test_compareTo_Squares_Normal_FirstIsMore() {
        Shape s1 = new Square(2);
        Shape s2 = new Square(3);
        assertEquals(-5, s1.compareTo(s2));
    }

    @Test
    void test_compareTo_Squares_Normal_SecondIsMore() {
        Shape s1 = new Square(3);
        Shape s2 = new Square(2);
        assertEquals(5, s1.compareTo(s2));
    }

    @Test
    void test_compareTo_Squares_Normal_Equal() {
        Shape s1 = new Square(3);
        Shape s2 = new Square(3);
        assertEquals(0, s1.compareTo(s2));
    }

    @Test
    void test_sort_NormalCase() {
        Shape s1 = new Circle(5);
        Shape s2 = new Circle(1);
        Shape s3 = new Rectangle(5, 2);
        Shape s4 = new Square(5);
        Shape s5 = new Square(3);

        Shape[] actual = {s1, s2, s3, s4, s5};
        Arrays.sort(actual);
        Shape[] expected = {s2, s5, s3, s4, s1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_sort_OneElement() {
        Shape s1 = new Circle(5);

        Shape[] actual = {s1};
        Arrays.sort(actual);
        Shape[] expected = {s1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_sort_NoElements() {
        Shape[] actual = {};
        Arrays.sort(actual);
        Shape[] expected = {};
        assertArrayEquals(expected, actual);
    }
}
