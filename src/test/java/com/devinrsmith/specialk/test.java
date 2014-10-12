package com.devinrsmith.specialk;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HandEval eval = new HandEval();
		int[] holeCards = new int[] {0, 11, 37, 38};
		System.out.println("" + eval.computePreFlopEquityForSpecificHoleCards(holeCards, 2));
		eval.timeRankMethod();
	}
}
