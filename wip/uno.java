import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

enum Color{
    RED,
    GREEN,
    YELLOW,
    BLUE,
    WILD
};

enum Rank{
    ZERO,
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    DRAW2,
    DRAW4,
    SKIP,
    REVERSE
}

class Uno {

    public static class Card {

        private Color color;
        private Rank rank;

        public Card(Color color, Rank rank){
            this.color = color;
            this.rank = rank;
        }

        public String toString(){
            return color + ":" + rank;
        }

        public Color getColor(){
            return color;
        }

        public Rank getRank(){
            return rank;
        }
    }

    public static class Pile {
        private ArrayList<Card> contents;

        public Pile(){
            contents = new ArrayList<Card>();
        }

        public Card getTopCard(){
            if(contents != null && !contents.isEmpty())
                return contents.get(contents.size()-1);
            else
                return null;
        }

        public void addCard(Card card){
            contents.add(card);
        }

        public void addCards(ArrayList<Card> cards){
            contents.addAll(cards);
        }

        public void shuffleContents(){
            Collections.shuffle(contents);
        }

        public Card drawOne(){
            return contents.remove(contents.size() - 1);
        }

        public ArrayList<Card> drawMultiple(int numToDraw){
            ArrayList<Card> result = new ArrayList<Card>();
            if(numToDraw > contents.size())
                return null; // fix later
            for(int i = 0; i < numToDraw; i++){
                result.add(contents.remove(contents.size()-1));
            }
            return result;
        }

        public void generateDeck(){
            /*
                implement two of each 0-9,
                four of each specialty,
                per color
            */
            for(Color color : Color.values()){
                for(Rank rank : Rank.values()){
                    // wilds are only specials
                    if(color == Color.WILD){
                        if(rank == Rank.DRAW2 || rank == Rank.DRAW4 || rank == Rank.SKIP || rank == Rank.REVERSE){
                            contents.add(new Card(color, rank));
                            contents.add(new Card(color, rank));
                            contents.add(new Card(color, rank));
                            contents.add(new Card(color, rank));
                        }
                        // 4 of each colored special
                    } else if(rank == Rank.DRAW2 || rank == Rank.DRAW4 || rank == Rank.SKIP || rank == Rank.REVERSE){
                        contents.add(new Card(color, rank));
                        contents.add(new Card(color, rank));
                        contents.add(new Card(color, rank));
                        contents.add(new Card(color, rank));
                        // 2 of each colored number
                    } else{
                        contents.add(new Card(color, rank));
                        contents.add(new Card(color, rank));
                    }
                }
            }
        }

        public void printContents(){
            printHand(contents);
        }
    }

    public static void main(String[] args) {
        Card card1 = new Card(Color.RED, Rank.TWO);
        Pile deck = new Pile();
        Pile playedCards = new Pile();
        deck.generateDeck();
        deck.shuffleContents();
        // deck.printContents();

        ArrayList<Card> yourHand = deck.drawMultiple(7);
        ArrayList<Card> computerHand = deck.drawMultiple(7);
        Scanner keyboard = new Scanner(System.in);
        // printHand(yourHand);
        // printHand(computerHand);
        // deck.printContents();
        playedCards.addCards(deck.drawMultiple(1));
        while(!yourHand.isEmpty() && !computerHand.isEmpty()){
            Card topCard = playedCards.getTopCard();
            System.out.println("Card on top of pile: " + topCard.toString());
            System.out.println("Your hand: ");
            printHand(yourHand);
            Card selectedCard = null;
            String choice = null;
            Color color = null;
            Rank rank = null;
            do{
                System.out.println("\nEnter color of card to play (r, g, b, y, w) or 'p' if no cards can be played: ");
                choice = keyboard.nextLine();
                if(choice.equals("p")) break;
                color = inputToColor(choice);
                if(color != null){
                    System.out.println("Enter rank of card to play (0-9, d2, d4, sk, rv): ");
                    choice = keyboard.nextLine();
                    rank = inputToRank(choice);
                    if(rank != null){
                        for (Card c : yourHand){
                            if(c.getColor() == color && c.getRank() == rank){
                                selectedCard = c;
                                break;
                            }
                        }
                    }
                }
            } while(selectedCard == null || !selectedCardIsValid(selectedCard, topCard));
            if(selectedCard == null) {
                System.out.println("You passed.");
                Card drawn = deck.drawOne();
                yourHand.add(drawn);
                System.out.println("You drew: " + drawn.toString());
            }
            else{
                System.out.println("You played: " + selectedCard.toString());
                playedCards.addCard(selectedCard);
                yourHand.remove(selectedCard);
            }
        }
    }

    public static Color inputToColor(String input){
        if(input.equals("r")) return Color.RED;
        else if(input.equals("g")) return Color.GREEN;
        else if(input.equals("b")) return Color.BLUE;
        else if(input.equals("y")) return Color.YELLOW;
        else if(input.equals("w")) return Color.WILD;
        else return null;
    }

    public static Rank inputToRank(String input){
        if(input.equals("0")) return Rank.ZERO;
        else if(input.equals("1")) return Rank.ONE;
        else if(input.equals("2")) return Rank.TWO;
        else if(input.equals("3")) return Rank.THREE;
        else if(input.equals("4")) return Rank.FOUR;
        else if(input.equals("5")) return Rank.FIVE;
        else if(input.equals("6")) return Rank.SIX;
        else if(input.equals("7")) return Rank.SEVEN;
        else if(input.equals("8")) return Rank.EIGHT;
        else if(input.equals("9")) return Rank.NINE;
        else if(input.equals("d2")) return Rank.DRAW2;
        else if(input.equals("d4")) return Rank.DRAW4;
        else if(input.equals("sk")) return Rank.SKIP;
        else if(input.equals("rv")) return Rank.REVERSE;
        else return null;
    }

    public static boolean selectedCardIsValid(Card selectedCard, Card topCard){
        if(selectedCard.color == Color.WILD || topCard.color == Color.WILD)
            return true;
        else if(selectedCard.color == topCard.color || selectedCard.rank == topCard.rank)
            return true;
        else
            return false;
    }

    public static void printHand(ArrayList<Card> hand){
        System.out.print("[");
        for(Card card : hand){
            System.out.print(card.toString() + ",");
        }
        System.out.println("]");
    }
}
