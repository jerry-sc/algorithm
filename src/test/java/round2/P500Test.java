package round2;

import org.junit.Test;

public class P500Test {

    private P500 p500 = new P500();

    @Test
    public void test() {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] res = p500.findWords(words);
        for (String word : res)
            System.out.println(word);
    }
}