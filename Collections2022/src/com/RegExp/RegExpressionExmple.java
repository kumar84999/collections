package com.RegExp;

public class RegExpressionExmple {
public static void main(String[] args) {
	System.out.println("Cat".matches ("cat"));
	System.out.println("cat".matches("C[at]"));
	System.out.println("cat".matches("c[at]"));
	System.out.println("cat".matches("[c]at"));
	System.out.println("Cat".matches("[cC]at"));
	System.out.println("bat".matches("[cC]at"));
	System.out.println("bat".matches("[cCb]at"));
	System.out.println("Bat".matches("[cCb]at"));
	System.out.println("Bat".matches("[cCbB]at"));
	System.out.println("kat".matches("[aA-gG]at"));
	System.out.println("bat".matches("[^c]at"));
	System.out.println("_at".matches("[aA-gG]at"));

	System.out.println("1at".matches("[aA-gG]at"));

	System.out.println("_at".matches("[\\w]at"));
	System.out.println(" at".matches("[\\d]at"));
	System.out.println(" at".matches("[\\s]at"));

	System.out.println("   at".matches("[\\s]*at"));

	System.out.println(" at".matches("[\\s]?at"));
	String phoneNumber="888 888 8888";
	System.out.println(phoneNumber.matches(""));

	System.out.println(".at".matches("[\\s.]?at"));
	System.out.println("-at".matches("[\\s.-]?at"));
	System.out.println(" at".matches("[\\s.-]?at"));

	String phoneNumber1 = "888.888.8888";

//	System.out.println(phoneNumber.matches("(\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{4})"));
}

}


