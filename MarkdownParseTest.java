import static org.junit.Assert.*;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksFile1() throws IOException {
        List<String> stringList = List.of("https://something.com", "some-thing.html");
        String fileName = Files.readString(Path.of("/Users/alisavu/Documents/GitHub/markdown-parser-1/test-file.md"));
        assertEquals(MarkdownParse.getLinks(fileName), stringList);

    }
    

}