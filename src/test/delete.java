package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class delete {

	@Test
	public void test() throws Exception{
		DeleteLogic del = new DeleteLogic();
		int x = DeleteLogic.delete();
		assertEquals(1,x);
	}

}