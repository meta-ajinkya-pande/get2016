package assignment1;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class TestInputFile {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String[][] expected = {
				{ "Rating", "Single Select", "1/2/3/4/5" },
				{ "Area of improvement", "Multi Select",
						"Service Quality/Communication/Delivery Process" } };
		InputFile file = new InputFile();
		try {
			assertArrayEquals(expected, file.getQueStrings());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
