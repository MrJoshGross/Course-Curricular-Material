// Online Java Compiler
// Use this editor to write, compile and run your Java code online

    import java.util.ArrayList;
    import java.util.Collections;
    
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
    

class HelloWorld {
    
    public static class Card {
        
        private Color color;
        private Rank rank;
        
        public Card(Color color, Rank rank){
            this.color = color;
            this.rank = rank;
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
            System.out.print("Deck contents: [");
            for(Card c : contents){
                System.out.print(c.getColor() + ":" + c.getRank() + ", ");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        Card card1 = new Card(Color.RED, Rank.TWO);
        System.out.println("Color: " + card1.getColor() + " | Rank: " + card1.getRank());
        Pile p = new Pile();
        p.generateDeck();
        p.printContents();
    }
}