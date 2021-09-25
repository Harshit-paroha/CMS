package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class select {
 
	@Test
	public void test() throws Exception{
		SelectLogic del = new SelectLogic();
		int x = SelectLogic.select();
		assertEquals(1,x);
	} 

}   