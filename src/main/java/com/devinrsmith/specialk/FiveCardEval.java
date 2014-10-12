package com.devinrsmith.specialk;

import java.util.Iterator;

/**
 * Created by dsmith on 10/12/14.
 */
public interface FiveCardEval {
    int getRanking(Card one, Card two, Card three, Card four, Card five);
    int getRanking(Iterable<Card> cards);

    public static class Impl implements FiveCardEval {
        private static final FiveEval eval = new FiveEval();

        @Override
        public int getRanking(Card one, Card two, Card three, Card four, Card five) {
            return eval.getRankOf(one.ordinal(), two.ordinal(), three.ordinal(), four.ordinal(), five.ordinal());
        }

        @Override
        public int getRanking(Iterable<Card> cards) {
            final Iterator<Card> it = cards.iterator();
            final int ranking = getRanking(it.next(), it.next(), it.next(), it.next(), it.next());
            if (it.hasNext()) {
                throw new IllegalStateException("Too many cards");
            }
            return ranking;
        }
    }
}
