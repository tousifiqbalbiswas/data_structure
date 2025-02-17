package ArrayDataStructure;


import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        //System.out.println(deck.toString());

        System.out.println(sortCards(deck.cards).toString());

        Card first = deck.cards.get(2);
        Card second =  deck.cards.get(10);
        System.out.println("first - " + first + " second - " + second + " bigger - " + findBiggerCard(first, second).toString());
    }

    public static ArrayList<Card> sortCards(ArrayList<Card> cards) {
        cards.sort((c1, c2) -> {
            // Sort by Suit first, then by Rank
            if (c1.getSuit() != c2.getSuit()) {
                return c1.getSuit().compareTo(c2.getSuit());
            } else {
                return c1.getRank().compareTo(c2.getRank());
            }
        });
        return cards;
    }

    public static Card findBiggerCard(Card first, Card second){
        //TODO logic


        return first;
    }
}

class DeckOfCards {

    protected final ArrayList<Card> cards;
    public DeckOfCards() {
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();
        cards = new ArrayList<Card>();
        for (int i = 0; i<suits.length; i++) {
            for(int j=0; j<ranks.length; j++){
                this.cards.add(new Card(suits[i], ranks[j]));
            }
        }
        //Shuffle after the creation
        Collections.shuffle(this.cards);
    }

    public String toString(){
        return cards.toString();
    }
}

enum Suit {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;
}

class Card {

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }


    String s="Tousif";
    public String toString(){
        return "card " + suit + " " + rank;
    }

}

enum Rank {
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING,
    ACE;
}

