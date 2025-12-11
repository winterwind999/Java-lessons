package design_pattern_creational.abstract_factory_pattern;

public class CreditCard {
    private CardType cardType;
    private int creditScore;

    public CreditCard() {
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
}
