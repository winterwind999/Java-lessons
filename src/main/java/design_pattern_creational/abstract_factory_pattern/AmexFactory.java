package design_pattern_creational.abstract_factory_pattern;

public class AmexFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case CardType.GOLD: {
                return new AmexGoldCreditCard();
            }
            case CardType.PLATINUM: {
                return new AmexPlatinumCreditCard();
            }
            default:
                throw new IllegalStateException("Invalid card type: " + cardType);
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case CardType.GOLD: {
                return new AmexGoldValidator();
            }
            case CardType.PLATINUM: {
                return new AmexPlatinumValidator();
            }
            default:
                throw new IllegalStateException("Invalid card type: " + cardType);
        }
    }
}
