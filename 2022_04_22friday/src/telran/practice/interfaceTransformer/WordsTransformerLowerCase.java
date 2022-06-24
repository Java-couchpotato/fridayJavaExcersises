package telran.practice.interfaceTransformer;

public class WordsTransformerLowerCase implements WordTransformer{
    @Override
    public boolean check(String input) {
        return input.length()==4;
    }

    @Override
    public String transform(String string) {
        return string.toLowerCase();
    }
}
