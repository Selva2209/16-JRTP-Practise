package com.infinty.main;

import com.infinty.*;

public class MainClass {
	public static void main(String[] args) {
		PasswordService service = new PasswordService();
		String encodedvalue = service.passwordEncrypt("Selvakumar");
		System.out.println(encodedvalue);
	}
}