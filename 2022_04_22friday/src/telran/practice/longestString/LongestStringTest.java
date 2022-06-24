package telran.practice.longestString;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestStringTest {

    @Test
    public void longestRepeatedStringTest_5repeated(){
        LongestString longestString = new LongestString();
        String str = "aaabbbbbcc";
        assertEquals(5,longestString.longestRepeatedSubstring(str));
    }
    @Test
    public void longestRepeatedStringTest2(){
        LongestString longestString = new LongestString();
        String str = "aaaaabbbbbcc";
        assertEquals(5,longestString.longestRepeatedSubstring(str));
    }
    @Test
    public void longestRepeatedStringTest3(){
        LongestString longestString = new LongestString();
        String str = "aaaaabbbbcccccc";
        assertEquals(6,longestString.longestRepeatedSubstring(str));
    }

}