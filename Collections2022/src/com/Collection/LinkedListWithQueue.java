package com.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListWithQueue {
	public static void main(String[] args) {
		Queue<Integer>banktokens=new LinkedList<>();
		banktokens.add(100);
		banktokens.add(101);
		banktokens.add(102);
		banktokens.add(103);
		banktokens.add(104);
		banktokens.add(105);
		banktokens.add(106);
		banktokens.add(107);
		System.out.println(banktokens);
		System.out.println("get the first banktokens from the queue:"+banktokens.peek());
		System.out.println("remove the bank tokens from the queue:"+banktokens.remove());
		System.out.println(banktokens);
		System.out.println("remove the second banktoken from the quequ:"+banktokens.poll());
		System.out.println(banktokens);
		
	}

}
