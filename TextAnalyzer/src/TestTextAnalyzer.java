import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TestTextAnalyzer {
    String text = new String(Files.readAllBytes(Paths.get("res/text_01.txt")));
    TextAnalyzer textAnalyzer = new TextAnalyzer(text);

    public TestTextAnalyzer() throws IOException {
    }

    @Test
    public void testGetMostFrequentWord() {
        String actual = textAnalyzer.getMostFrequentWord();
        String expected = "japan";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGetWords() {
        ArrayList<String> actual = textAnalyzer.getWords();
        String[] expected = new String[]{"japan", "restarted", "japan", "japan", "has", "restarted"};
                Assert.assertEquals(actual.size(),expected.length);
        for (int i = 0; i <= ((actual.size() - 1)&(expected.length - 1)); i ++){
                Assert.assertEquals(actual.get(i),expected[i]);
        }
    }

}
