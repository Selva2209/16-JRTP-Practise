package com.infinity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.infinty.PasswordService;

public class TestPasswordService {

	@Test
	public void testPasswordEncrpyt(String str) {
		PasswordService ser=new PasswordService();
		String actual="U2VsdmFrdW1hcg";
		String expected=ser.passwordEncrypt("Selvakumar");
		assertEquals(actual,expected);
	}
	
}
