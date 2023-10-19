package com.prog2.labs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class LabFourteenTests {

	@Test
	void decoratorTest1() {
		Dragon dragon = new Dragon();
		dragon.setAge(0);

		assertEquals("too young", dragon.crawl());
		assertEquals("flying", dragon.fly());

		dragon.setAge(100);

		assertEquals("crawling", dragon.crawl());
		assertEquals("too old", dragon.fly());
	}

}