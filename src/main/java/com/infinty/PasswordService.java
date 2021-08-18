package com.infinty;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PasswordService {
	public String passwordEncrypt(String str) {
		Encoder encoder = Base64.getEncoder();
		byte[] bytes=str.getBytes();
		String encoded=encoder.encodeToString(bytes);
		return encoded;
	}
}
