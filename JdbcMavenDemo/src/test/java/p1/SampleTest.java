package p1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bootchamp.testing.Sample;

public class SampleTest {

	@BeforeEach
	public void m1() {

		System.out.println("JUnit is starting...");
	}

	@AfterEach
	public void m2() {

		System.out.println("JUnit is stoping...");
	}

	@Test
	void test_getMin() {

		int[] arr = { 6, 3, 9, 3, 6, 7, 5 };

		Sample sample = new Sample();

		int min = sample.getMin(arr);

		assertEquals(3, min, "Minimum is not working fine");

	}

	@Test
	void test_getMin2() {

		int[] arr = { 6, -3, 9, 3, 6, -7, 5, 0 };

		Sample sample = new Sample();

		int min = sample.getMin(arr);

		assertEquals(-7, min);
	}

	@Test
	void test_isEven() {

		int x = 12;

		Sample sample = new Sample();

		assertEquals(true, sample.isEven(x));
		assertTrue(sample.isEven(x));
	}

	@Test
	void test_reverse() {

		String name = "MALAYALAM";

		Sample sample = new Sample();

		String expected = "MALAYALAM";
		String actual = sample.reverse(name);

		assertEquals(expected, actual);
	}

}
