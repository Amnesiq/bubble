package org.bouvimbert.bubble.bubblegenerator.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bouvimbert.bubble.bubblegenerator.BubbleGenerator;
import org.bouvimbert.bubble.bubblenbgenerator.BubbleNbGenerator;
import org.bouvimbert.bubble.entity.Bubble;

public class BubbleGeneratorImpl implements BubbleGenerator {
	private List<Bubble> current=null;
	private int lastIndex=0;
	@Override
	public List<Bubble> generateBubbleList(int difficulty) {
		current = new ArrayList<Bubble>();
		int nbBubble =  BubbleNbGenerator.genLinearBubbleNb(difficulty);
		int i = 0;
		for(i=lastIndex;i<lastIndex+nbBubble;i++) {
			if(i==1) {
				current.add(new Bubble(i+1,"Verte"));
			}
			else {
				current.add(new Bubble(i+1,rdmColor()));
			}
		}
		lastIndex=i;
		return current;
	}
	
	@Override
	public String rdmColor() {
		double rdm = Math.random();
		if(rdm<0.50)
			return "Verte";
		else
			return "Rouge";
	}
	@Override
	public void display() {
		Iterator<Bubble> ite = current.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next().toString());
		}
	}
}
