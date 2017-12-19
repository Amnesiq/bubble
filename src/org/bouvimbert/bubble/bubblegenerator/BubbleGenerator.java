package org.bouvimbert.bubble.bubblegenerator;

import java.util.List;

import org.bouvimbert.bubble.entity.Bubble;

public interface BubbleGenerator {
	
	public List<Bubble> generateBubbleList(int difficulty);
	public String rdmColor(); //A replacer qqpart de plus approprié (pe un package util)
	public void display(); // Fonction d'affichage de test
}
