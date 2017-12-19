package org.bouvimbert.bubble.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.bouvimbert.bubble.entity.Bubble;
import org.bouvimbert.bubble.service.BubbleGenerator;
import org.bouvimbert.bubble.utils.BubbleNbGenerator;

public class BubbleGeneratorImpl implements BubbleGenerator {
	private HashMap<String,List<Bubble>> current=null;
	private int lastIndex=0;
	
	public BubbleGeneratorImpl() {
		current = new HashMap<String,List<Bubble>>();
	}
	
	@Override
	public HashMap<String,List<Bubble>> generateBubbleList(int difficulty) {
		List<Bubble> lbV = new ArrayList<Bubble>();
		List<Bubble> lbR = new ArrayList<Bubble>();
		int nbBubble =  BubbleNbGenerator.genLinearBblNb(difficulty);
		int i = 0;
		for(i=lastIndex;i<lastIndex+nbBubble;i++) {
			if(i==lastIndex) {
				lbV.add(new Bubble(i,"Verte"));
			}
			else {
				String color=rdmColor();
				if(color=="Verte")
					lbV.add(new Bubble(i,color));
				if(color=="Rouge")
					lbR.add(new Bubble(i,color));
			}
		}
		current.put("Rouge", lbR);
		current.put("Verte", lbV);
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
		Set<Entry<String,List<Bubble>>> set = current.entrySet();
		Iterator<Entry<String,List<Bubble>>> ite = set.iterator();
		while(ite.hasNext()) {
			Entry<String,List<Bubble>> e = ite.next();
			System.out.println(e.getKey() + " "+e.getValue());
		}
	}
}
