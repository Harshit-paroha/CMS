package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class update {

	@Test
	public void test() throws Exception{
		UpdateLogic del = new UpdateLogic();
		int x = UpdateLogic.update();
		assertEquals(1,x);
	}

}   