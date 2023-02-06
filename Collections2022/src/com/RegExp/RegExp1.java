package com.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 {
	public static void main(String[] args, String regex) {
		String phonenumber="849 999 9557";
		String regx ="(\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{4})";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(phonenumber);
		if (matcher.matches()) {
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
			
		}
	}

}
