package App;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	
	@Test
	public void test() {
		assertEquals("Prima valu", Prima.mainPrimaValue(18, 20), 1400.0, 0);
		assertEquals("Prima value", Prima.mainPrimaValue(17, 20), 0.0, 0);
		assertEquals("Prima value", Prima.mainPrimaValue(91, 30), 0.0, 0);
		assertEquals("Prima value", Prima.mainPrimaValue(30, 31), 0.0, 0);
	}

}