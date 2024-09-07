package com.cybage.algorithm;

public class EncryptionAlgorithm {

	public String encryptAlgorithm(String password) {
		
		StringBuffer sb = new StringBuffer();
		sb.append('*');
		
		for(int i = 0; i < password.length(); i++) {
			
			sb.insert(0, password.charAt(i) + 0);
			sb.insert(0, '*');
		}
		
		return sb.toString();
	}
}
