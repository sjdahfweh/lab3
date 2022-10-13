import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testReversed() {
    ListExamples z = new ListExamples();
    List<String> s =new ArrayList<>();
    s.add("abcdsde");
    s.add("a");
    s.add("abcdefg");
    s.add("b");
    s.add("abcdefg");
    List<String> c = new ArrayList<>();
    c.add("abcdsde");
    c.add("abcdefg");
    c.add("abcdefg");
    
    s = z.filter(s, new LongWordChooser());
    assertEquals(c, s);
  }
}
