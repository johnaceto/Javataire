import java.util.Random;

public class Deck {
    public static Cards[] deck = new Cards[52];

    public Deck(){
        initializeDeck();
        shuffleDeck();
    }

    private void initializeDeck(){
        int suitCount = 4;
        int valueCount = 13;

        int deckCounter = 0;
        for(int i = 0; i < valueCount; i++){
            for(int j = 0; j < suitCount; j++){
                Cards card = new Cards();
                card.suit = i;
                card.value = j;
                deck[deckCounter] = card;
                deckCounter++;
            }
        }
    }

    private void shuffleDeck(){
        Random random = new Random();
        for(int i = 0; i < deck.length; i++){
            int r = i + random.nextInt(52 - i);

            Cards temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
    }
}
