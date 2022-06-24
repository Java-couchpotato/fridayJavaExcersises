package telran.practice.interfaceTransformer;

import transformers.WordsTransformer;

public class Transformer {
    public static String transform(String string, WordsTransformer wordsTransformer) {
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (wordsTransformer.check(words[i])) {
                words[i] = wordsTransformer.transform(words[i]);
            }
        }
        return String.join(" ", words);

    }
}
