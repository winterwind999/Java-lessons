package design_pattern_creational.abstract_factory_pattern;

public class AmexGoldValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        if (creditCard.getCardType().equals(CardType.GOLD)) {
            return true;
        }

        return false;
    }
}
