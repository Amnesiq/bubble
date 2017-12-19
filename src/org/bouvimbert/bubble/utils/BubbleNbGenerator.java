package org.bouvimbert.bubble.utils;

public final class BubbleNbGenerator {
	public static int genLinearBblNb(int nb) {
		return nb+1;
	}
	public static int genLinearBblNb(int nb, int time) {
		return (((nb+1)/time)>1) ? (nb+1)/time : 1;
	}
	
}
