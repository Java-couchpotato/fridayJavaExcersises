package com.company;


import org.junit.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

   @Test
   public void test_returnLongestString1() throws IOException {
        assertEquals(" bbbbb", Main.returnLongestString("fileSum.txt"));
    }
    @Test
    public void testSum1() throws IOException {
        assertEquals(15, Main.readAndReturnSum("fileSum.txt"));
    }

}