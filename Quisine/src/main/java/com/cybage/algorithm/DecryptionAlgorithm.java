package com.cybage.algorithm;

public class DecryptionAlgorithm {

	public String decryptAlgorithm(String password) {
		
		StringBuffer sb = new StringBuffer();
		
		int li = 1;
		int i = 2;
		while(i < password.length()) {
			
			if(password.charAt(i) == '*') {
				
				int ch = Integer.parseInt(password.substring(li, i));
				li = i + 1;
				i = li;
				sb.insert(0, (char)ch);
			}
			
			i++;
		}
		
		return sb.toString();
	}
}
