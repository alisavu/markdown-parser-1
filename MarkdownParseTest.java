import static org.junit.Assert.*;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile1() throws IOException {
        Path filePath = Path.of("test-file.md");
        String content = Files.readString(filePath);

        ArrayList<String> list = new ArrayList<>();
        list.add("https://something.com");
        list.add("some-thing.html");

        assertEquals(list, MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile2() throws IOException {
        Path filePath = Path.of("test-file2.md");
        String content = Files.readString(filePath);

        ArrayList<String> list = new ArrayList<>();
        list.add("https://google.com");
        list.add("some-thing.html");

        assertEquals(list, MarkdownParse.getLinks(content));
    }
    
    @Test
    public void testFile3() throws IOException {
        Path filePath = Path.of("test-file3.md");
        String content = Files.readString(filePath);

        ArrayList<String> list = new ArrayList<>();

        assertEquals(list, MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile4() throws IOException {
        Path filePath = Path.of("test-file4.md");
        String content = Files.readString(filePath);

        ArrayList<String> list = new ArrayList<>();

        assertEquals(list, MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile5() throws IOException {
        Path filePath = Path.of("test-file5.md");
        String content = Files.readString(filePath);

        ArrayList<String> list = new ArrayList<>();

        assertEquals(list, MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile6() throws IOException {
        Path filePath = Path.of("test-file6.md");
        String content = Files.readString(filePath);

        ArrayList<String> list = new ArrayList<>();

        assertEquals(list, MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile7() throws IOException {
        Path filePath = Path.of("test-file7.md");
        String content = Files.readString(filePath);

        ArrayList<String> list = new ArrayList<>();

        assertEquals(list, MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile8() throws IOException {
        Path filePath = Path.of("test-file8.md");
        String content = Files.readString(filePath);

        ArrayList<String> list = new ArrayList<>();
        list.add("a link on the first line");

        assertEquals(list, MarkdownParse.getLinks(content));
    }
}