package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Insert {

	@Test
		public void test() throws Exception{
		InsertLogic del = new InsertLogic();
		int x = InsertLogic.insert();
		assertEquals(1,x);
	}

}  