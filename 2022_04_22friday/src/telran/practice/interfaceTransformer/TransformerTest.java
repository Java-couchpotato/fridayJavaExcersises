package telran.practice.interfaceTransformer;

import org.junit.Test;
import transformers.Transformer;
import transformers.WordsTransformerLowerCase;
import transformers.WordsTransformerStar;
import transformers.WordsTransformerUpperCase;

import static org.junit.jupiter.api.Assertions.*;

public class TransformerTest {
  Transformer transformer = new Transformer();


    @Test
    public void transform_test_ToUpperCase(){
        WordsTransformerUpperCase wordsTransformerUpperCase = new WordsTransformerUpperCase();
        String string = "aaa DDDD KJHBJldkf";
        String expected = "AAA DDDD KJHBJldkf";
        assertEquals(expected, transformer.transform(string,wordsTransformerUpperCase));
    }
    @Test
    public void transform_test_toLowerCase(){
        transformers.WordsTransformerLowerCase wordsTransformerLowerCase = new WordsTransformerLowerCase();
        String string = "AAAA DDD KJHBJldkf";
        assertEquals("aaaa DDD KJHBJldkf", transformer.transform(string,wordsTransformerLowerCase));
    }@Test
    public void transform_test_toLowerCase_all_words(){
        transformers.WordsTransformerLowerCase wordsTransformerLowerCase = new WordsTransformerLowerCase();
        String string = "AAAA DDDD KKKK";
        assertEquals("aaaa dddd KKKK", transformer.transform(string,wordsTransformerLowerCase));
    }

}