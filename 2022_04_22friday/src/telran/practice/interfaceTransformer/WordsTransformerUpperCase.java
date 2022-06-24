package telran.practice.interfaceTransformer;

public class WordsTransformerUpperCase implements WordTransformer{
    @Override
    public boolean check(String input) {
        return input.length()==3;
    }

    @Override
    public String transform(String string) {

        return string.toUpperCase();
    }
}
