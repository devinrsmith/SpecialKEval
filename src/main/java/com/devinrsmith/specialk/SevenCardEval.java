package com.devinrsmith.specialk;

import java.util.Iterator;

/**
 * Created by dsmith on 10/12/14.
 */
public interface SevenCardEval {
    int getRanking(Card one, Card two, Card three, Card four, Card five, Card six, Card seven);
    int getRanking(Iterable<Card> cards);

    public static class Impl implements SevenCardEval {
        private static final SevenEval eval = new SevenEval();

        @Override
        public int getRanking(Card one, Card two, Card three, Card four, Card five, Card six, Card seven) {
            return eval.getRankOf(one.ordinal(), two.ordinal(), three.ordinal(), four.ordinal(), five.ordinal(), six.ordinal(), seven.ordinal());
        }

        @Override
        public int getRanking(Iterable<Card> cards) {
            final Iterator<Card> it = cards.iterator();
            final int ranking = getRanking(it.next(), it.next(), it.next(), it.next(), it.next(), it.next(), it.next());
            if (it.hasNext()) {
                throw new IllegalStateException("Too many cards");
            }
            return ranking;
        }
    }
}
