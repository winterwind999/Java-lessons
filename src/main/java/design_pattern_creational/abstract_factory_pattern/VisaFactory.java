package design_pattern_creational.abstract_factory_pattern;

public class VisaFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case CardType.GOLD: {
                return new VisaGoldCreditCard();
            }
            case CardType.PLATINUM: {
                return new VisaPlatinumCreditCard();
            }
            default:
                throw new IllegalStateException("Invalid card type: " + cardType);
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }
}
