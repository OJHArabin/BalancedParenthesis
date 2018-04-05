package com.rabin.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.rabin.Balanced;

public class TestBalanced {

	Balanced bs= new Balanced();
	@Test
	public void testCorrectPattern() {
		assertEquals(true,bs.checkString("{[()]}"));
	}
	
	@Test
	public void testInCorrectPattern() {
		
		assertEquals(false, bs.checkString("{[(]}"));
	}
	

}
