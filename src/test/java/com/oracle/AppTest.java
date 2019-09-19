package com.oracle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {
	private TestClass t = new TestClass(); 
	@Test
	void test() {
		assertEquals("sample string", t.Sample());
	}

}
