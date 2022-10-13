import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5,3 }, input1);
	}

  @Test 
	public void testReverseInPlace1() {
    int[] input1 = { 3,1,2,3,4,5,6,7,8 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 8,7,6,5,4,3,2,1,3 }, input1);
	}
  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 3, 2,1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1,2,3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = {1,2,3,4,5 };
    assertArrayEquals(new int[]{ 5,4,3,2,1}, ArrayExamples.reversed(input1));
  }
}
