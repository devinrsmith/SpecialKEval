package com.devinrsmith.specialk;

public enum Card {
    ACE_OF_SPADES(CardValue.ACE, CardSuit.SPADES),
    ACE_OF_HEARTS(CardValue.ACE, CardSuit.HEARTS),
    ACE_OF_DIAMONDS(CardValue.ACE, CardSuit.DIAMONDS),
    ACE_OF_CLUBS(CardValue.ACE, CardSuit.CLUBS),

    KING_OF_SPADES(CardValue.KING, CardSuit.SPADES),
    KING_OF_HEARTS(CardValue.KING, CardSuit.HEARTS),
    KING_OF_DIAMONDS(CardValue.KING, CardSuit.DIAMONDS),
    KING_OF_CLUBS(CardValue.KING, CardSuit.CLUBS),

    QUEEN_OF_SPADES(CardValue.QUEEN, CardSuit.SPADES),
    QUEEN_OF_HEARTS(CardValue.QUEEN, CardSuit.HEARTS),
    QUEEN_OF_DIAMONDS(CardValue.QUEEN, CardSuit.DIAMONDS),
    QUEEN_OF_CLUBS(CardValue.QUEEN, CardSuit.CLUBS),

    JACK_OF_SPADES(CardValue.JACK, CardSuit.SPADES),
    JACK_OF_HEARTS(CardValue.JACK, CardSuit.HEARTS),
    JACK_OF_DIAMONDS(CardValue.JACK, CardSuit.DIAMONDS),
    JACK_OF_CLUBS(CardValue.JACK, CardSuit.CLUBS),

    TEN_OF_SPADES(CardValue.TEN, CardSuit.SPADES),
    TEN_OF_HEARTS(CardValue.TEN, CardSuit.HEARTS),
    TEN_OF_DIAMONDS(CardValue.TEN, CardSuit.DIAMONDS),
    TEN_OF_CLUBS(CardValue.TEN, CardSuit.CLUBS),

    NINE_OF_SPADES(CardValue.NINE, CardSuit.SPADES),
    NINE_OF_HEARTS(CardValue.NINE, CardSuit.HEARTS),
    NINE_OF_DIAMONDS(CardValue.NINE, CardSuit.DIAMONDS),
    NINE_OF_CLUBS(CardValue.NINE, CardSuit.CLUBS),

    EIGHT_OF_SPADES(CardValue.EIGHT, CardSuit.SPADES),
    EIGHT_OF_HEARTS(CardValue.EIGHT, CardSuit.HEARTS),
    EIGHT_OF_DIAMONDS(CardValue.EIGHT, CardSuit.DIAMONDS),
    EIGHT_OF_CLUBS(CardValue.EIGHT, CardSuit.CLUBS),

    SEVEN_OF_SPADES(CardValue.SEVEN, CardSuit.SPADES),
    SEVEN_OF_HEARTS(CardValue.SEVEN, CardSuit.HEARTS),
    SEVEN_OF_DIAMONDS(CardValue.SEVEN, CardSuit.DIAMONDS),
    SEVEN_OF_CLUBS(CardValue.SEVEN, CardSuit.CLUBS),

    SIX_OF_SPADES(CardValue.SIX, CardSuit.SPADES),
    SIX_OF_HEARTS(CardValue.SIX, CardSuit.HEARTS),
    SIX_OF_DIAMONDS(CardValue.SIX, CardSuit.DIAMONDS),
    SIX_OF_CLUBS(CardValue.SIX, CardSuit.CLUBS),

    FIVE_OF_SPADES(CardValue.FIVE, CardSuit.SPADES),
    FIVE_OF_HEARTS(CardValue.FIVE, CardSuit.HEARTS),
    FIVE_OF_DIAMONDS(CardValue.FIVE, CardSuit.DIAMONDS),
    FIVE_OF_CLUBS(CardValue.FIVE, CardSuit.CLUBS),

    FOUR_OF_SPADES(CardValue.FOUR, CardSuit.SPADES),
    FOUR_OF_HEARTS(CardValue.FOUR, CardSuit.HEARTS),
    FOUR_OF_DIAMONDS(CardValue.FOUR, CardSuit.DIAMONDS),
    FOUR_OF_CLUBS(CardValue.FOUR, CardSuit.CLUBS),

    THREE_OF_SPADES(CardValue.THREE, CardSuit.SPADES),
    THREE_OF_HEARTS(CardValue.THREE, CardSuit.HEARTS),
    THREE_OF_DIAMONDS(CardValue.THREE, CardSuit.DIAMONDS),
    THREE_OF_CLUBS(CardValue.THREE, CardSuit.CLUBS),

    TWO_OF_SPADES(CardValue.TWO, CardSuit.SPADES),
    TWO_OF_HEARTS(CardValue.TWO, CardSuit.HEARTS),
    TWO_OF_DIAMONDS(CardValue.TWO, CardSuit.DIAMONDS),
    TWO_OF_CLUBS(CardValue.TWO, CardSuit.CLUBS)

    ;

    private final CardValue value;
    private final CardSuit suit;
    private final String abbreviation;

    Card(CardValue value, CardSuit suit) {
        this.value = value;
        this.suit = suit;
        abbreviation = value.getAbbreviation() + suit.getAbbreviation();
    }

    public CardValue getValue() {
        return value;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    @Override
    public String toString() {
        return abbreviation;
    }
}
