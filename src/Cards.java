public class Cards {
    public int value;
    public int suit;

    public enum suits{
        DIAMONDS, HEARTS, SPADES, CLUBS
    }

    public Cards(int value, int suit){
        this.value = value;
        this.suit = suit;
    }

    public Cards(){}
}
