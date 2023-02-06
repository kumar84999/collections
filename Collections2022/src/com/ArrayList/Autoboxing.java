package com.ArrayList;

public class Autoboxing {
public static void main(String[] args) {
	int a=123;
	//Integer integer =new Integer(a);
	System.out.println(Integer.valueOf(a));
	Integer integer=new Integer(10);
	int b=integer;
	System.out.println(b);
}

}
