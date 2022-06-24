package transformers;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransformerTest {
    Transformer transformer = new Transformer();
    @Test
    public void transform_test_toLowerCase(){
        WordsTransformerLowerCase wordsTransformerLowerCase = new WordsTransformerLowerCase();
        String string = "aaa DDDD KJHBJldkf";
        assertEquals("aaa dddd KJHBJldkf", transformer.transform(string,wordsTransformerLowerCase));
    }
    @Test
    public void transform_test_ToUpperCase(){
        WordsTransformerUpperCase wordsTransformerUpperCase = new WordsTransformerUpperCase();
        String string = "aaa DDDD KJHBJldkf";
        String expected = "***** DDDD KJHBJldkf";
        assertEquals("AAA DDDD KJHBJldkf", transformer.transform(string,wordsTransformerUpperCase));
    }@Test
    public void transform_test_Star(){
       WordsTransformerStar wordsTransformerStar = new WordsTransformerStar();
        String string = "aaaaa DDDD KJHBJldkf";
        String expected = "***** DDDD KJHBJldkf";
        assertEquals(expected, transformer.transform(string,wordsTransformerStar));
    }

}