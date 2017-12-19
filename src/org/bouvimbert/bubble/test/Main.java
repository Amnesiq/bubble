package org.bouvimbert.bubble.test;

import org.bouvimbert.bubble.service.BubbleGenerator;
import org.bouvimbert.bubble.service.impl.BubbleGeneratorImpl;

public class Main {

	public static void main(String[] args) {
		BubbleGenerator bbg = new BubbleGeneratorImpl();
		for(int i=0;i<10;i++) {
			bbg.generateBubbleList(i);
			System.out.println("----- Liste "+(i+1)+" -----");
			bbg.display();
		}
		
	}

}
