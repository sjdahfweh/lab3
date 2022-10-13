import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    @Test
    public void testReversed() {
    String[] s = {"abcdsde","abc","abcdefg","acbd","abcdefg"};
    ListExamples.filter(s,sc.checkString(s));
    assertArrayEquals(new String[]{"abcdsde","abcdefg","abcdefg"}, ListExamples.filter(s));
  }
}
