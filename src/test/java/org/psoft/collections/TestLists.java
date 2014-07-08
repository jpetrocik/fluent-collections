package org.psoft.collections;

import java.util.ArrayList;
import java.util.List;

import org.psoft.collections.Lists;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestLists extends TestCase {

	public void testListBuilder() {
		List<String> test = Lists.add("Hello").add("World").list();

		Assert.assertEquals("Hello", test.get(0));
		Assert.assertEquals("World", test.get(1));
	}

	public void testListBuilderWithList() {
		ArrayList<String> list = new ArrayList<String>();

		List<String> test = Lists.create(list).add("Hello").add("World").list();

		Assert.assertEquals("Hello", test.get(0));
		Assert.assertEquals("World", test.get(1));
	}

}
