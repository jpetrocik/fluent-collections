package org.psoft.collections;

import java.util.HashMap;
import java.util.Map;

import org.psoft.collections.Maps;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestMaps extends TestCase {

	public void testMapBuilder() {
		Map<String, String> test = Maps.put("Hello", "Hola").put("World", "Mundo").map();

		Assert.assertEquals("Hola", test.get("Hello"));
		Assert.assertEquals("Mundo", test.get("World"));
	}

	public void testMapBuilderWithList() {
		HashMap<String, String> map = new HashMap<String, String>();

		Map<String, String> test = Maps.create(map).put("Hello", "Hola").put("World", "Mundo").map();

		Assert.assertEquals("Hola", test.get("Hello"));
		Assert.assertEquals("Mundo", test.get("World"));
	}

}
